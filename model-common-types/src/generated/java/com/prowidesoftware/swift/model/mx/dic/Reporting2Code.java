
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reporting2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Reporting2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STEX"/>
 *     <enumeration value="REGU"/>
 *     <enumeration value="DEFR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Reporting2Code")
@XmlEnum
public enum Reporting2Code {


    /**
     * Trade details are to be reported to a stock exchange.
     * 
     */
    STEX,

    /**
     * Trade details are to be reported to a regulatory organisation.
     * 
     */
    REGU,

    /**
     * Report is deferred, for example, because the order was executed in partial fills.
     * 
     */
    DEFR;

    public String value() {
        return name();
    }

    public static Reporting2Code fromValue(String v) {
        return valueOf(v);
    }

}
