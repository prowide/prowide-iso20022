
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessedStatus7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessedStatus7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="SENT"/&gt;
 *     &lt;enumeration value="SNAV"/&gt;
 *     &lt;enumeration value="WARN"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessedStatus7Code")
@XmlEnum
public enum ProcessedStatus7Code {


    /**
     * The instruction/request has been received.
     * 
     */
    RECE,

    /**
     * The advice has been sent to the market.
     * 
     */
    SENT,

    /**
     * System is not available. Instruction is sent outside of business hours.
     * 
     */
    SNAV,

    /**
     * The announcement has been accepted but another source has provided different information.
     * 
     */
    WARN,

    /**
     * The request is accepted.
     * 
     */
    PACK,

    /**
     * The processing of the request is pending.
     * 
     */
    PEND;

    public String value() {
        return name();
    }

    public static ProcessedStatus7Code fromValue(String v) {
        return valueOf(v);
    }

}
