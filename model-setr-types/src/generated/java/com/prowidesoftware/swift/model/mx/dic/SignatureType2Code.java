
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SignatureType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DIGI"/>
 *     <enumeration value="ELEC"/>
 *     <enumeration value="NONE"/>
 *     <enumeration value="ORIG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SignatureType2Code")
@XmlEnum
public enum SignatureType2Code {


    /**
     * Technical signature that includes algorithms and private key and public key information. Used to sign and verify the contents of a message.
     * 
     */
    DIGI,

    /**
     * Copy of a physical or original signature in an electronic format.
     * 
     */
    ELEC,

    /**
     * No signature.
     * 
     */
    NONE,

    /**
     * Written signature. May also be known as a physical or wet signature.
     * 
     */
    ORIG;

    public String value() {
        return name();
    }

    public static SignatureType2Code fromValue(String v) {
        return valueOf(v);
    }

}
