
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancelledStatusReason3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNTA"/>
 *     <enumeration value="CNCL"/>
 *     <enumeration value="CNIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
