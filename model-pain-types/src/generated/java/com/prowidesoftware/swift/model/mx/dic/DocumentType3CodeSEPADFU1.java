
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType3CodeSEPA_DFU1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType3CodeSEPA_DFU1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SCOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentType3CodeSEPA_DFU1")
@XmlEnum
public enum DocumentType3CodeSEPADFU1 {


    /**
     * SCOR
     * 
     */
    SCOR;

    public String value() {
        return name();
    }

    public static DocumentType3CodeSEPADFU1 fromValue(String v) {
        return valueOf(v);
    }

}
