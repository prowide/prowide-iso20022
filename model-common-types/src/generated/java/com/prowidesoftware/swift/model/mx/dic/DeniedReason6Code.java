
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeniedReason6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeniedReason6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="CDCY"/&gt;
 *     &lt;enumeration value="CDRE"/&gt;
 *     &lt;enumeration value="DCAN"/&gt;
 *     &lt;enumeration value="DSET"/&gt;
 *     &lt;enumeration value="DPRG"/&gt;
 *     &lt;enumeration value="DREP"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="CDRG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
