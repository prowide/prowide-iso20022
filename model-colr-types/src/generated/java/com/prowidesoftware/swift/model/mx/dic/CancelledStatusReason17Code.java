
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancelledStatusReason17Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANI"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="CSUB"/>
 *     <enumeration value="CANS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
