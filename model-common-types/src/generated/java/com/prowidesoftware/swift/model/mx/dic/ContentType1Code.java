
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ContentType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DATA"/>
 *     <enumeration value="SIGN"/>
 *     <enumeration value="EVLP"/>
 *     <enumeration value="DGST"/>
 *     <enumeration value="ECRP"/>
 *     <enumeration value="AUTH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ContentType1Code")
@XmlEnum
public enum ContentType1Code {


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
     * Encrypted data - (ASN.1 Object Identifier: id-encryptedData).
     * 
     */
    ECRP,

    /**
     * MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData).
     * 
     */
    AUTH;

    public String value() {
        return name();
    }

    public static ContentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
