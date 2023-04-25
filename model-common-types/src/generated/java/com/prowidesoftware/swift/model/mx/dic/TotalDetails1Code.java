
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalDetails1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TotalDetails1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPID"/>
 *     <enumeration value="PIID"/>
 *     <enumeration value="TGID"/>
 *     <enumeration value="SNID"/>
 *     <enumeration value="SAID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TotalDetails1Code")
@XmlEnum
public enum TotalDetails1Code {


    /**
     * Give the totals result per Operator Identification value.
     * 
     */
    OPID,

    /**
     * Give the totals result per POI Identification value.
     * 
     */
    PIID,

    /**
     * Give the totals result per Totals Group Identification value.
     * 
     */
    TGID,

    /**
     * Give the totals result per Shift Number Identification value.
     * 
     */
    SNID,

    /**
     * Give the totals result per Sale Identification value.
     * 
     */
    SAID;

    public String value() {
        return name();
    }

    public static TotalDetails1Code fromValue(String v) {
        return valueOf(v);
    }

}
