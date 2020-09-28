
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StayOnSideType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StayOnSideType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OFFR"/&gt;
 *     &lt;enumeration value="BIDE"/&gt;
 *     &lt;enumeration value="DCAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StayOnSideType1Code")
@XmlEnum
public enum StayOnSideType1Code {


    /**
     * An order pegged against the offer price.
     * 
     */
    OFFR,

    /**
     * An order pegged against  the bid price.
     * 
     */
    BIDE,

    /**
     * Indicates a voluntary absence of choice/decision.
     * 
     */
    DCAR;

    public String value() {
        return name();
    }

    public static StayOnSideType1Code fromValue(String v) {
        return valueOf(v);
    }

}
