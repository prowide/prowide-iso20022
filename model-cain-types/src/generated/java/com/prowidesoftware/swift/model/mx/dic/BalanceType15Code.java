
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BalanceType15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMOH"/>
 *     <enumeration value="AMTO"/>
 *     <enumeration value="AMTD"/>
 *     <enumeration value="CRDL"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="AVLB"/>
 *     <enumeration value="CLRI"/>
 *     <enumeration value="LDGR"/>
 *     <enumeration value="PNTS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BalanceType15Code")
@XmlEnum
public enum BalanceType15Code {


    /**
     * Amount put on hold.
     * 
     */
    AMOH,

    /**
     * Amount of money owed
     * 
     */
    AMTO,

    /**
     * Amount of money due.
     * 
     */
    AMTD,

    /**
     * Credit line available.
     * 
     */
    CRDL,

    /**
     * Other type of balance defined at national level
     * 
     */
    OTHN,

    /**
     * Other type of balance defined at private level.
     * 
     */
    OTHP,

    /**
     * Balance of money or securities that is at the disposal of the account owner on the date specified.
     * 
     */
    AVLB,

    /**
     * Cleared items balance. 
     * 
     */
    CLRI,

    /**
     * Ledger balance refers to posted transactions (e.g. limit authorisation amount - posted transactions).
     * 
     */
    LDGR,

    /**
     * Value expressed in points.
     * 
     */
    PNTS;

    public String value() {
        return name();
    }

    public static BalanceType15Code fromValue(String v) {
        return valueOf(v);
    }

}
