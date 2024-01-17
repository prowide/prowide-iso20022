
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationCompleteStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationCompleteStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANI"/>
 *     <enumeration value="CANS"/>
 *     <enumeration value="CSUB"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationCompleteStatusReason1Code")
@XmlEnum
public enum CancellationCompleteStatusReason1Code {


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
    CSUB,

    /**
     * Other (see additional information).
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static CancellationCompleteStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
