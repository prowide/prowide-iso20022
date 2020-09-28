
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingCancellationReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingCancellationReason4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PendingCancellationReason4Code")
@XmlEnum
public enum PendingCancellationReason4Code {


    /**
     * Instruction received after the account servicers specified deadline.
     * 
     */
    ADEA,

    /**
     * Unrecognised or invalid instructed quantity.
     * 
     */
    DQUA,

    /**
     * Received after market deadline.
     * 
     */
    LATE,

    /**
     * Other reason.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static PendingCancellationReason4Code fromValue(String v) {
        return valueOf(v);
    }

}
