/*
 * Copyright 2006-2023 Prowide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.ProwideException;
import com.prowidesoftware.deprecation.DeprecationUtils;
import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;
import com.prowidesoftware.swift.model.DistinguishedName;
import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.SettlementInfo;
import com.prowidesoftware.swift.model.SettlementMethod;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.utils.SafeXmlUtils;
import jakarta.xml.bind.*;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.sax.SAXSource;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.Validate;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

/**
 * This class provides utility methods to parse XML content using a fast event based API (no DOM) and to extract
 * specific information from the XML content.
 *
 * @since 9.1.2
 */
public class MxParseUtils {
    private static final Logger log = Logger.getLogger(MxParseUtils.class.getName());
    private static final String regex = "^(/|//)([a-zA-Z_][\\w\\-.]*)(/([a-zA-Z_][\\w\\-.]*))*$";
    private static final Pattern pattern = Pattern.compile(regex);
    /**
     * Creates a {@link SAXSource} for the given XML, filtering a specific element with the
     * {@link NamespaceAndElementFilter}.
     *
     * @param xml       the whole XML element
     * @param localName the specific element of the subtree to propagate (normally would be Document or AppHdr)
     * @return a safe source
     * @since 9.2.1
     */
    static SAXSource createFilteredSAXSource(final String xml, final String localName) {
        return createFilteredSAXSource(new StringReader(xml), localName);
    }

    /**
     * Variant of {@link #createFilteredSAXSource(String, String)} reading from a character stream, so lenient
     * payload views can be parsed without materializing a normalized copy of the XML.
     *
     * @since 10.3.10
     */
    static SAXSource createFilteredSAXSource(final java.io.Reader source, final String localName) {
        XMLReader documentReader = SafeXmlUtils.reader(true, null);

        NamespaceAndElementFilter documentFilter = new NamespaceAndElementFilter(localName);
        documentFilter.setParent(documentReader);

        InputSource documentInputSource = new InputSource(source);

        return new SAXSource(documentFilter, documentInputSource);
    }

    /**
     * Parse an object from an event reader.
     *
     * <p>IMPORTANT: the event must be positioned at the element to parse. And the xml must be filtered without ISO
     * namespaces and prefixes.
     *
     * @param source      the SaxSource to parse
     * @param targetClass the class of the object being parsed
     * @param classes     the object classes to build a jaxb context
     * @param params      not null unmarshalling parameters
     * @return parsed element or null if the source cannot be parsed
     * @throws ProwideException if severe errors occur during parse
     * @since 9.2.6
     */
    static Object parseSAXSource(
            final SAXSource source, final Class targetClass, final Class<?>[] classes, final MxReadParams params) {
        Objects.requireNonNull(targetClass, "target class to parse must not be null");
        Objects.requireNonNull(source, "SAXSource to parse must not be null");
        Objects.requireNonNull(classes, "object model classes array must not be null");
        Objects.requireNonNull(params, "unmarshalling params cannot be null");

        try {
            JAXBContext context;
            if (params.context != null) {
                context = params.context;
            } else {
                context = JaxbContextLoader.INSTANCE.get(targetClass, classes);
            }

            final Unmarshaller unmarshaller = context.createUnmarshaller();

            if (params.adapters != null) {
                for (XmlAdapter adapter : params.adapters.asList()) {
                    unmarshaller.setAdapter(adapter);
                }
            }

            JAXBElement element = unmarshaller.unmarshal(source, targetClass);
            if (element != null) {
                return element.getValue();
            }

        } catch (JAXBException | ExecutionException e) {
            handleParseException(e);
        }
        return null;
    }

    static void handleParseException(Exception e) {
        if (e instanceof UnmarshalException) {
            final Throwable cause = e.getCause();
            if (cause instanceof SAXParseException) {
                SAXParseException spe = (SAXParseException) cause;
                throw new ProwideException(
                        "Error parsing message at line " + spe.getLineNumber() + ", column " + spe.getColumnNumber(),
                        cause);
            } else {
                throw new ProwideException("Error parsing message", cause);
            }
        }
        if (e instanceof XMLStreamException) {
            throw new ProwideException("Error parsing message: " + e.getMessage());
        }
        log.log(Level.SEVERE, "An error occurred while reading XML: " + e.getMessage(), e);
    }

    /**
     * Parse an object from XML with optional wrapper and sibling elements that will be ignored.
     *
     * @param targetClass class of the object being parsed
     * @param xml         the XML content, can contain wrapper elements that will be ignored
     * @param classes     the object classes to build a jaxb context
     * @param localName   the specific element to parse within the parameter XML
     * @param params      not null unmarshalling parameters
     * @return parsed element or null if content cannot be parsed
     * @throws ProwideException if severe errors occur during parse
     * @since 9.2.6
     */
    static Object parse(
            final Class targetClass,
            final String xml,
            final Class<?>[] classes,
            final String localName,
            final MxReadParams params) {
        Objects.requireNonNull(targetClass, "target class to parse must not be null");
        Objects.requireNonNull(xml, "XML to parse must not be null");
        Validate.notBlank(xml, "XML to parse must not be a blank string");
        Objects.requireNonNull(classes, "object model classes aray must not be null");
        Validate.notBlank(localName, "The XML element to parse must not be null nor a blank string");
        Objects.requireNonNull(params, "unmarshalling params cannot be null");

        try {
            SAXSource saxSource = createFilteredSAXSource(xml, localName);
            return parseSAXSource(saxSource, targetClass, classes, params);

        } catch (final Exception e) {
            handleParseException(e);
            return null;
        }
    }

    /**
     * Distinguished Name structure: cn=name,ou=payment,o=bank,o=swift
     * <br>
     * Example: o=spxainjj,o=swift
     *
     * @param dn the DN element content
     * @return returns capitalized "bank", in the example SPXAINJJ
     */
    public static String getBICFromDN(final String dn) {
        return DistinguishedName.parseBIC(dn);
    }

    /**
     * Parses a standalone JAXB element from XML, ignoring any wrapper elements.
     *
     * <p>This method is useful for parsing SWIFTNet infrastructure elements such as {@code SwIntWaitResponse},
     * {@code SwIntHandleResponse}, or other elements that may appear in non-standard wrapper structures outside
     * the typical ISO 20022 Document/AppHdr pattern.
     *
     * <p>The parser uses SAX filtering to extract only the specified element from the XML, making it efficient
     * even when processing large documents with multiple wrapper levels.
     *
     * <p><b>Important:</b> For JAXB classes that only have {@code @XmlType} annotation (not {@code @XmlRootElement}),
     * such as {@code SwIntWaitResponse}, you may need to create a wrapper class with {@code @XmlRootElement} annotation
     * in your project. Example:
     * <pre>
     * &#64;XmlRootElement(name = "WaitResponse", namespace = "urn:swift:snl:ns.SwInt")
     * &#64;XmlAccessorType(XmlAccessType.FIELD)
     * public class WaitResponseWrapper {
     *     &#64;XmlElement(name = "SwiftRequestRef")
     *     private String swiftRequestRef;
     *     // getters and setters, plus any other fields you need
     * }
     *
     * // Then use it:
     * String xml = "&lt;Data&gt;&lt;WaitResponse xmlns=\"urn:swift:snl:ns.SwInt\"&gt;...&lt;/WaitResponse&gt;&lt;/Data&gt;";
     * WaitResponseWrapper response = MxParseUtils.parseElement(
     *     WaitResponseWrapper.class,
     *     xml,
     *     "WaitResponse",
     *     new Class&lt;?&gt;[] { WaitResponseWrapper.class }
     * );
     * </pre>
     *
     * @param <T> the type of the element being parsed
     * @param targetClass the class to parse (must have {@code @XmlRootElement} or be wrapped in a class that does)
     * @param xml the XML content, may contain wrapper elements that will be ignored
     * @param elementName the local name of the element to extract and parse (e.g., "WaitResponse")
     * @param classes the JAXB context classes array, typically contains the target class and its dependencies
     * @return parsed element or null if the content cannot be parsed or the element is not found
     * @throws ProwideException if severe errors occur during parse
     * @throws NullPointerException if any parameter is null
     * @throws IllegalArgumentException if xml or elementName are blank
     * @since 10.2.10
     * @see #parseElement(Class, String, String, Class[], MxReadParams)
     */
    public static <T> T parseElement(
            final Class<T> targetClass, final String xml, final String elementName, final Class<?>[] classes) {
        return parseElement(targetClass, xml, elementName, classes, new MxReadParams());
    }

    /**
     * Parses a standalone JAXB element from XML with custom unmarshalling parameters.
     *
     * <p>This is an overloaded version of {@link #parseElement(Class, String, String, Class[])} that accepts
     * custom {@link MxReadParams} for controlling the unmarshalling behavior (e.g., custom adapters, JAXB context).
     *
     * @param <T> the type of the element being parsed
     * @param targetClass the class to parse
     * @param xml the XML content, may contain wrapper elements that will be ignored
     * @param elementName the local name of the element to extract and parse
     * @param classes the JAXB context classes array
     * @param params unmarshalling parameters for customizing the parse behavior
     * @return parsed element or null if the content cannot be parsed or the element is not found
     * @throws ProwideException if severe errors occur during parse
     * @throws NullPointerException if any parameter is null
     * @throws IllegalArgumentException if xml or elementName are blank
     * @since 10.2.10
     */
    @SuppressWarnings("unchecked")
    public static <T> T parseElement(
            final Class<T> targetClass,
            final String xml,
            final String elementName,
            final Class<?>[] classes,
            final MxReadParams params) {
        return (T) parse(targetClass, xml, classes, elementName, params);
    }

    /**
     * Takes an XML with an MX message and detects the specific message type parsing just the namespace from the
     * Document element. If the Document element is not present, or without the namespace or if the namespace url
     * contains invalid content, then attempts to identify the message from the AppHdr. From the header tries to
     * get the message type from the 'MsgDefIdr' that is present in the Business Application Header, and if that
     * is not present tries to get the 'MsgName' assuming it is a legacy Application Header. If none of the above
     * is present or cannot be parsed, then returns empty.
     *
     * <p>
     * Example of a recognizable Document element:<br>
     * &lt;Doc:Document xmlns:Doc="urn:swift:xsd:camt.003.001.04" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;
     *
     * <p>
     * The implementation is intended to be lightweight and efficient, based on {@link XMLStreamReader}
     *
     * @param xml the XML content to identify
     * @return id with the detected MX message type or empty if it cannot be determined
     */
    public static Optional<MxId> identifyMessage(final String xml) {
        return identifyMessage(lenientPayload(xml));
    }

    /**
     * Implementation of {@link #identifyMessage(String)} over an already built lenient payload view; each scan
     * streams a fresh reader so payloads with sibling AppHdr and Document roots can be identified from the Document
     * namespace without materializing the wrapped content.
     */
    static Optional<MxId> identifyMessage(final LenientPayload payload) {
        Optional<String> namespace =
                NamespaceReader.findNamespaceForLocalName(payload.lenientReader(), AbstractMX.DOCUMENT_LOCALNAME);
        if (namespace.isPresent()) {
            return enrichBusinessService(namespace.map(MxId::new).orElse(null), payload);
        }

        // if the Document does not have a namespace, try to identify the message from the header
        Optional<String> element = findByTags(payload.lenientReader(), "MsgDefIdr");
        if (!element.isPresent()) {
            // Legacy ahv10 header
            element = findByTags(payload.lenientReader(), "MsgName");
        }
        if (element.isPresent()) {
            return enrichBusinessService(new MxId(element.get()), payload);
        }

        return Optional.empty();
    }

    private static Optional<MxId> enrichBusinessService(MxId mxId, final LenientPayload payload) {
        if (mxId == null) {
            return Optional.empty();
        }
        Optional<String> element = findByTags(payload.lenientReader(), "BizSvc");
        if (element.isPresent()) {
            mxId.setBusinessService(element.get());
        }
        return Optional.of(mxId);
    }

    /**
     * Wraps the XML with a {@code <RequestPayload>} root element when the content starts with an
     * {@code AppHdr} element (with or without a namespace prefix) that has sibling content after it. This prevents
     * "Illegal to have multiple roots" errors that occur when the XML contains both
     * {@code AppHdr} and {@code Document} elements at the same level without a common root.
     *
     * <p>Matches {@code <AppHdr>}, {@code <prefix:AppHdr>}, and the same forms preceded by an
     * optional XML declaration. Content that is already a well-formed single rooted document — including a
     * standalone {@code AppHdr} document or content already wrapped in an envelope — is returned unchanged.
     *
     * @param xml original XML content
     * @return XML wrapped in {@code <RequestPayload>...</RequestPayload>}, or the original if wrapping is not needed
     * @since 10.3.10
     */
    public static String wrapIfAppHdrRoot(String xml) {
        if (xml == null) return null;
        return new LenientPayload(xml, wrapPosition(xml)).materialize();
    }

    /**
     * Returns the offset where a synthetic wrapper open tag must be inserted (right after the prolog: BOM, XML
     * declaration, PIs, comments) when the first element is an AppHdr with sibling content after it, or -1 when no
     * wrapping is needed. The prolog must stay outside the wrapper element, otherwise the result is not well-formed
     * (a PI target "xml" is illegal after document start). A standalone single rooted AppHdr document is NOT
     * wrapped: it is already parseable and consumers may rely on the AppHdr being the tree root.
     */
    private static int wrapPosition(String xml) {
        int rootStart = prologEnd(xml);
        if (rootStart < 0 || !isAppHdrTag(xml, rootStart)) {
            return -1;
        }
        return hasElementAfterFirstRoot(xml, rootStart) ? rootStart : -1;
    }

    /**
     * Returns the index of the first element tag, skipping the prolog: optional BOM, XML declaration and other
     * processing instructions, comments and whitespace. Returns -1 when no element tag follows the prolog or the
     * prolog is malformed (unclosed processing instruction or comment, text content before any element).
     *
     * <p>Implemented as an iterative scan on purpose: a regex over the prolog recurses per token (risking a stack
     * overflow on many leading comments) and backtracks into the payload when the first tag does not match,
     * degrading the non-matching case — a regular Document-rooted message — to a full payload scan.
     */
    private static int prologEnd(String xml) {
        final int n = xml.length();
        int i = 0;
        if (i < n && xml.charAt(i) == '\uFEFF') {
            i++;
        }
        while (i < n) {
            char c = xml.charAt(i);
            if (Character.isWhitespace(c)) {
                i++;
            } else if (xml.startsWith("<?", i)) {
                int end = xml.indexOf("?>", i + 2);
                if (end < 0) {
                    return -1;
                }
                i = end + 2;
            } else if (xml.startsWith("<!--", i)) {
                int end = xml.indexOf("-->", i + 4);
                if (end < 0) {
                    return -1;
                }
                i = end + 3;
            } else if (c == '<') {
                return i;
            } else {
                return -1;
            }
        }
        return -1;
    }

    /**
     * Checks whether the tag starting at {@code lt} (pointing to a {@code '<'}) opens an AppHdr element, with an
     * optional single namespace prefix: {@code <AppHdr}, {@code <prefix:AppHdr}, followed by whitespace, the tag
     * close or a self-closing mark.
     */
    private static boolean isAppHdrTag(String xml, int lt) {
        final int n = xml.length();
        int p = lt + 1;
        int start = p;
        while (p < n && xml.charAt(p) != ':' && isXmlNameChar(xml.charAt(p))) {
            p++;
        }
        if (p < n && xml.charAt(p) == ':') {
            // prefixed name: the prefix must be a valid name, the local part follows the colon
            if (p == start || !(Character.isLetter(xml.charAt(start)) || xml.charAt(start) == '_')) {
                return false;
            }
            start = ++p;
            while (p < n && xml.charAt(p) != ':' && isXmlNameChar(xml.charAt(p))) {
                p++;
            }
        }
        return p - start == AppHdr.HEADER_LOCALNAME.length()
                && xml.startsWith(AppHdr.HEADER_LOCALNAME, start)
                && p < n
                && (Character.isWhitespace(xml.charAt(p)) || xml.charAt(p) == '>' || xml.charAt(p) == '/');
    }

    /**
     * Checks whether another element tag follows the first root element, meaning the content has multiple roots
     * and needs a synthetic wrapper. The scan is bounded to the first root subtree (the AppHdr, which is small)
     * plus any trailing comments or processing instructions.
     */
    private static boolean hasElementAfterFirstRoot(String xml, int rootStart) {
        final int n = xml.length();
        int depth = 0;
        int i = rootStart;
        while (i < n) {
            int lt = xml.indexOf('<', i);
            if (lt < 0) {
                return false;
            }
            int skipped = skipNonElementMarkup(xml, lt);
            if (skipped > lt) {
                i = skipped;
                continue;
            }
            if (depth == 0 && lt > rootStart) {
                // the first root is closed and another element starts: multiple roots
                return true;
            }
            boolean closing = lt + 1 < n && xml.charAt(lt + 1) == '/';
            int tagEnd = skipToTagEnd(xml, lt + 1);
            boolean selfClosing = !closing && tagEnd - 2 > lt && xml.charAt(tagEnd - 2) == '/';
            if (closing) {
                depth--;
            } else if (!selfClosing) {
                depth++;
            }
            i = tagEnd;
        }
        return false;
    }

    /**
     * Builds the lenient view of the payload: undeclared AppHdr/Document prefixes stripped, and the virtual
     * wrapper position resolved. Package internals parse through the view's readers to avoid materializing a
     * wrapped copy of the payload.
     */
    static LenientPayload lenientPayload(String xml) {
        String stripped = stripUndeclaredPrefixes(xml, AbstractMX.DOCUMENT_LOCALNAME, AppHdr.HEADER_LOCALNAME);
        return new LenientPayload(stripped, wrapPosition(stripped));
    }

    /**
     * Returns a fresh {@link java.io.Reader} exposing the content through the same lenient normalizations of
     * {@link #normalizeLenientPayload(String)} without materializing a normalized copy: when a synthetic
     * {@code <RequestPayload>} wrapper is needed it is composed virtually around the original payload characters.
     *
     * @param xml original XML content
     * @return a single-use reader over the normalized content
     * @since 10.3.10
     */
    public static java.io.Reader normalizedReader(String xml) {
        Objects.requireNonNull(xml, "XML must not be null");
        return lenientPayload(xml).reader();
    }

    /**
     * Strips an undeclared namespace prefix from element tags when the {@code Document} element uses a prefix
     * that is not declared with a corresponding {@code xmlns:prefix="..."} anywhere in the XML.
     *
     * <p>For example, {@code <ns2:Document>} where {@code ns2} has no declaration anywhere in the XML will have
     * the prefix stripped from all start and end element tags, producing {@code <Document>}. This allows lenient
     * SAX-based parsing of XML produced by systems that omit namespace declarations (for example when a payload is
     * extracted from an envelope where the prefix was declared in a stripped ancestor element).
     *
     * <p>The implementation is structure-aware: only actual element tags are considered and rewritten, content
     * inside CDATA sections, comments and processing instructions is never modified. The candidate prefix is taken
     * from the first {@code Document} element found in the markup, so a {@code <prefix:Document} occurrence inside
     * embedded text content does not trigger any rewrite. If the prefix is declared or no prefixed Document element
     * is found, the XML is returned unchanged.
     *
     * <p><b>Limitation:</b> the "is it declared?" check is intentionally conservative — it searches the whole
     * XML for any {@code xmlns:prefix="..."} declaration rather than resolving the prefix against the
     * {@code Document} element's own namespace scope. This errs on the side of leaving the XML untouched: if the
     * same prefix is declared anywhere (even in an unrelated subtree such as supplementary or signature data),
     * stripping is skipped. The trade-off is a possible missed fix, never a regression on otherwise valid XML.
     *
     * @param xml original XML content
     * @return XML with the undeclared document prefix stripped from element tags, or the original if not needed
     * @since 10.3.10
     */
    public static String stripUndeclaredDocumentPrefix(String xml) {
        if (xml == null) return null;
        return stripUndeclaredPrefixes(xml, AbstractMX.DOCUMENT_LOCALNAME);
    }

    /**
     * Applies the lenient payload normalizations required to parse MX content that is not a well-formed standalone
     * XML document: strips undeclared namespace prefixes from the {@code AppHdr} and {@code Document} elements
     * (see {@link #stripUndeclaredDocumentPrefix(String)}) and wraps sibling {@code AppHdr} plus {@code Document}
     * root elements in a synthetic {@code <RequestPayload>} envelope (see {@link #wrapIfAppHdrRoot(String)}).
     *
     * <p>Content that is already parseable is returned unchanged: both normalizations detect their trigger condition
     * with an early-exit scan of the markup, so for a regular {@code Document}-rooted message the cost is limited to
     * inspecting the first element tag, with no string copies.
     *
     * @param xml original XML content
     * @return the normalized XML, or the original instance when no normalization is needed
     * @since 10.3.10
     */
    public static String normalizeLenientPayload(String xml) {
        if (xml == null) return null;
        return lenientPayload(xml).materialize();
    }

    /**
     * Checks whether {@link #normalizeLenientPayload(String)} would return content different from the input,
     * without materializing the normalized String: undeclared namespace prefixes and the AppHdr/Document wrap
     * position are resolved the same way, but the wrapped copy is never built.
     *
     * <p>Useful when only the boolean outcome is needed, e.g. to decide a file format without paying for the
     * normalized payload.
     *
     * @param xml original XML content
     * @return true if the payload needs undeclared-prefix stripping and/or AppHdr/Document sibling-root wrapping
     * @since 10.3.10
     */
    public static boolean needsNormalization(String xml) {
        Objects.requireNonNull(xml, "XML must not be null");
        LenientPayload payload = lenientPayload(xml);
        return payload.needsWrap() || payload.xml() != xml;
    }

    /**
     * Scans the markup for the first element tag matching each of the given local names, in order to detect
     * namespace prefixes that are used but not declared anywhere in the XML, and strips those undeclared prefixes
     * from all element tags. The scan and the rewrite skip CDATA sections, comments, processing instructions and
     * DOCTYPE declarations, so text content is never modified. The scan stops at the Document element since in all
     * supported layouts the AppHdr precedes the Document content.
     */
    private static String stripUndeclaredPrefixes(String xml, String... localNames) {
        Set<String> pending = new HashSet<>(Arrays.asList(localNames));
        Set<String> prefixes = new HashSet<>();

        // find the candidate prefix for each local name, looking at actual element tags only
        int i = 0;
        final int n = xml.length();
        while (i < n && !pending.isEmpty()) {
            int lt = xml.indexOf('<', i);
            if (lt < 0) {
                break;
            }
            int skipped = skipNonElementMarkup(xml, lt);
            if (skipped > lt) {
                i = skipped;
                continue;
            }
            int p = lt + 1;
            if (p < n && xml.charAt(p) == '/') {
                p++;
            }
            int nameStart = p;
            while (p < n && isXmlNameChar(xml.charAt(p))) {
                p++;
            }
            String name = xml.substring(nameStart, p);
            int colon = name.indexOf(':');
            String localName = colon >= 0 ? name.substring(colon + 1) : name;
            if (pending.remove(localName) && colon > 0) {
                prefixes.add(name.substring(0, colon));
            }
            if (AbstractMX.DOCUMENT_LOCALNAME.equals(localName)) {
                // the Document element is the last relevant tag, no need to scan its content
                break;
            }
            i = skipToTagEnd(xml, p);
        }

        // ignore prefixes that are actually declared somewhere in the XML (conservative check, see javadoc)
        prefixes.removeIf(prefix -> isPrefixDeclared(xml, prefix));
        if (prefixes.isEmpty()) {
            return xml;
        }

        // single pass rebuild, stripping the prefixes from element tags only
        StringBuilder sb = new StringBuilder(n);
        i = 0;
        while (i < n) {
            int lt = xml.indexOf('<', i);
            if (lt < 0) {
                sb.append(xml, i, n);
                break;
            }
            sb.append(xml, i, lt);
            int skipped = skipNonElementMarkup(xml, lt);
            if (skipped > lt) {
                sb.append(xml, lt, skipped);
                i = skipped;
                continue;
            }
            int p = lt + 1;
            boolean closing = p < n && xml.charAt(p) == '/';
            if (closing) {
                p++;
            }
            String matched = null;
            for (String prefix : prefixes) {
                if (xml.startsWith(prefix, p) && p + prefix.length() < n && xml.charAt(p + prefix.length()) == ':') {
                    matched = prefix;
                    break;
                }
            }
            int tagEnd = skipToTagEnd(xml, p);
            if (matched != null) {
                sb.append(closing ? "</" : "<").append(xml, p + matched.length() + 1, tagEnd);
            } else {
                sb.append(xml, lt, tagEnd);
            }
            i = tagEnd;
        }
        return sb.toString();
    }

    /**
     * If the markup at position {@code lt} (pointing to a {@code '<'}) is a CDATA section, comment, processing
     * instruction or DOCTYPE declaration, returns the index right after it; otherwise returns {@code lt} meaning
     * the position starts an element tag.
     *
     * <p>Known limitation: a DOCTYPE with an internal subset ({@code <!DOCTYPE root [ ... ]>}) is cut at the first
     * {@code '>'} instead of the subset end. This is acceptable because DTDs are rejected downstream by the safe
     * parser factories ({@code disallow-doctype-decl} in SafeXmlUtils), so such content never parses anyway.
     */
    private static int skipNonElementMarkup(String xml, int lt) {
        final int n = xml.length();
        if (xml.startsWith("<![CDATA[", lt)) {
            int end = xml.indexOf("]]>", lt + 9);
            return end < 0 ? n : end + 3;
        }
        if (xml.startsWith("<!--", lt)) {
            int end = xml.indexOf("-->", lt + 4);
            return end < 0 ? n : end + 3;
        }
        if (xml.startsWith("<?", lt)) {
            int end = xml.indexOf("?>", lt + 2);
            return end < 0 ? n : end + 2;
        }
        if (xml.startsWith("<!", lt)) {
            int end = xml.indexOf('>', lt + 2);
            return end < 0 ? n : end + 1;
        }
        return lt;
    }

    /**
     * Returns the index right after the {@code '>'} that closes the element tag whose content starts at {@code from},
     * ignoring {@code '>'} characters inside quoted attribute values.
     */
    private static int skipToTagEnd(String xml, int from) {
        final int n = xml.length();
        char quote = 0;
        for (int i = from; i < n; i++) {
            char c = xml.charAt(i);
            if (quote != 0) {
                if (c == quote) {
                    quote = 0;
                }
            } else if (c == '"' || c == '\'') {
                quote = c;
            } else if (c == '>') {
                return i + 1;
            }
        }
        return n;
    }

    /**
     * Checks whether an {@code xmlns:prefix} declaration (followed by an equals sign) exists anywhere in the XML.
     * Implemented with plain string search to avoid compiling a pattern per invocation.
     */
    private static boolean isPrefixDeclared(String xml, String prefix) {
        final String declaration = "xmlns:" + prefix;
        int from = 0;
        int idx;
        while ((idx = xml.indexOf(declaration, from)) >= 0) {
            int p = idx + declaration.length();
            // the prefix must not be a substring of a longer prefix (e.g. xmlns:ns2 when looking for ns)
            if (p < xml.length() && !isXmlNameChar(xml.charAt(p))) {
                while (p < xml.length() && Character.isWhitespace(xml.charAt(p))) {
                    p++;
                }
                if (p < xml.length() && xml.charAt(p) == '=') {
                    return true;
                }
            }
            from = idx + 1;
        }
        return false;
    }

    private static boolean isXmlNameChar(char c) {
        return Character.isLetterOrDigit(c) || c == ':' || c == '.' || c == '-' || c == '_';
    }

    /**
     * This method is intended to fix some malformed XML content that is not compliant with the XML specification
     * to enable the parsing and processing of the payload to be lenient.
     * For the moment, current implementation will just fix invalid case in the XML declaration, if present.
     *
     * @param xml original XML content
     * @return modified XML content with the XML declaration fixed to be compliant with the XML specification
     * @since 9.3.9
     */
    public static String makeXmlLenient(String xml) {
        if (xml == null) return null;
        Pattern declPattern = Pattern.compile("(?i)<\\?xml([^>]*)\\?>");
        Matcher declMatcher = declPattern.matcher(xml);
        if (declMatcher.find()) {
            String attrs = declMatcher.group(1);
            // Replace invalid or empty version values with 1.0
            attrs = attrs.replaceAll("(?i)(version\\s*=\\s*['\"])(?!1\\.0['\"]|1\\.1['\"])[^'\"]*(['\"])", "$11.0$2");
            // If version is missing or empty, add version="1.0"
            if (!attrs.matches(".*(?i)version\\s*=\\s*['\"][^'\"]*['\"].*")) {
                attrs = " version=\"1.0\"" + attrs;
            }
            String fixed = "<?xml" + attrs + "?>";
            if (fixed.equals(declMatcher.group())) {
                // declaration is already fine: return the same instance to avoid a payload-sized copy
                return xml;
            }
            return declMatcher.replaceFirst(Matcher.quoteReplacement(fixed));
        }
        return xml;
    }

    /**
     * Parses all comments from the given XML document.
     *
     * <p>This method uses an {@link XMLStreamReader} to parse the provided XML string
     * and extract all comments present in the document. Comments are identified as
     * XML elements of type {@link XMLStreamConstants#COMMENT}.
     * <p>
     * All extracted comments are trimmed before being added to the result list. Meaning they will not contain any
     * leading or trailing whitespace.
     *
     * @param xml the XML document as a {@link String} to parse
     * @return a {@link List} of comments extracted from the XML document
     * @throws NullPointerException     if the {@code xml} is null
     * @throws IllegalArgumentException if the {@code xml} is blank or empty
     * @since 9.5.5
     */
    public static List<String> parseComments(final String xml) {
        Objects.requireNonNull(xml, "XML to parse must not be null");
        Validate.notBlank(xml, "XML to parse must not be a blank string");

        List<String> result = new ArrayList<>();

        final XMLInputFactory factory = SafeXmlUtils.inputFactory();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new StringReader(MxParseUtils.makeXmlLenient(xml)));

            while (reader.hasNext()) {
                int event = reader.next();
                if (event == XMLStreamConstants.COMMENT) {
                    String comment = reader.getText();
                    if (comment != null) {
                        result.add(comment.trim());
                    }
                }
            }
            reader.close();
        } catch (XMLStreamException e) {
            log.log(Level.WARNING, "Error parsing XML comments", e);
        }
        return result;
    }

    /**
     * Parses comments from the given XML document that start with a specific prefix.
     *
     * <p>This method uses {@link #parseComments(String)} to extract all comments
     * from the XML, filters the comments to include only those that start with the
     * specified prefix.
     *
     * @param xml       the XML document as a {@link String} to parse
     * @param startWith the prefix to filter comments by, leading whitespaces are ignored
     * @return a {@link List} of filtered and cropped comments that start with the given prefix
     * @throws NullPointerException     if the {@code xml} is null
     * @throws IllegalArgumentException if the {@code xml} is blank or empty
     * @since 9.5.5
     */
    public static List<String> parseCommentsStartsWith(final String xml, final String startWith) {
        return parseComments(xml).stream()
                .filter(c -> c.startsWith(startWith)) // Filter comments that start with the given prefix
                .collect(Collectors.toList());
    }

    /**
     * Parses comments from the given XML document that contains a specific string.
     *
     * <p>This method uses {@link #parseComments(String)} to extract all comments
     * from the XML, filters the comments to include only those that contains a specific string.
     *
     * @param xml      the XML document as a {@link String} to parse
     * @param contains the content to filter comments by
     * @return a {@link List} of filtered and cropped comments that start with the given prefix
     * @throws NullPointerException     if the {@code xml} is null
     * @throws IllegalArgumentException if the {@code xml} is blank or empty
     * @since 9.5.5
     */
    public static List<String> parseCommentsContains(final String xml, final String contains) {
        return parseComments(xml).stream()
                .filter(c -> c.contains(contains)) // Filter comments that start with the given prefix
                .collect(Collectors.toList());
    }

    /**
     * Parses an {@link AbstractMT} message from a multi-format XML message.
     *
     * <p>This method searches for MT (Message Type) content within the comments
     * of the provided XML document. Specifically, it extracts comments that start
     * with the prefix "{1:F0", which indicates the presence of an MT message, and
     * attempts to parse the first matching comment into an {@link AbstractMT} object.</p>
     *
     * <p>If an error occurs during parsing or no matching comments are found, the method
     * returns an empty {@link Optional}.</p>
     *
     * @param xml the XML document as a {@link String} containing the multi-format message
     * @return an {@link Optional} containing the parsed {@link AbstractMT} if successful;
     * otherwise, an empty {@link Optional}
     * @throws NullPointerException if the {@code xml} is null
     * @since 9.5.5
     */
    public static Optional<AbstractMT> parseMtFromMultiformatMessage(final String xml) {
        List<String> MTs = MxParseUtils.parseCommentsStartsWith(xml, "{1:F0");
        if (!MTs.isEmpty()) {
            String s = MTs.get(0).replace("^~", "\n");

            try {
                return Optional.of(AbstractMT.parse(s));
            } catch (IOException e) {
                log.log(Level.WARNING, "Error extracting AbstractMT from Mx", e);
            }
        }
        return Optional.empty();
    }

    /**
     * Extracts settlement information from the given XML document.
     *
     * <p>This method attempts to parse the provided XML and extract information
     * related to the settlement method and clearing system codes. Specifically:
     * <ul>
     *     <li>{@code SttlmMtd} - The settlement method.</li>
     *     <li>{@code ClrSys > Cd} - The clearing system code.</li>
     *     <li>{@code ClrSys > Prtry} - The clearing system proprietary.</li>
     * </ul>
     *
     * <p>If any of these elements are found, a {@link SettlementInfo} object is
     * created and populated with the extracted values.
     *
     * @param xml the XML document as a {@link String} to parse for settlement information.
     * @return an {@link Optional} containing the {@link SettlementInfo} if at least one
     * of the required elements is found; otherwise, an empty {@link Optional}.
     * @throws NullPointerException if the {@code xml} is null.
     * @since 9.5.5
     */
    public static Optional<SettlementInfo> getSettlementInfo(final String xml) {
        Objects.requireNonNull(xml, "XML to parse must not be null");
        Optional<String> sttlmMtdMaybe = findByTags(xml, "SttlmMtd");
        Optional<String> clrSysCdMaybe = findByTags(xml, "ClrSys", "Cd");
        Optional<String> clrSysPrtryMaybe = findByTags(xml, "ClrSys", "Prtry");

        if (sttlmMtdMaybe.isPresent() || clrSysCdMaybe.isPresent() || clrSysPrtryMaybe.isPresent()) {
            SettlementInfo settlementInfo = new SettlementInfo();
            if (sttlmMtdMaybe.isPresent()) {
                settlementInfo.setSettlementMethod(EnumUtils.getEnum(SettlementMethod.class, sttlmMtdMaybe.get()));
            }
            if (clrSysCdMaybe.isPresent()) {
                // if code is present we use it as clearing system code
                settlementInfo.setClearingSystemCode(clrSysCdMaybe.get());
            } else if (clrSysPrtryMaybe.isPresent()) {
                // otherwise we try with the proprietary code (that also refers toa clearing system)
                settlementInfo.setClearingSystemCode(clrSysPrtryMaybe.get());
            }
            return Optional.of(settlementInfo);
        }
        return Optional.empty();
    }

    /**
     * Finds an XML element within a document by traversing a specified tag hierarchy with potential any element in
     * between the specified tags.
     *
     * <p>This method uses an {@link XMLStreamReader} to parse the provided XML document.
     * It searches for an element that matches the specified sequence of tag names (hierarchy).
     * For example, to find the {@code <Cd>} tag within {@code <ClrSys>}, you would call:
     * <pre>
     *     findElement(xml, "ClrSys", "Cd");
     * </pre>
     * Notice that the {@code <Cd>} tag does not need to be a direct child of the {@code <ClrSys>} tag.
     *
     * <p>It is important to remark the last tag in the sequence is the one that is expected to have text content,
     * and not an intermediate tag.
     *
     * @param xml  the XML document as a {@link String} to search.
     * @param tags the sequence of tag names that define the hierarchy of the target element.
     * @return an {@link Optional} containing the matching element value or empty if not found.
     * @throws NullPointerException     if the {@code xml} or {@code tags} are null.
     * @throws IllegalArgumentException if the {@code xml} is a blank string.
     * @since 9.5.6
     */
    public static Optional<String> findByTags(final String xml, String... tags) {
        Objects.requireNonNull(xml, "XML to parse must not be null");
        Validate.notBlank(xml, "XML to parse must not be a blank string");
        return findByTags(new StringReader(MxParseUtils.makeXmlLenient(xml)), tags);
    }

    /**
     * Implementation of {@link #findByTags(String, String...)} streaming from a reader, so lenient payload views
     * can be scanned without materializing a normalized copy.
     */
    private static Optional<String> findByTags(final java.io.Reader source, String... tags) {
        Objects.requireNonNull(tags, "tags to find must not be null");

        final XMLInputFactory xif = SafeXmlUtils.inputFactory();
        int tagsIndex = 0;
        XMLStreamReader reader = null;
        try {
            reader = xif.createXMLStreamReader(source);
            while (reader.hasNext()) {
                int event = reader.next();
                if (XMLStreamConstants.START_ELEMENT == event) {
                    if (reader.getLocalName().equals(tags[tagsIndex])) {
                        if (tagsIndex == tags.length - 1) {
                            // Ensure the next event is CHARACTERS to get the text content
                            try {
                                return Optional.of(reader.getElementText());
                            } catch (XMLStreamException e1) {
                                log.warning("The " + tags[tags.length - 1]
                                        + " tag should point to a leaf, not to an intermediate XML node");
                                if (log.isLoggable(Level.FINE)) {
                                    log.log(
                                            Level.FINE,
                                            "The element at " + tags[tags.length - 1]
                                                    + " is not an element with text content: " + e1.getMessage());
                                }
                                break;
                            }
                        }
                        tagsIndex++;
                    }
                }
            }
        } catch (XMLStreamException e) {
            log.log(Level.SEVERE, "Error reading XML", e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (XMLStreamException e) {
                    log.log(Level.WARNING, "Error closing XMLStreamReader", e);
                }
            }
        }
        return Optional.empty();
    }

    /**
     * This method is deprecated because it is not a good idea to return the reader, that we are opening inside the
     * method leaving the responsibility of closing it to the caller; where the caller probably just wants the value
     * of the element.
     *
     * @param xml  the XML content to search
     * @param tags ordered sequence of element local names to match hierarchically
     * @return the positioned reader at the matching element, or empty if not found
     * @deprecated use {@link #findByTags(String, String...)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2026)
    public static Optional<XMLStreamReader> findElementByTags(final String xml, String... tags) {
        DeprecationUtils.phase2(MxParseUtils.class, "findElementByTags", "Use findByTags instead");

        Objects.requireNonNull(xml, "XML to parse must not be null");
        Validate.notBlank(xml, "XML to parse must not be a blank string");
        Objects.requireNonNull(tags, "tags to find must not be null");

        final XMLInputFactory xif = SafeXmlUtils.inputFactory();
        int tagsIndex = 0;
        try {
            XMLStreamReader reader = xif.createXMLStreamReader(new StringReader(MxParseUtils.makeXmlLenient(xml)));
            while (reader.hasNext()) {
                int event = reader.next();
                if (XMLStreamConstants.START_ELEMENT == event) {
                    if (reader.getLocalName().equals(tags[tagsIndex])) {
                        if (tagsIndex == tags.length - 1) {
                            return Optional.of(reader);
                        }
                        tagsIndex++;
                    }
                }
            }
        } catch (XMLStreamException e) {
            log.log(Level.SEVERE, "Error reading XML", e);
        }
        return Optional.empty();
    }

    /**
     * Finds an XML element within a document by traversing a specified tag hierarchy.
     *
     * <p>This method uses an {@link XMLStreamReader} to parse the provided XML document.
     * It searches for an element that matches the specified path.
     * For example, to find the {@code <PgNb>} you can call using absolute path or relative path:
     * For relative path parameters you must use "//" as starting segment.
     * <pre>
     *     findByPath(xml, /Document/BkToCstmrStmt/GrpHdr/MsgPgntn/PgNb);
     *     findByPath(xml, //BkToCstmrStmt/GrpHdr/MsgPgntn/PgNb);
     * </pre>
     *
     * <p>It is important to remark the last tag in the sequence is the one that is expected to have text content,
     * and not an intermediate tag.
     *
     * @param xml        the XML document as a {@link String} to search.
     * @param targetPath the path of the field to find into the xml, could be absolute or relative (indicated with starting double slash)
     * @return an {@link Optional} containing the found element value or empty if not found.
     * @throws NullPointerException     if the {@code xml} or {@code tags} are null.
     * @throws IllegalArgumentException if the {@code xml} is a blank string.
     * @since 9.5.6
     */
    public static Optional<String> findByPath(String xml, String targetPath) {
        Objects.requireNonNull(xml, "XML to parse must not be null");
        Validate.notBlank(xml, "XML to parse must not be a blank string");
        Objects.requireNonNull(targetPath, "targetPath to find must not be null");
        Validate.notBlank(targetPath, "targetPath must not be a blank string");

        // Define the regex to detect if the path is absolute or relative
        Matcher matcher = pattern.matcher(targetPath);

        // check if is valid expression if not throws exception
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid path format: " + targetPath);
        }

        // Check if the path is relative or absolute
        boolean isRelative = targetPath.startsWith("//");
        if (isRelative) {
            targetPath = targetPath.substring(1);
        }

        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = null;
        try {
            reader = factory.createXMLStreamReader(new StringReader(xml));

            // Stack to track the path elements as we iterate through XML
            Stack<String> pathStack = new Stack<>();

            while (reader.hasNext()) {
                int event = reader.next();

                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        pathStack.push(reader.getLocalName());
                        String currentPath = buildCurrentPath(pathStack);

                        // Check if the current path matches the target path or if the currentPath contains the relative
                        // path
                        if (currentPath.equals(targetPath) || currentPath.contains(targetPath)) {
                            // Ensure the next event is CHARACTERS to get the text content
                            try {
                                return Optional.of(reader.getElementText());
                            } catch (XMLStreamException e1) {
                                log.warning("The " + targetPath
                                        + " path should point to a leaf, not to an intermediate XML node");
                                if (log.isLoggable(Level.FINE)) {
                                    log.log(
                                            Level.FINE,
                                            "The element at " + targetPath + " is not an element with text content: "
                                                    + e1.getMessage());
                                }
                                break;
                            }
                        }
                        break;

                    case XMLStreamConstants.END_ELEMENT:
                        if (!pathStack.isEmpty()) {
                            pathStack.pop();
                        }
                        break;

                    default:
                        break;
                }
            }
        } catch (XMLStreamException e) {
            log.log(Level.SEVERE, "Error finding element by path", e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (XMLStreamException e) {
                    log.log(Level.WARNING, "Error closing XMLStreamReader", e);
                }
            }
        }

        return Optional.empty(); // Return empty if no match
    }

    /**
     * This method is deprecated because it is not a good idea to return the reader, that we are opening inside the
     * method leaving the responsibility of closing it to the caller; where the caller probably just wants the value
     * of the element.
     *
     * @param xml        the XML content to search
     * @param targetPath absolute or relative path expression to find (e.g. "/Document/CstmrCdtTrfInitn")
     * @return the positioned reader at the matching element, or empty if not found
     * @deprecated use {@link #findByTags(String, String...)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2026)
    public static Optional<XMLStreamReader> findElementByPath(String xml, String targetPath) {
        DeprecationUtils.phase2(MxParseUtils.class, "findElementByPath", "Use findByPath instead");

        Objects.requireNonNull(xml, "XML to parse must not be null");
        Validate.notBlank(xml, "XML to parse must not be a blank string");
        Objects.requireNonNull(targetPath, "targetPath to find must not be null");
        Validate.notBlank(targetPath, "targetPath must not be a blank string");

        // Define the regex to detect if the path is absolute or relative
        Matcher matcher = pattern.matcher(targetPath);

        // check if is valid expression if not throws exception
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid path format: " + targetPath);
        }

        // Check if the path is relative or absolute
        boolean isRelative = targetPath.startsWith("//");
        if (isRelative) {
            targetPath = targetPath.substring(1);
        }

        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new StringReader(xml));

            // Stack to track the path elements as we iterate through XML
            Stack<String> pathStack = new Stack<>();

            while (reader.hasNext()) {
                int event = reader.next();

                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        if (!reader.getLocalName().equals("RequestPayload")) {
                            // Absolute path
                            pathStack.push(reader.getLocalName());
                            String currentPath = buildCurrentPath(pathStack);

                            // Check if the current path matches the target path or if the currentPath contains the
                            // relative path
                            if (currentPath.equals(targetPath) || currentPath.contains(targetPath)) {
                                return Optional.of(reader);
                            }
                            break;
                        }

                    case XMLStreamConstants.END_ELEMENT:
                        if (!pathStack.isEmpty()) {
                            pathStack.pop();
                        }
                        break;

                    default:
                        break;
                }
            }
        } catch (XMLStreamException e) {
            log.log(Level.SEVERE, "Error finding element by path", e);
        }

        return Optional.empty(); // Return empty if no match
    }

    private static String buildCurrentPath(Stack<String> pathStack) {
        return "/" + String.join("/", pathStack);
    }

    /**
     * Checks if an element exists in the XML
     *
     * @param xml       the XML content
     * @param localName the element name
     * @return true if at least one element with the given name is found
     * @since 9.5.5
     */
    public static boolean elementExists(final String xml, final String localName) {
        Objects.requireNonNull(xml, "XML to parse must not be null");
        Validate.notBlank(xml, "XML to parse must not be a blank string");
        Objects.requireNonNull(localName, "Element name to find must not be null");
        Validate.notBlank(localName, "Element name must not be a blank string");

        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = null;
        try {
            reader = factory.createXMLStreamReader(new StringReader(xml));
            while (reader.hasNext()) {
                int event = reader.next();
                if (event == XMLStreamConstants.START_ELEMENT
                        && reader.getLocalName().equals(localName)) {
                    return true;
                }
            }
        } catch (XMLStreamException e) {
            log.log(Level.SEVERE, "Error reading XML", e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (XMLStreamException e) {
                    log.log(Level.WARNING, "Error closing XMLStreamReader", e);
                }
            }
        }
        return false;
    }
}
