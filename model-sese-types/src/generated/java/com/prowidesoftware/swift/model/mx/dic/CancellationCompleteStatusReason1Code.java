
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationCompleteStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancellationCompleteStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANI"/&gt;
 *     &lt;enumeration value="CANS"/&gt;
 *     &lt;enumeration value="CSUB"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancellationCompleteStatusReason1Code")
@XmlEnum
public enum CancellationCompleteStatusReason1Code {


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
     * Transaction is cancelled by the agent.
     * 
     */
    CSUB,

    /**
     * Other (see additional information).
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static CancellationCompleteStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
