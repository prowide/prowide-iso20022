
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportDocumentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SupportDocumentType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LFBK"/>
 *     <enumeration value="LTBK"/>
 *     <enumeration value="SUPP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SupportDocumentType1Code")
@XmlEnum
public enum SupportDocumentType1Code {


    /**
     * Document is a letter from the bank.
     * 
     */
    LFBK,

    /**
     * Document is a letter to the bank.
     * 
     */
    LTBK,

    /**
     * Document is a supporting document.
     * 
     */
    SUPP;

    public String value() {
        return name();
    }

    public static SupportDocumentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
