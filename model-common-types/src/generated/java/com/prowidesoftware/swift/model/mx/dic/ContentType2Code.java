
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DATA"/&gt;
 *     &lt;enumeration value="SIGN"/&gt;
 *     &lt;enumeration value="EVLP"/&gt;
 *     &lt;enumeration value="DGST"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContentType2Code")
@XmlEnum
public enum ContentType2Code {


    /**
     * Generic, non cryptographic, or unqualified data content - (ASN.1 Object Identifier: id-data).
     * 
     */
    DATA,

    /**
     * Digital signature - (ASN.1 Object Identifier: id-signedData).
     * 
     */
    SIGN,

    /**
     * Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData).
     * 
     */
    EVLP,

    /**
     * Message digest - (ASN.1 Object Identifier: id-digestedData).
     * 
     */
    DGST,

    /**
     * MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData).
     * 
     */
    AUTH;

    public String value() {
        return name();
    }

    public static ContentType2Code fromValue(String v) {
        return valueOf(v);
    }

}
