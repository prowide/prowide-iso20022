
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reporting3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Reporting3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BYIY"/&gt;
 *     &lt;enumeration value="DEFR"/&gt;
 *     &lt;enumeration value="REGU"/&gt;
 *     &lt;enumeration value="STEX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
