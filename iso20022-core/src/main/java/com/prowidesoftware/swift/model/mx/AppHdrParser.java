package com.prowidesoftware.swift.model.mx;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.SAXException;

import javax.xml.transform.sax.SAXSource;
import java.util.Optional;

/**
 * @since 9.1.2
 */
public class AppHdrParser {

    /**
     * Detects the header version by reading the namespace in the AppHdr element and parses the header content to
     * a specific header model: {@link LegacyAppHdr}, {@link BusinessAppHdrV01} or {@link BusinessAppHdrV02}
     *
     * @param xml and XML to parse, only the AppHdr element is parse, the rest of the XML content is silently ignored
     * @return parsed header
     */
    public static Optional<AppHdr> parse(final String xml) {
        try {

            Optional<String> namespace = NamespaceReader.findAppHdrNamespace(xml);
            return Optional.ofNullable(parseHeaderFromSAXSource(xml, namespace.orElse(null)));

        } catch (Exception e) {
            MxParseUtils.handleParseException(e);
        }

        return Optional.empty();
    }

    private static AppHdr parseHeaderFromSAXSource(final String xml, final String namespace) throws SAXException {

        SAXSource source = MxParseUtils.createFilteredSAXSource(xml, AppHdr.HEADER_LOCALNAME);

        if (StringUtils.equals(LegacyAppHdr.NAMESPACE, namespace)) {
            // parse legacy AH
            return (LegacyAppHdr) MxParseUtils.parseSAXSource(source, LegacyAppHdr.class, LegacyAppHdr._classes);

        } else if (StringUtils.equals(BusinessAppHdrV02.NAMESPACE, namespace)) {
            // parse BAH version 2
            return (BusinessAppHdrV02) MxParseUtils.parseSAXSource(source, BusinessAppHdrV02.class, BusinessAppHdrV02._classes);

        } else {
            // by default try to parse to BAH version 1
            return (BusinessAppHdrV01) MxParseUtils.parseSAXSource(source, BusinessAppHdrV01.class, BusinessAppHdrV01._classes);
        }
    }

    /**
     * Parse the business header from an XML Element node
     * <p>The implementation serializes the element into XML and calls {@link #parse(String)}
     */
    public static Optional<AppHdr> parseAppHdr(final Element e) {
        return parse(asXml(e));
    }

    private static String asXml(Element e) {
        DOMImplementationLS lsImpl = (DOMImplementationLS) e.getOwnerDocument().getImplementation().getFeature("LS", "3.0");
        LSSerializer serializer = lsImpl.createLSSerializer();
        serializer.getDomConfig().setParameter("xml-declaration", false);
        return serializer.writeToString(e);
    }

}
