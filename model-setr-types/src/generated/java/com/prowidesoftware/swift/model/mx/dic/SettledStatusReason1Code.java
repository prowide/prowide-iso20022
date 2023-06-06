
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettledStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettledStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UPST"/>
 *     <enumeration value="CPST"/>
 *     <enumeration value="UCPS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettledStatusReason1Code")
@XmlEnum
public enum SettledStatusReason1Code {


    /**
     * Units are partially settled.
     * 
     */
    UPST,

    /**
     * Cash is partially settled.
     * 
     */
    CPST,

    /**
     * Units and cash are both partially settled.
     * 
     */
    UCPS;

    public String value() {
        return name();
    }

    public static SettledStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
