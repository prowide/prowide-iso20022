
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptedDataFormat1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncryptedDataFormat1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASCI"/&gt;
 *     &lt;enumeration value="BINF"/&gt;
 *     &lt;enumeration value="EBCD"/&gt;
 *     &lt;enumeration value="HEXF"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EncryptedDataFormat1Code")
@XmlEnum
public enum EncryptedDataFormat1Code {


    /**
     * ASCII Format.
     * 
     */
    ASCI,

    /**
     * Binary format.
     * 
     */
    BINF,

    /**
     * EBCDIC format.
     * 
     */
    EBCD,

    /**
     * HEX Format.
     * 
     */
    HEXF,

    /**
     * Other format defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of format defined at private level.
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static EncryptedDataFormat1Code fromValue(String v) {
        return valueOf(v);
    }

}
