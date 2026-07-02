
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelledStatusReason16Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="4"/&gt;
 *     &lt;enumeration value="SCEX"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="CXLR"/&gt;
 *     &lt;enumeration value="BYIY"/&gt;
 *     &lt;enumeration value="CTHP"/&gt;
 *     &lt;enumeration value="CANZ"/&gt;
 *     &lt;enumeration value="CANT"/&gt;
 *     &lt;enumeration value="CSUB"/&gt;
 *     &lt;enumeration value="CANS"/&gt;
 *     &lt;enumeration value="CANI"/&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancelledStatusReason16Code")
@XmlEnum
public enum CancelledStatusReason16Code {


    /**
     * Transaction has been cancelled; the security no longer exists or is no longer eligible on the market instructed. For corporate action related cancellation, CORP should be used.
     * 
     */
    SCEX,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Transaction is rejected by the executing party, the rejection is final therefore the order is cancelled in the system.
     * 
     */
    CXLR,

    /**
     * Instruction has been cancelled because a buy-in has been initiated.
     * 
     */
    BYIY,

    /**
     * Instruction is cancelled by a Third party.
     * 
     */
    CTHP,

    /**
     * Original transaction has been cancelled and replaced to allow a partial or split settlement.
     * 
     */
    CANZ,

    /**
     * Original transaction has been cancelled and replaced due to a corporate action.
     * 
     */
    CANT,

    /**
     * Instruction has been cancelled by the agent due to an event deadline extension.
     * 
     */
    CSUB,

    /**
     * Transaction is cancelled by the system.
     * 
     */
    CANS,

    /**
     * Transaction is cancelled by yourself.
     * 
     */
    CANI,

    /**
     * Transaction has been cancelled due to a corporate action.
     * 
     */
    CORP;

    public String value() {
        return name();
    }

    public static CancelledStatusReason16Code fromValue(String v) {
        return valueOf(v);
    }

}
