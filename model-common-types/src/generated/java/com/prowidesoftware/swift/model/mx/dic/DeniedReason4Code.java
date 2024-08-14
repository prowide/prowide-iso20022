
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeniedReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DeniedReason4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DPRG"/>
 *     <enumeration value="DREP"/>
 *     <enumeration value="DSET"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="CDRG"/>
 *     <enumeration value="CDCY"/>
 *     <enumeration value="CDRE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DeniedReason4Code")
@XmlEnum
public enum DeniedReason4Code {


    /**
     * Received after the account servicer's deadline.
     * 
     */
    ADEA,

    /**
     * Cancellation request was denied since the instruction has already been cancelled.
     * 
     */
    DCAN,

    /**
     * Cancellation request was denied because the process of settlement is in progress.
     * 
     */
    DPRG,

    /**
     * Cancellation request was denied because the repo was cancelled.
     * 
     */
    DREP,

    /**
     * Cancellation request was denied because the instruction was already settled.
     * 
     */
    DSET,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Execution is denied due to the execution of a process at the registrar.
     * 
     */
    CDRG,

    /**
     * Execution is denied due to a process linked to the currency of the transaction.
     * 
     */
    CDCY,

    /**
     * Execution is denied due to the execution of a process of realignment at the issuer CSD.
     * 
     */
    CDRE;

    public String value() {
        return name();
    }

    public static DeniedReason4Code fromValue(String v) {
        return valueOf(v);
    }

}
