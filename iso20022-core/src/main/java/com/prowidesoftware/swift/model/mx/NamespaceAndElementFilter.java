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

import org.apache.commons.lang3.StringUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

/**
 * This filter enables extraction of a particular element from an XML and at the same it unbinds its namespace
 * (by filtering out the namespace declaration and optional associated prefix).
 *
 * <p>The filter will bypass only the main element being parsed (such as the AppHdr or Document), ignoring any other
 * sibling or parent content such as a transmission envelope. Then within the main element being processed, only the
 * content with a recognized namespace is propagated, meaning for example any supplementary data with Any in the schema
 * will not be parsed.
 *
 * @since 9.1.2
 */
/* When parsing the Document or AppHdr for an MX, we have to unbind the main message namespace.
 * This is necessary because the generated jaxb model for element types is shared and not bounded to any specific
 * message type. Meaning we don't have duplicated type classes for each message they appear in, instead we have single
 * non-repetitive types with no namespace.
 */
class NamespaceAndElementFilter extends XMLFilterImpl {

    private String mainNamespace;
    private boolean inElementToPropagate = false;
    private String localNameToPropagate;
	private boolean inInnerElementToSkip = false;
	private String localNameToSkip;

    /**
     * @param localName the XML's element to propagate
     */
    public NamespaceAndElementFilter(String localName) {
        super();
        this.localNameToPropagate = localName;
    }

    @Override
    public void startElement(String namespace, String localName, String prefix, Attributes attributes) throws SAXException {

    	if (inInnerElementToSkip) {
    		return;
		}

    	if (!this.inElementToPropagate && localName.equals(this.localNameToPropagate)) {
			this.inElementToPropagate = true;
    		this.mainNamespace = namespace;
    	}
    	
    	if (this.inElementToPropagate) {
    		String namespaceToPropagate = resolveNamespaceToPropagate(namespace);
    		if (namespaceToPropagate != null) {
				super.startElement(namespaceToPropagate, localName, prefix, attributes);
			} else {
    			// we have found an element within the structure to propagate with a not recognized namespace
				// so we skip this content because we don't have the model to unmarshall it properly;
				// this is normally the case of an Any element in the schema
    			this.inInnerElementToSkip = true;
    			this.localNameToSkip = localName;
			}
    	}
    }

	// we only propagate elements in the specific main namespace of the parsed element, however we do not propagate the
	// namespace itself for those elements because we want the content to be unbounded to it. The only other exception
	// where we propagate the elements is for xsys messages where the messages uses a main namespace plus several
	// complementary reusable schemas such as "Sw".
	private String resolveNamespaceToPropagate(String namespace) {
		if (StringUtils.equals(this.mainNamespace, namespace)) {
			return "";
		} else if (isXsysNamespace(namespace)) {
			return namespace;
		} else {
			return null;
		}
	}

	private boolean isXsysNamespace(String namespace) {
		return "urn:swift:snl:ns.Doc".equals(namespace) ||
				"urn:swift:snl:ns.Sw".equals(namespace) ||
				"urn:swift:snl:ns.SwGbl".equals(namespace) ||
				"urn:swift:snl:ns.SwInt".equals(namespace) ||
				"urn:swift:snl:ns.SwSec".equals(namespace);
	}

	@Override
    public void endElement(String namespace, String localName, String prefix) throws SAXException {

    	if (this.inInnerElementToSkip) {
			if (localName.equals(this.localNameToSkip)) {
				// stop skipping
				this.inInnerElementToSkip = false;
				this.localNameToSkip = null;
				return;
			}
		}

    	if (this.inElementToPropagate) {
			String namespaceToPropagate = resolveNamespaceToPropagate(namespace);
			if (namespaceToPropagate != null) {
				super.endElement(namespaceToPropagate, localName, prefix);
			}
    	}
    	
    	if (localName.equals(this.localNameToPropagate)) {
    		// we are done (we will skip the rest of the XML content
			this.inElementToPropagate =false;
    	}
    }

    @Override
    public void startPrefixMapping(String prefix, String url)throws SAXException {
		if (this.inElementToPropagate && this.mainNamespace != null) {
			if (isXsysNamespace(url)) {
				// we only propagate the xsys messages namespaces, for the main namespace we want it unbounded
				super.startPrefixMapping(prefix, url);
	    	}
		}
    }

}
