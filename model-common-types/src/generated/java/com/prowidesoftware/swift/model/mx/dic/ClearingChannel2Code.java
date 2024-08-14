
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingChannel2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ClearingChannel2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RTGS"/>
 *     <enumeration value="RTNS"/>
 *     <enumeration value="MPNS"/>
 *     <enumeration value="BOOK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClearingChannel2Code")
@XmlEnum
public enum ClearingChannel2Code {


    /**
     * Clearing channel is a real-time gross settlement system.
     * 
     */
    RTGS,

    /**
     * Clearing channel is a real-time net settlement system.
     * 
     */
    RTNS,

    /**
     * Clearing channel is a mass payment net settlement system.
     * 
     */
    MPNS,

    /**
     * Payment through internal book transfer.
     * 
     */
    BOOK;

    public String value() {
        return name();
    }

    public static ClearingChannel2Code fromValue(String v) {
        return valueOf(v);
    }

}
