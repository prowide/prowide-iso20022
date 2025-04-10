
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessedStatus7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProcessedStatus7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RECE"/>
 *     <enumeration value="SENT"/>
 *     <enumeration value="SNAV"/>
 *     <enumeration value="WARN"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="PEND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
