
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entry2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Entry2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TRIA"/>
 *     <enumeration value="OFFI"/>
 *     <enumeration value="REQU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Entry2Code")
@XmlEnum
public enum Entry2Code {


    /**
     * Trial pay-in schedule.
     * 
     */
    TRIA,

    /**
     * Official pay-in schedule.
     * 
     */
    OFFI,

    /**
     * Pay-in schedule on request.
     * 
     */
    REQU;

    public String value() {
        return name();
    }

    public static Entry2Code fromValue(String v) {
        return valueOf(v);
    }

}
