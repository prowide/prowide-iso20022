
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeniedReason7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeniedReason7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="DCAL"/&gt;
 *     &lt;enumeration value="CDCY"/&gt;
 *     &lt;enumeration value="CDRE"/&gt;
 *     &lt;enumeration value="CDRG"/&gt;
 *     &lt;enumeration value="DCAN"/&gt;
 *     &lt;enumeration value="DPRG"/&gt;
 *     &lt;enumeration value="DFOR"/&gt;
 *     &lt;enumeration value="DREP"/&gt;
 *     &lt;enumeration value="DSET"/&gt;
 *     &lt;enumeration value="IPNC"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
