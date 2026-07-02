
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RestrictionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SELR"/&gt;
 *     &lt;enumeration value="BUYR"/&gt;
 *     &lt;enumeration value="PLAR"/&gt;
 *     &lt;enumeration value="HOLR"/&gt;
 *     &lt;enumeration value="VOTR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
