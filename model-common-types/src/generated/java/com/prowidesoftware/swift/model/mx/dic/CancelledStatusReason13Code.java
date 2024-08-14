
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancelledStatusReason13Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANI"/>
 *     <enumeration value="CANS"/>
 *     <enumeration value="CSUB"/>
 *     <enumeration value="CXLR"/>
 *     <enumeration value="CANT"/>
 *     <enumeration value="CANZ"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="SCEX"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="CTHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancelledStatusReason13Code")
@XmlEnum
public enum CancelledStatusReason13Code {


    /**
     * Transaction is cancelled by yourself.
     * 
     */
    CANI,

    /**
     * Transaction is cancelled by the system.
     * 
     */
    CANS,

    /**
     * Instruction has been cancelled by the agent due to an event deadline extension.
     * 
     */
    CSUB,

    /**
     * Transaction is rejected by the executing party, the rejection is final therefore the order is cancelled in the system.
     * 
     */
    CXLR,

    /**
     * Original transaction has been cancelled and replaced due to a corporate action.
     * 
     */
    CANT,

    /**
     * Original transaction has been cancelled and replaced to allow a partial or split settlement.
     * 
     */
    CANZ,

    /**
     * Transaction has been cancelled due to a corporate action.
     * 
     */
    CORP,

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
     * Instruction is cancelled by a Third party.
     * 
     */
    CTHP;

    public String value() {
        return name();
    }

    public static CancelledStatusReason13Code fromValue(String v) {
        return valueOf(v);
    }

}
