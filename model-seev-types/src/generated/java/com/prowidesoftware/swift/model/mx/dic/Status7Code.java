
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSUB"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="CAND"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="NOIN"/&gt;
 *     &lt;enumeration value="RCIS"/&gt;
 *     &lt;enumeration value="STIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status7Code")
@XmlEnum
public enum Status7Code {


    /**
     * Instruction has been cancelled by the agent, for example, due to an event deadline extension.
     * 
     */
    CSUB,

    /**
     * Instruction has been accepted and is validated for further processing.
     * 
     */
    PACK,

    /**
     * Instruction has been cancelled.
     * 
     */
    CAND,

    /**
     * Processing has been completed.
     * 
     */
    COMP,

    /**
     * No instruction has been received (to be used in a reminder).
     * 
     */
    NOIN,

    /**
     * Instruction has been received by Issuer.
     * 
     */
    RCIS,

    /**
     * Standing instruction is applied.
     * 
     */
    STIN;

    public String value() {
        return name();
    }

    public static Status7Code fromValue(String v) {
        return valueOf(v);
    }

}
