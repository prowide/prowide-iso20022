
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reporting2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Reporting2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STEX"/&gt;
 *     &lt;enumeration value="REGU"/&gt;
 *     &lt;enumeration value="DEFR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
