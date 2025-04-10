
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RateType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SCHD"/>
 *     <enumeration value="USCD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RateType7Code")
@XmlEnum
public enum RateType7Code {


    /**
     * Rate of the scheduled payment.
     * 
     */
    SCHD,

    /**
     * Rate of the unscheduled payment.
     * 
     */
    USCD;

    public String value() {
        return name();
    }

    public static RateType7Code fromValue(String v) {
        return valueOf(v);
    }

}
