
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalDetails1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TotalDetails1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPID"/&gt;
 *     &lt;enumeration value="PIID"/&gt;
 *     &lt;enumeration value="TGID"/&gt;
 *     &lt;enumeration value="SNID"/&gt;
 *     &lt;enumeration value="SAID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
