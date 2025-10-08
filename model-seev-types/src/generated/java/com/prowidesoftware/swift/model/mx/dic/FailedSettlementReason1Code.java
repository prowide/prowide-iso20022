
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailedSettlementReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FailedSettlementReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANE"/&gt;
 *     &lt;enumeration value="CADI"/&gt;
 *     &lt;enumeration value="DANE"/&gt;
 *     &lt;enumeration value="AADI"/&gt;
 *     &lt;enumeration value="INSE"/&gt;
 *     &lt;enumeration value="INDI"/&gt;
 *     &lt;enumeration value="INCA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
