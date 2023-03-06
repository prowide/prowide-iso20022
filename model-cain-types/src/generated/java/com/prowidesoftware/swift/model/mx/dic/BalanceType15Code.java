
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BalanceType15Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMOH"/&gt;
 *     &lt;enumeration value="AMTO"/&gt;
 *     &lt;enumeration value="AMTD"/&gt;
 *     &lt;enumeration value="CRDL"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="AVLB"/&gt;
 *     &lt;enumeration value="CLRI"/&gt;
 *     &lt;enumeration value="LDGR"/&gt;
 *     &lt;enumeration value="PNTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
