
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateType7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SCHD"/&gt;
 *     &lt;enumeration value="USCD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateType7Code")
@XmlEnum
public enum RateType7Code {


    /**
     * Rate of the scheduled payment.
     * 
     */
    SCHD,

    /**
     * Rate of the unscheduled payment.
     * 
     */
    USCD;

    public String value() {
        return name();
    }

    public static RateType7Code fromValue(String v) {
        return valueOf(v);
    }

}
