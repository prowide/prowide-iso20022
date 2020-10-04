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
 * @since 9.1.2
 */
/* When parsing the Document or AppHdr for an MX, we have to unbind the main message namespace.
 * This is necessary because the generated jaxb model for element types is shared and not bounded to any specific
 * message type. Meaning we don't have duplicated type classes for each message they appear in, instead we have single
 * non-repetitive types with no namespace.
 */
class NamespaceAndElementFilter extends XMLFilterImpl {

    private String namespaceUriToRemove;
    private boolean isAnElementToPropagate = false;    
    private String localNameToPropagate;
    
    /**
     * @param localName the XML's element to propagate
     */
    public NamespaceAndElementFilter(String localName) {
        super();
        this.localNameToPropagate = localName;
    }

    @Override
    public void startElement(String nameSpace, String localName, String prefix, Attributes attributes) throws SAXException {

    	if (localName.equals(this.localNameToPropagate)) {
			this.isAnElementToPropagate = true;
    		this.namespaceUriToRemove = nameSpace;
    	}
    	
    	if (this.isAnElementToPropagate) {
    		String namespaceToPropagate = resolveNamespaceToPropagate(nameSpace);
			super.startElement(namespaceToPropagate, localName, prefix, attributes);
    	}
    }

    private String resolveNamespaceToPropagate(String nameSpace) {
		return StringUtils.equals(this.namespaceUriToRemove, nameSpace)? "" : nameSpace;
	}

    @Override
    public void endElement(String nameSpace, String localName, String prefix) throws SAXException {    	
     	
    	if (this.isAnElementToPropagate) {
			String namespaceToPropagate = resolveNamespaceToPropagate(nameSpace);
			super.endElement(namespaceToPropagate, localName, prefix);
    	}
    	
    	if(localName.equals(this.localNameToPropagate)) {
			this.isAnElementToPropagate=false;
    	}
    }

    @Override
    public void startPrefixMapping(String prefix, String url)throws SAXException {
		if (this.isAnElementToPropagate && this.namespaceUriToRemove != null) {
			if (!StringUtils.equals(url, this.namespaceUriToRemove)) {
	    		super.startPrefixMapping(prefix, url);
	    	}
		}
    }

}
