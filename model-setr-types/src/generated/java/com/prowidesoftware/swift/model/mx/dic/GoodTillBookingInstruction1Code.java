
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodTillBookingInstruction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GoodTillBookingInstruction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOEX"/>
 *     <enumeration value="ACTE"/>
 *     <enumeration value="ACTT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GoodTillBookingInstruction1Code")
@XmlEnum
public enum GoodTillBookingInstruction1Code {


    /**
     * Book out all trades on day of execution.
     * 
     */
    BOEX,

    /**
     * Accumulate executions until order is filled or expires.
     * 
     */
    ACTE,

    /**
     * Accumulate until verbally notified otherwise.
     * 
     */
    ACTT;

    public String value() {
        return name();
    }

    public static GoodTillBookingInstruction1Code fromValue(String v) {
        return valueOf(v);
    }

}
