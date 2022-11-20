
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EVLP"/&gt;
 *     &lt;enumeration value="IFSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContentType3Code")
@XmlEnum
public enum ContentType3Code {


    /**
     * Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData).
     * 
     */
    EVLP,

    /**
     * General data encryption that conforms to the ISO 13492 standard.
     * 
     */
    IFSE;

    public String value() {
        return name();
    }

    public static ContentType3Code fromValue(String v) {
        return valueOf(v);
    }

}
