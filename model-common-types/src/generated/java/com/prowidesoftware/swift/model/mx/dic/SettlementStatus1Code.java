
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AAUT"/&gt;
 *     &lt;enumeration value="ASTL"/&gt;
 *     &lt;enumeration value="STCR"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="SPLT"/&gt;
 *     &lt;enumeration value="PSTL"/&gt;
 *     &lt;enumeration value="STLD"/&gt;
 *     &lt;enumeration value="ACCF"/&gt;
 *     &lt;enumeration value="ARCF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementStatus1Code")
@XmlEnum
public enum SettlementStatus1Code {


    /**
     * Settlement is awaiting authorisation.
     * 
     */
    AAUT,

    /**
     * Settlement is accepted for settlement.
     * 
     */
    ASTL,

    /**
     * Settlement has been created.
     * 
     */
    STCR,

    /**
     * Settlement is rejected.
     * 
     */
    RJCT,

    /**
     * Settlement is split.
     * 
     */
    SPLT,

    /**
     * Part, but not all, of a Trade's value has settled, and no further elements of the Trade's value are expected to be settled.
     * 
     */
    PSTL,

    /**
     * Settlement is complete.
     * 
     */
    STLD,

    /**
     * Settlement is awaiting confirmation of creation.
     * 
     */
    ACCF,

    /**
     * Settlement is awaiting confirmation of rescind.
     * 
     */
    ARCF;

    public String value() {
        return name();
    }

    public static SettlementStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
