
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportDocumentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupportDocumentType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LFBK"/&gt;
 *     &lt;enumeration value="LTBK"/&gt;
 *     &lt;enumeration value="SUPP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
