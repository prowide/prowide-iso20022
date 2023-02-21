
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AAUT"/&gt;
 *     &lt;enumeration value="ASTL"/&gt;
 *     &lt;enumeration value="STCR"/&gt;
 *     &lt;enumeration value="STLD"/&gt;
 *     &lt;enumeration value="ACCF"/&gt;
 *     &lt;enumeration value="ARCF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementStatus2Code")
@XmlEnum
public enum SettlementStatus2Code {


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

    public static SettlementStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
