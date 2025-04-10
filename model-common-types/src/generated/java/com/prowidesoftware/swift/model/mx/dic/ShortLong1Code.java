
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShortLong1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ShortLong1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SHOR"/>
 *     <enumeration value="LONG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ShortLong1Code")
@XmlEnum
public enum ShortLong1Code {


    /**
     * Position is short, that is, the balance is negative.
     * 
     */
    SHOR,

    /**
     * Position is long, that is, the balance is positive.
     * 
     */
    LONG;

    public String value() {
        return name();
    }

    public static ShortLong1Code fromValue(String v) {
        return valueOf(v);
    }

}
