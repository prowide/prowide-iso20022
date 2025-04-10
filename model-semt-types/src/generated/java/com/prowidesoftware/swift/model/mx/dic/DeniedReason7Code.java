
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeniedReason7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DeniedReason7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="DCAL"/>
 *     <enumeration value="CDCY"/>
 *     <enumeration value="CDRE"/>
 *     <enumeration value="CDRG"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DPRG"/>
 *     <enumeration value="DFOR"/>
 *     <enumeration value="DREP"/>
 *     <enumeration value="DSET"/>
 *     <enumeration value="IPNC"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DeniedReason7Code")
@XmlEnum
public enum DeniedReason7Code {


    /**
     * Received after the account servicer's deadline.
     * 
     */
    ADEA,

    /**
     * Repo call request was denied since another call already applies.
     * 
     */
    DCAL,

    /**
     * Execution is denied due to a process linked to the currency of the transaction.
     * 
     */
    CDCY,

    /**
     * Execution is denied due to the execution of a process of realignment at the issuer CSD.
     * 
     */
    CDRE,

    /**
     * Execution is denied due to the execution of a process at the registrar.
     * 
     */
    CDRG,

    /**
     * Request was denied since the instruction has been cancelled.
     * 
     */
    DCAN,

    /**
     * Request was denied because the process of settlement is in progress.
     * 
     */
    DPRG,

    /**
     * Repo call request was denied. Call not allowed on the concerned repo, for example, out of delay.
     * 
     */
    DFOR,

    /**
     * Request was denied because the repo was cancelled.
     * 
     */
    DREP,

    /**
     * Request was denied because the instruction was settled.
     * 
     */
    DSET,

    /**
     * Instruction has been processed and cannot be cancelled.
     * 
     */
    IPNC,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static DeniedReason7Code fromValue(String v) {
        return valueOf(v);
    }

}
