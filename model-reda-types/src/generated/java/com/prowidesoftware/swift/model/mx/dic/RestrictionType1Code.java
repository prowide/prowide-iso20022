
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RestrictionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SELR"/>
 *     <enumeration value="BUYR"/>
 *     <enumeration value="PLAR"/>
 *     <enumeration value="HOLR"/>
 *     <enumeration value="VOTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RestrictionType1Code")
@XmlEnum
public enum RestrictionType1Code {


    /**
     * Selling restriction.
     * 
     */
    SELR,

    /**
     * Buying restriction.
     * 
     */
    BUYR,

    /**
     * Placing restriction.
     * 
     */
    PLAR,

    /**
     * Holding restriction.
     * 
     */
    HOLR,

    /**
     * Voting restriction.
     * 
     */
    VOTR;

    public String value() {
        return name();
    }

    public static RestrictionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
