
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason30Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason30Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHR"/>
 *     <enumeration value="BUMM"/>
 *     <enumeration value="ECRD"/>
 *     <enumeration value="WCTF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason30Code")
@XmlEnum
public enum PendingReason30Code {


    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Counterparty disagreement on the chosen corporate action outturn.
     * 
     */
    BUMM,

    /**
     * Received after the election to counterparty response market deadline.
     * 
     */
    ECRD,

    /**
     * Allegement has been sent out to counterparty. Waiting for the response.
     * 
     */
    WCTF;

    public String value() {
        return name();
    }

    public static PendingReason30Code fromValue(String v) {
        return valueOf(v);
    }

}
