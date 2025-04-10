
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StayOnSideType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StayOnSideType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OFFR"/>
 *     <enumeration value="BIDE"/>
 *     <enumeration value="DCAR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
     * An order pegged against the bid price.
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
