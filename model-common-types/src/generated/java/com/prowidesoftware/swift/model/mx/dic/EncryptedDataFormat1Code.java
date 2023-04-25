
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptedDataFormat1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EncryptedDataFormat1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASCI"/>
 *     <enumeration value="BINF"/>
 *     <enumeration value="EBCD"/>
 *     <enumeration value="HEXF"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
