
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingReason17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingReason17Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingReason17Code")
@XmlEnum
public enum PendingReason17Code {


    /**
     * Awaiting confirmation from the counterparty.
     * 
     */
    CONF;

    public String value() {
        return name();
    }

    public static PendingReason17Code fromValue(String v) {
        return valueOf(v);
    }

}
