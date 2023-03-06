
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephonyCallType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephonyCallType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VCML"/&gt;
 *     &lt;enumeration value="TFPC"/&gt;
 *     &lt;enumeration value="PAGE"/&gt;
 *     &lt;enumeration value="OGPC"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTCL"/&gt;
 *     &lt;enumeration value="ICPC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
