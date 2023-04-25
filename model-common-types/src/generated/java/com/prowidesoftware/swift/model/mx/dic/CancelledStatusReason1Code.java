
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancelledStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANI"/>
 *     <enumeration value="CANS"/>
 *     <enumeration value="CSUB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancelledStatusReason1Code")
@XmlEnum
public enum CancelledStatusReason1Code {


    /**
     * Transaction is cancelled by yourself.
     * 
     */
    CANI,

    /**
     * Transaction is cancelled by the system.
     * 
     */
    CANS,

    /**
     * Transaction is cancelled by the agent.
     * 
     */
    CSUB;

    public String value() {
        return name();
    }

    public static CancelledStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
