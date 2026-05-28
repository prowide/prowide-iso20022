
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingCancellationReason8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingCancellationReason8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PCAT"/>
 *     <enumeration value="ECRD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingCancellationReason8Code")
@XmlEnum
public enum PendingCancellationReason8Code {


    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Pending acceptance from the counterparty.
     * 
     */
    PCAT,

    /**
     * Received after the election to counterparty response market deadline.
     * 
     */
    ECRD;

    public String value() {
        return name();
    }

    public static PendingCancellationReason8Code fromValue(String v) {
        return valueOf(v);
    }

}
