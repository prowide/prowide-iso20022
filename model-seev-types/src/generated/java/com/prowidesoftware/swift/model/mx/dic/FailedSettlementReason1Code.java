
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailedSettlementReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FailedSettlementReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANE"/>
 *     <enumeration value="CADI"/>
 *     <enumeration value="DANE"/>
 *     <enumeration value="AADI"/>
 *     <enumeration value="INSE"/>
 *     <enumeration value="INDI"/>
 *     <enumeration value="INCA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FailedSettlementReason1Code")
@XmlEnum
public enum FailedSettlementReason1Code {


    /**
     * Credit account is not eligible.
     * 
     */
    CANE,

    /**
     * Credit account is disabled.
     * 
     */
    CADI,

    /**
     * Debit account is not eligible.
     * 
     */
    DANE,

    /**
     * Debit account is disabled.
     * 
     */
    AADI,

    /**
     * Insufficient securities on the account to settle.
     * 
     */
    INSE,

    /**
     * The distribution is incomplete.
     * 
     */
    INDI,

    /**
     * Insufficient cash on the account to settle.
     * 
     */
    INCA;

    public String value() {
        return name();
    }

    public static FailedSettlementReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
