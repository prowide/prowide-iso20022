
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataWriting2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardDataWriting2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ICPY"/>
 *     <enumeration value="MGSP"/>
 *     <enumeration value="ICCP"/>
 *     <enumeration value="MSIP"/>
 *     <enumeration value="UNSP"/>
 *     <enumeration value="MGST"/>
 *     <enumeration value="ICCY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardDataWriting2Code")
@XmlEnum
public enum CardDataWriting2Code {


    /**
     * ICC contactless proximity
     * 
     */
    ICPY,

    /**
     * Magnetic stripe is read, only partial data is available.
     * 
     */
    MGSP,

    /**
     * Integrated circuit card read; only partial data is available.
     * 
     */
    ICCP,

    /**
     * Magstripe image contactless proximity
     * 
     */
    MSIP,

    /**
     * Unspecified capability.
     * 
     */
    UNSP,

    /**
     * Magnetic stripe.
     * 
     */
    MGST,

    /**
     * ICC contact capability
     * 
     */
    ICCY;

    public String value() {
        return name();
    }

    public static CardDataWriting2Code fromValue(String v) {
        return valueOf(v);
    }

}
