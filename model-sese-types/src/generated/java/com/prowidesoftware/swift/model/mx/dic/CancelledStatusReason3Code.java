
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelledStatusReason3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CNTA"/&gt;
 *     &lt;enumeration value="CNCL"/&gt;
 *     &lt;enumeration value="CNIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancelledStatusReason3Code")
@XmlEnum
public enum CancelledStatusReason3Code {


    /**
     * Transaction is cancelled by the transfer agent.
     * 
     */
    CNTA,

    /**
     * Transaction is cancelled by the client.
     * 
     */
    CNCL,

    /**
     * Transaction is cancelled by the intermediary.
     * 
     */
    CNIN;

    public String value() {
        return name();
    }

    public static CancelledStatusReason3Code fromValue(String v) {
        return valueOf(v);
    }

}
