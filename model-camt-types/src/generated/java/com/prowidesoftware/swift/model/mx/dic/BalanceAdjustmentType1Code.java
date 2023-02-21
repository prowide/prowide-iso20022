
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceAdjustmentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BalanceAdjustmentType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LDGR"/&gt;
 *     &lt;enumeration value="FLOT"/&gt;
 *     &lt;enumeration value="CLLD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BalanceAdjustmentType1Code")
@XmlEnum
public enum BalanceAdjustmentType1Code {


    /**
     * Adjustment applies to the average ledger (book) balance.
     * 
     */
    LDGR,

    /**
     * Adjustment applies to the average float (unavailable) balance.
     * 
     */
    FLOT,

    /**
     * Adjustment applies to the average collected (book less float) balance.
     * 
     */
    CLLD;

    public String value() {
        return name();
    }

    public static BalanceAdjustmentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
