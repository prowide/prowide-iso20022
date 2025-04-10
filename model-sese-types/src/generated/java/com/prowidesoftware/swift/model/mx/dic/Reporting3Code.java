
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reporting3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Reporting3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BYIY"/>
 *     <enumeration value="DEFR"/>
 *     <enumeration value="REGU"/>
 *     <enumeration value="STEX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Reporting3Code")
@XmlEnum
public enum Reporting3Code {


    /**
     * Relates to a buy-in by the market following a delivery transaction failure.
     * 
     */
    BYIY,

    /**
     * Report is deferred, for example, because the order was executed in partial fills.
     * 
     */
    DEFR,

    /**
     * Trade details are to be reported to a regulatory organisation.
     * 
     */
    REGU,

    /**
     * Trade details are to be reported to a stock exchange.
     * 
     */
    STEX;

    public String value() {
        return name();
    }

    public static Reporting3Code fromValue(String v) {
        return valueOf(v);
    }

}
