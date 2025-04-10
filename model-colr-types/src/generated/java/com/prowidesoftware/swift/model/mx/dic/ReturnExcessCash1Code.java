
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnExcessCash1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReturnExcessCash1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RTND"/>
 *     <enumeration value="RTDN"/>
 *     <enumeration value="SSPD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReturnExcessCash1Code")
@XmlEnum
public enum ReturnExcessCash1Code {


    /**
     * Excess cash in the currency is returned.
     * 
     */
    RTND,

    /**
     * Automatic return of excess cash has not been requested for the currency. 
     * 
     */
    RTDN,

    /**
     * Automatic return of cash is temporarily suspended (for example due to a currency holiday).
     * 
     */
    SSPD;

    public String value() {
        return name();
    }

    public static ReturnExcessCash1Code fromValue(String v) {
        return valueOf(v);
    }

}
