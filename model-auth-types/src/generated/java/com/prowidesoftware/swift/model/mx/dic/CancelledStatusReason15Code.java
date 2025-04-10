
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelledStatusReason15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancelledStatusReason15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANI"/>
 *     <enumeration value="CSUB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancelledStatusReason15Code")
@XmlEnum
public enum CancelledStatusReason15Code {


    /**
     * Transaction is cancelled by yourself.
     * 
     */
    CANI,

    /**
     * Instruction has been cancelled by the agent due to an event deadline extension.
     * 
     */
    CSUB;

    public String value() {
        return name();
    }

    public static CancelledStatusReason15Code fromValue(String v) {
        return valueOf(v);
    }

}
