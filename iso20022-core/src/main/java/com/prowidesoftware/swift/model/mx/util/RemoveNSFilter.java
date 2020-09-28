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
package com.prowidesoftware.swift.model.mx.util;

import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;

import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;

/*
 * This class is used to remove the namespaces of the xml to be read and provide a best-efford 
 * read since validating is done in a later phase. 
 */

/**
 * Internal use
 * @deprecated
 */
@Deprecated
@ProwideDeprecated(phase4 = TargetYear.SRU2021)
public class RemoveNSFilter extends XMLFilterImpl {
	private static final transient Logger log = Logger.getLogger(RemoveNSFilter.class.getName());
	
	private boolean _substr_qname = true;

	public RemoveNSFilter() {
		super();
	}

	public RemoveNSFilter(XMLReader parent) {
		super(parent);
	}

	@Override
	public void processingInstruction(String target, String data)
			throws SAXException {
		super.processingInstruction(target, data);
		log.fine("processingInstruction\n"+
		"    target: "+target+"\n"
		+"    data: "+data);
	}
	
	@Override
	public void startPrefixMapping(String prefix, String uri)
			throws SAXException {
		super.startPrefixMapping(prefix, uri);
		log.fine("startPrefixMapping\n"+
		"    prefix: "+prefix+"\n"
		+"    uri: "+uri);
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		log.fine("startElement\n"
		+"    uri: "+uri+"\n"
		+"    localName: "+localName+"\n"
		+"    qname: "+qName+"\n");
		if (_substr_qname)
			qName = StringUtils.substringAfterLast(qName, ":");
		if (StringUtils.contains(qName, "Document")) {
			for (int i=0;i<atts.getLength();i++) {
				final String qname = atts.getQName(i);
				final String type = atts.getType(i);
				final String val = atts.getValue(i);
				if (StringUtils.startsWith(qname, "xmlns:")) {
					if (StringUtils.contains(val, "swift")) {
						log.fine("    => Eliminar atributo"+type+" - "+val);
					}
				}
			}
		}
		super.startElement(uri, localName, qName, atts);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		log.fine("endElement (_substr_qname is "+_substr_qname+")\n"
		+"    uri: "+uri+"\n"
		+"    localName: "+localName+"\n"
		+"    qname: "+qName+"\n");
		if (_substr_qname)
			qName = StringUtils.substringAfterLast(qName, ":");
		super.endElement(uri, localName, qName);
	}

	public void __set_substr_qname(boolean _substr_qname) {
		this._substr_qname = _substr_qname;
	}
	
}
