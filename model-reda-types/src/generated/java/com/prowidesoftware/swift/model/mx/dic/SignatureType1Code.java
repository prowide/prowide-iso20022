
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignatureType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ORIG"/&gt;
 *     &lt;enumeration value="DIGI"/&gt;
 *     &lt;enumeration value="ELEC"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * A copy of a physical or orignal signature in an electronic format.
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
