
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelledStatusReason17Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANI"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="CSUB"/&gt;
 *     &lt;enumeration value="CANS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancelledStatusReason17Code")
@XmlEnum
public enum CancelledStatusReason17Code {


    /**
     * Transaction is cancelled by yourself.
     * 
     */
    CANI,

    /**
     * Other (see additional information).
     * 
     */
    OTHR,

    /**
     * Transaction is cancelled by the agent.
     * 
     */
    CSUB,

    /**
     * Transaction is cancelled by the system.
     * 
     */
    CANS;

    public String value() {
        return name();
    }

    public static CancelledStatusReason17Code fromValue(String v) {
        return valueOf(v);
    }

}
