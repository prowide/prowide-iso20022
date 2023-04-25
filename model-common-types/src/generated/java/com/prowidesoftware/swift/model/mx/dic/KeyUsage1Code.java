
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyUsage1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="KeyUsage1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ENCR"/>
 *     <enumeration value="DCPT"/>
 *     <enumeration value="DENC"/>
 *     <enumeration value="DDEC"/>
 *     <enumeration value="TRNI"/>
 *     <enumeration value="TRNX"/>
 *     <enumeration value="MACG"/>
 *     <enumeration value="MACV"/>
 *     <enumeration value="SIGG"/>
 *     <enumeration value="SUGV"/>
 *     <enumeration value="PINE"/>
 *     <enumeration value="PIND"/>
 *     <enumeration value="PINV"/>
 *     <enumeration value="KEYG"/>
 *     <enumeration value="KEYI"/>
 *     <enumeration value="KEYX"/>
 *     <enumeration value="KEYD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
