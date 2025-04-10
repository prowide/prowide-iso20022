
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASTL"/>
 *     <enumeration value="AAUT"/>
 *     <enumeration value="ACCF"/>
 *     <enumeration value="ARCF"/>
 *     <enumeration value="MTCH"/>
 *     <enumeration value="PSTL"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="STLD"/>
 *     <enumeration value="STCR"/>
 *     <enumeration value="SPLT"/>
 *     <enumeration value="NMAT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementStatus3Code")
@XmlEnum
public enum SettlementStatus3Code {


    /**
     * Settlement is accepted for settlement.
     * 
     */
    ASTL,

    /**
     * Settlement is awaiting authorisation.
     * 
     */
    AAUT,

    /**
     * Settlement is awaiting confirmation of creation.
     * 
     */
    ACCF,

    /**
     * Settlement is awaiting confirmation of rescind.
     * 
     */
    ARCF,

    /**
     * Instruction is matched.
     * 
     */
    MTCH,

    /**
     * Part, but not all, of a Trade's value has settled, and no further elements of the Trade's value are expected to be settled.
     * 
     */
    PSTL,

    /**
     * Settlement is rejected.
     * 
     */
    RJCT,

    /**
     * Settlement is complete.
     * 
     */
    STLD,

    /**
     * Settlement has been created.
     * 
     */
    STCR,

    /**
     * Settlement is split.
     * 
     */
    SPLT,

    /**
     * Instruction is unmatched.
     * 
     */
    NMAT;

    public String value() {
        return name();
    }

    public static SettlementStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
