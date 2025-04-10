
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeniedReason6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DeniedReason6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CDCY"/>
 *     <enumeration value="CDRE"/>
 *     <enumeration value="DCAN"/>
 *     <enumeration value="DSET"/>
 *     <enumeration value="DPRG"/>
 *     <enumeration value="DREP"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="CDRG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DeniedReason6Code")
@XmlEnum
public enum DeniedReason6Code {


    /**
     * Received after the account servicer's deadline.
     * 
     */
    ADEA,

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
     * Request was denied since the instruction has been cancelled.
     * 
     */
    DCAN,

    /**
     * Request was denied because the instruction was settled.
     * 
     */
    DSET,

    /**
     * Request was denied because the process of settlement is in progress.
     * 
     */
    DPRG,

    /**
     * Request was denied because the repo was cancelled.
     * 
     */
    DREP,

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
    CDRG;

    public String value() {
        return name();
    }

    public static DeniedReason6Code fromValue(String v) {
        return valueOf(v);
    }

}
