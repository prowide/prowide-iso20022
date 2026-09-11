
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDayConvention2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BusinessDayConvention2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FWNG"/>
 *     <enumeration value="FRNC"/>
 *     <enumeration value="MODF"/>
 *     <enumeration value="NEAR"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PREC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BusinessDayConvention2Code")
@XmlEnum
public enum BusinessDayConvention2Code {


    /**
     * Date will be the first following day that is a business day.
     * 
     */
    FWNG,

    /**
     * Floating rate note convention.
     * 
     */
    FRNC,

    /**
     * Date will be the first following day that is a business day unless that day falls in the next calendar month, in which case that date will be the first preceding day that is a business day.
     * 
     */
    MODF,

    /**
     * Date will be the first preceding day that is a business day unless that day falls on a day other than a sunday or a monday, and will be the first following day that is a business day, if the relevant date otherwise falls on a Sunday or a Monday.
     * 
     */
    NEAR,

    /**
     * Other business day convention.
     * 
     */
    OTHR,

    /**
     * Non-business day will be adjusted to the first preceding day that is a business day.
     * 
     */
    PREC;

    public String value() {
        return name();
    }

    public static BusinessDayConvention2Code fromValue(String v) {
        return valueOf(v);
    }

}
