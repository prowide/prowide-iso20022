
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaselineStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BaselineStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PROP"/>
 *     <enumeration value="CLSD"/>
 *     <enumeration value="PMTC"/>
 *     <enumeration value="ESTD"/>
 *     <enumeration value="ACTV"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="AMRQ"/>
 *     <enumeration value="RARQ"/>
 *     <enumeration value="CLRQ"/>
 *     <enumeration value="SCRQ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BaselineStatus1Code")
@XmlEnum
public enum BaselineStatus1Code {


    /**
     * Initial state of a baseline in the push-through model.
     * 
     */
    PROP,

    /**
     * Final state of a baseline, in which only reporting is allowed.
     * 
     */
    CLSD,

    /**
     * State of the baseline when an initial and at least one twin baselines have been submitted but it has not yet been agreed by all parties.
     * 
     */
    PMTC,

    /**
     * State of the baseline when it has been agreed by all parties.
     * 
     */
    ESTD,

    /**
     * State of a baseline, after establishment, when one or more instructions (eg, amendment request, data set submission) have been processed.
     * 
     */
    ACTV,

    /**
     * State of a baseline, after establishment, when all match instructions have been processed, and no such instruction is allowed anymore.
     * 
     */
    COMP,

    /**
     * State of a baseline, after establishment, when an amendment has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).
     * 
     */
    AMRQ,

    /**
     * State of a baseline, after establishment, when an reactivation has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).
     * 
     */
    RARQ,

    /**
     * State of a baseline, after establishment, when a closure has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).
     * 
     */
    CLRQ,

    /**
     * State of a baseline, after establishment, when a completion has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).
     * 
     */
    SCRQ;

    public String value() {
        return name();
    }

    public static BaselineStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
