/*
 * Copyright 2006-2020 Prowide
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

import com.prowidesoftware.swift.model.MxBusinessProcess;
import com.prowidesoftware.swift.model.MxId;
import org.apache.commons.lang3.Validate;

import javax.xml.transform.sax.SAXSource;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Default implementation of the {@link MxRead} interface to parse XML strings into Mx message objects.
 *
 * <p>The implementation is not a straight forward jaxb unmarsahlling. Some remarks:
 * <ul>
 *     <li>The parser uses a SAX reader, to extract only the AppHdr and Document portions of the source XML,
 *     ignoring any container wrapper elements.</li>
 *
 *     <li>The parser is not namespace aware for general ISO 20022 elements, because the dictionary model classes in
 *     the library are not bounded to any specific namespace. This is due to the fact that the library is generated as
 *     a flat shared collection of elements, where the same element implementation is potentially used by many
 *     specific ISO 20022 messages.
 *     This is a special feature of the model, that is not a direct jaxb generation from hundreds of ISO schemas with
 *     each type in its own package, but a custom jaxb process to produce a shareable dictionary for the elements with
 *     minimal custom bindings.
 *     Notice however xsys messages do use namespace for the shared schemas such as Sw, SwInt, etc...</li>
 *
 *     <li>For the header, multiple variants are supported. The parser detects the specific header to parse using the
 *     namespace at the AppHdr element. By default it tries to parse the content as head.001.001.01.</li>
 * </ul>
 *
 * <p>This is the default implementation used for the direct parse calls in MX messages.
 *
 * @since 9.0
 */
public class MxReadImpl implements MxRead {
	private static final transient Logger log = Logger.getLogger(MxReadImpl.class.getName());

	@Override
	public AbstractMX read(final Class<? extends AbstractMX> targetClass, final String xml, final Class<?>[] classes) {
		return parse(targetClass, xml, classes);
	}

	/**
	 * Static parse implementation of {@link MxRead#read(Class, String, Class[])}
	 * @param xml the XML to parse, should contain the Document, and optional AppHdr and any type of wrapper elements
	 * @since 8.0.4
	 */
	public static AbstractMX parse(final Class<? extends AbstractMX> targetClass, final String xml, final Class<?>[] classes) {
		Validate.notNull(targetClass, "target class to parse must not be null");
		Validate.notNull(xml, "XML to parse must not be null");
		Validate.notBlank(xml, "XML to parse must not be a blank string");
		Validate.notNull(classes, "object model classes array must not be null");

		try {

			SAXSource documentSource = MxParseUtils.createFilteredSAXSource(xml, AbstractMX.DOCUMENT_LOCALNAME);
			Optional<AbstractMX> mx = parseDocumentFromSAXSource(documentSource, targetClass, classes);

			Optional<AppHdr> appHdr = AppHdrParser.parse(xml);
	
			if (mx.isPresent() && appHdr.isPresent()) {
				mx.get().setAppHdr(appHdr.get());
			}

			return mx.orElse(null);

		} catch (final Exception e) {
			MxParseUtils.handleParseException(e);
			return null;
		}
	}

	/**
	 * @since 9.1.2
	 */
	private static Optional<AbstractMX> parseDocumentFromSAXSource(SAXSource source, Class<? extends AbstractMX> targetClass, Class<?>[] classes) {
		final AbstractMX mx = (AbstractMX) MxParseUtils.parseSAXSource(source, targetClass, classes);
		return Optional.ofNullable(mx);
	}

	/**
	 * Parses the XML string content into a specific instance of Mx.
	 *
	 * <p>If the string is empty, does not contain any MX message, the message type cannot be detected or an error occur
	 * reading and parsing the message content; this method returns null.
	 *
	 * <p>The implementation detects the message type and uses reflection to call the parser in the specific Mx
	 * subclass.
	 *
	 * <p>If header is present, it is also parsed into the message object.
	 *
	 * @param xml a string containing an MX message in XML format
	 * @param id optional parameter to indicate the specific MX type to create; autodetected from namespace if null.
	 * @return parser message or null if string content could not be parsed into an Mx
	 *
	 * @since 7.8.4
	 */
	@Override
	public AbstractMX read(final String xml, MxId id) {
		return parse(xml, id);
	}

	/**
	 * Static parse implementation of {@link MxRead#read(String, MxId)}
	 * @since 9.0
	 */
	public static AbstractMX parse(final String xml, MxId id) {
		Validate.notNull(xml, "XML to parse must not be null");
		Validate.notBlank(xml, "XML to parse must not be a blank string");

		MxId resolvedId = id;

		if (id == null) {
			Optional<String> namespace = NamespaceReader.findNamespaceForLocalName(xml, AbstractMX.DOCUMENT_LOCALNAME);
			if (namespace.isPresent()) {
				resolvedId = new MxId(namespace.get());
			} else {
				log.severe("Cannot detect the Mx type from the XML, ensure the XML contains proper namespaces or provide an MxId object as parameter to the parse call");
				return null;
			}
		}

		AbstractMX mx = null;
		String fqn = null;
		try {
			String subPackage = resolvedId.getBusinessProcess() == MxBusinessProcess.xsys ? ".sys" : "";
			fqn = "com.prowidesoftware.swift.model.mx" + subPackage + ".Mx" + resolvedId.camelized();
			Class<? extends AbstractMX> clazz = (Class<? extends AbstractMX>) Class.forName(fqn);
			java.lang.reflect.Field _classes = clazz.getDeclaredField("_classes");
			mx = parse(clazz, xml, (Class[]) _classes.get(null));
		} catch (ClassNotFoundException e) {
			log.log(Level.SEVERE, "MX model implementation not found for " + fqn, e);
		} catch (Exception e) {
			log.log(Level.SEVERE, "Error calling parse in specific MX model implementation", e);
		}
		return mx;
	}

}