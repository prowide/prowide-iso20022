
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AAUT"/>
 *     <enumeration value="ASTL"/>
 *     <enumeration value="STCR"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="SPLT"/>
 *     <enumeration value="PSTL"/>
 *     <enumeration value="STLD"/>
 *     <enumeration value="ACCF"/>
 *     <enumeration value="ARCF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
