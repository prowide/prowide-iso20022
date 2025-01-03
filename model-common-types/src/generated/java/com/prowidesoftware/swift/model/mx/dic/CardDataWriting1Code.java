
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataWriting1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardDataWriting1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ICPY"/>
 *     <enumeration value="MGST"/>
 *     <enumeration value="ICCY"/>
 *     <enumeration value="MSIP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="UNSP"/>
 *     <enumeration value="OTHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardDataWriting1Code")
@XmlEnum
public enum CardDataWriting1Code {


    /**
     * ICC contactless proximity
     * 
     */
    ICPY,

    /**
     * Magnetic stripe.
     * 
     */
    MGST,

    /**
     * ICC contact capability
     * 
     */
    ICCY,

    /**
     * Magstripe image contactless proximity
     * 
     */
    MSIP,

    /**
     * Other national capability type assigned at national level.
     * 
     */
    OTHN,

    /**
     * Unspecified capability.
     * 
     */
    UNSP,

    /**
     * Other card reading capability assigned on a private basis.
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static CardDataWriting1Code fromValue(String v) {
        return valueOf(v);
    }

}
