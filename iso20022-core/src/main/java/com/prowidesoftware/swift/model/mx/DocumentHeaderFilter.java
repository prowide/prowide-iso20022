package com.prowidesoftware.swift.model.mx;
import org.apache.commons.lang3.StringUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

import com.prowidesoftware.swift.io.parser.MxParser;

public class DocumentHeaderFilter extends XMLFilterImpl {

	
    private String usedNamespaceUri;
    private String namespaceUriToRemove;
    private boolean isInDocument = false;
    private boolean isInHeader = false;
    
    public DocumentHeaderFilter(String nameSpaceToRemove) {
        super();
        namespaceUriToRemove = nameSpaceToRemove;
    }

    @Override
    public void startElement(String nameSpace, String localName, String prefix,
            Attributes attributes) throws SAXException {

    	//Inicio del Document
    	if(localName.equals(MxParser.DOCUMENT_LOCALNAME)) {
    		isInDocument=true;
    	//Inicio del Header
    	} else if(localName.equals(AppHdr.HEADER_LOCALNAME)) {
    		isInHeader=true;
    	}
    	
    	if(isInDocument||isInHeader) {
    		super.startElement(this.usedNamespaceUri, localName, prefix, attributes);
    	}
    }

    @Override
    public void endElement(String nameSpace, String localName, String prefix) throws SAXException {    	
     	
    	//Si esta en Document o en Header
    	if(isInDocument || isInHeader) {
    		super.endElement(this.usedNamespaceUri, localName, prefix);
    	} 
    	
    	//Si es el final de Document o el final del Header, no propago mas.
    	if(localName.equals(MxParser.DOCUMENT_LOCALNAME)) {
    		isInDocument=false;
    	} else if(localName.equals(AppHdr.HEADER_LOCALNAME)) {
    		isInHeader=false;
    	}
        
    }

    @Override
    public void startPrefixMapping(String prefix, String url)throws SAXException {
		//namespaceUriToRemove tiene valor cuando el filtro es para Document
		if(namespaceUriToRemove!=null) {
	    	if(!url.toLowerCase().equals(namespaceUriToRemove)) {
	    		super.startPrefixMapping(prefix, url);
	    	}    			
		}
    }


}
