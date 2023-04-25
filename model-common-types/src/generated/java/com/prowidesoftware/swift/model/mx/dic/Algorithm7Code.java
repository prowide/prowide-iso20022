
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ERSA"/>
 *     <enumeration value="RSAO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm7Code")
@XmlEnum
public enum Algorithm7Code {


    /**
     * RSA encryption algorithm - (ASN.1 Object Identifier: rsaEncryption).
     * 
     */
    ERSA,

    /**
     * RSA encryption scheme based on Optimal Asymmetric Encryption scheme (PKCS #1 version 2.1) - (ASN.1 Object Identifier: id-RSAES-OAEP).
     * 
     */
    RSAO;

    public String value() {
        return name();
    }

    public static Algorithm7Code fromValue(String v) {
        return valueOf(v);
    }

}
