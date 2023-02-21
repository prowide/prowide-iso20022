
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTU"/&gt;
 *     &lt;enumeration value="INDI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateStatus1Code")
@XmlEnum
public enum RateStatus1Code {


    /**
     * Rate is actual.
     * 
     */
    ACTU,

    /**
     * Rate is indicative.
     * 
     */
    INDI;

    public String value() {
        return name();
    }

    public static RateStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
