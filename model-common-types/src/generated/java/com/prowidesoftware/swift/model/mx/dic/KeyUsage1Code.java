
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyUsage1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyUsage1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENCR"/&gt;
 *     &lt;enumeration value="DCPT"/&gt;
 *     &lt;enumeration value="DENC"/&gt;
 *     &lt;enumeration value="DDEC"/&gt;
 *     &lt;enumeration value="TRNI"/&gt;
 *     &lt;enumeration value="TRNX"/&gt;
 *     &lt;enumeration value="MACG"/&gt;
 *     &lt;enumeration value="MACV"/&gt;
 *     &lt;enumeration value="SIGG"/&gt;
 *     &lt;enumeration value="SUGV"/&gt;
 *     &lt;enumeration value="PINE"/&gt;
 *     &lt;enumeration value="PIND"/&gt;
 *     &lt;enumeration value="PINV"/&gt;
 *     &lt;enumeration value="KEYG"/&gt;
 *     &lt;enumeration value="KEYI"/&gt;
 *     &lt;enumeration value="KEYX"/&gt;
 *     &lt;enumeration value="KEYD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KeyUsage1Code")
@XmlEnum
public enum KeyUsage1Code {


    /**
     * Key may encrypt.
     * 
     */
    ENCR,

    /**
     * Key may decrypt.
     * 
     */
    DCPT,

    /**
     * Key may encrypt data.
     * 
     */
    DENC,

    /**
     * Key may decrypt data.
     * 
     */
    DDEC,

    /**
     * Key may encrypt information before translation.
     * 
     */
    TRNI,

    /**
     * Key may encrypt information after translation.
     * 
     */
    TRNX,

    /**
     * Key may generate message authentication codes (MAC).
     * 
     */
    MACG,

    /**
     * Key may verify message authentication codes (MAC).
     * 
     */
    MACV,

    /**
     * Key may generate digital signatures.
     * 
     */
    SIGG,

    /**
     * Key may verify digital signatures.
     * 
     */
    SUGV,

    /**
     * Key may encrypt personal identification numbers (PIN).
     * 
     */
    PINE,

    /**
     * Key may decrypt personal identification numbers (PIN).
     * 
     */
    PIND,

    /**
     * Key may verify personal identification numbers (PIN).
     * 
     */
    PINV,

    /**
     * Key may generate keys.
     * 
     */
    KEYG,

    /**
     * Key may import keys.
     * 
     */
    KEYI,

    /**
     * Key may export keys.
     * 
     */
    KEYX,

    /**
     * Key may derive keys.
     * 
     */
    KEYD;

    public String value() {
        return name();
    }

    public static KeyUsage1Code fromValue(String v) {
        return valueOf(v);
    }

}
