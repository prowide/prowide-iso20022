
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RateType13Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UKWN"/>
 *     <enumeration value="NILP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RateType13Code")
@XmlEnum
public enum RateType13Code {


    /**
     * Rate is unknown by the sender or has not been established.
     * 
     */
    UKWN,

    /**
     * Rate will not be paid.
     * 
     */
    NILP;

    public String value() {
        return name();
    }

    public static RateType13Code fromValue(String v) {
        return valueOf(v);
    }

}
