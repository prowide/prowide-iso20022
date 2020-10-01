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

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

/**
 * @since 9.1.2
 */
class DocumentHeaderFilter extends XMLFilterImpl {

    private String namespaceUriToRemove;
    private boolean isAnElementToPropagate = false;    
    private String localNameToPropagate;
    
    /**
     * @param nameSpaceToRemove null if you don't want to remove namespace
     * @param localName the xml's element to propagate
     * @since 9.1.2
     */
    public DocumentHeaderFilter(String nameSpaceToRemove, String localName) {
        super();
        namespaceUriToRemove = nameSpaceToRemove;
        localNameToPropagate = localName;
    }

    @Override
    public void startElement(String nameSpace, String localName, String prefix, Attributes attributes) throws SAXException {

    	if(localName.equals(localNameToPropagate)) {
    		isAnElementToPropagate=true;
    	}
    	
    	if(isAnElementToPropagate) {
    		if(localName.equals(localNameToPropagate) && namespaceUriToRemove == null) {
    			super.startElement(nameSpace, localName, prefix, attributes);	
    		} else {
    			super.startElement("", localName, prefix, attributes);	
    		}
    	}
    }

    @Override
    public void endElement(String nameSpace, String localName, String prefix) throws SAXException {    	
     	
    	if(isAnElementToPropagate) {
    		if(localName.equals(localNameToPropagate) && namespaceUriToRemove == null) {
    			super.endElement(nameSpace, localName, prefix);	
    		} else {
    			super.endElement("", localName, prefix);	
    		}
    	} 
    	
    	if(localName.equals(localNameToPropagate)) {
    		isAnElementToPropagate=false;
    	}
    }

    @Override
    public void startPrefixMapping(String prefix, String url)throws SAXException {
		if(namespaceUriToRemove!=null) {
	    	if(!url.toLowerCase().equals(namespaceUriToRemove)) {
	    		super.startPrefixMapping(prefix, url);
	    	}    			
		}
    }


}
