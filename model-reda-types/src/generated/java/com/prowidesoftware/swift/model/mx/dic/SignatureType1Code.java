
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SignatureType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ORIG"/>
 *     <enumeration value="DIGI"/>
 *     <enumeration value="ELEC"/>
 *     <enumeration value="NONE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SignatureType1Code")
@XmlEnum
public enum SignatureType1Code {


    /**
     * The investor's written signature is required. Can also be known as physical or wet signature.
     * 
     */
    ORIG,

    /**
     * A technical signature that includes algorithms and private key and public key information. Used to sign and verify the contents of a message.
     * 
     */
    DIGI,

    /**
     * A copy of a physical or original signature in an electronic format.
     * 
     */
    ELEC,

    /**
     * There is no signature required in any form.
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static SignatureType1Code fromValue(String v) {
        return valueOf(v);
    }

}
