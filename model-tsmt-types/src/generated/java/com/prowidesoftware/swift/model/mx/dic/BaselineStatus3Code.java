
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaselineStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BaselineStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROP"/&gt;
 *     &lt;enumeration value="CLSD"/&gt;
 *     &lt;enumeration value="PMTC"/&gt;
 *     &lt;enumeration value="ESTD"/&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="AMRQ"/&gt;
 *     &lt;enumeration value="RARQ"/&gt;
 *     &lt;enumeration value="CLRQ"/&gt;
 *     &lt;enumeration value="SCRQ"/&gt;
 *     &lt;enumeration value="SERQ"/&gt;
 *     &lt;enumeration value="DARQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BaselineStatus3Code")
@XmlEnum
public enum BaselineStatus3Code {


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
    SCRQ,

    /**
     * State of a baseline when a status extension has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).
     * 
     */
    SERQ,

    /**
     * State of a baseline, after establishment, when data set acceptance has been requested by the matching engine and not all responses have been received from the relevant party(ies).
     * 
     */
    DARQ;

    public String value() {
        return name();
    }

    public static BaselineStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
