
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephonyCallType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TelephonyCallType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VCML"/>
 *     <enumeration value="TFPC"/>
 *     <enumeration value="PAGE"/>
 *     <enumeration value="OGPC"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTCL"/>
 *     <enumeration value="ICPC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TelephonyCallType1Code")
@XmlEnum
public enum TelephonyCallType1Code {


    /**
     * Voice mail
     * 
     */
    VCML,

    /**
     * Toll free phone call
     * 
     */
    TFPC,

    /**
     * Page
     * 
     */
    PAGE,

    /**
     * Outgoing phone call
     * 
     */
    OGPC,

    /**
     * Other private
     * 
     */
    OTHP,

    /**
     * Other national
     * 
     */
    OTHN,

    /**
     * Other type of call not elsewhere classified. 
     * 
     */
    OTCL,

    /**
     * Incoming phone call
     * 
     */
    ICPC;

    public String value() {
        return name();
    }

    public static TelephonyCallType1Code fromValue(String v) {
        return valueOf(v);
    }

}
