
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason9Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason9Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONF"/>
 *     <enumeration value="CDAC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason9Code__1")
@XmlEnum
public enum PendingReason9Code1 {


    /**
     * Awaiting confirmation from the counterparty.
     * 
     */
    CONF,

    /**
     * Awaiting cancellation of one of the party.
     * 
     */
    CDAC;

    public String value() {
        return name();
    }

    public static PendingReason9Code1 fromValue(String v) {
        return valueOf(v);
    }

}
