
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Referred1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Referred1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REFR"/&gt;
 *     &lt;enumeration value="NRFR"/&gt;
 *     &lt;enumeration value="UKNW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Referred1Code")
@XmlEnum
public enum Referred1Code {


    /**
     * The investor was referred to the fund by a placement agent.
     * 
     */
    REFR,

    /**
     * The investor was not referred to the fund by a placement agent.
     * 
     */
    NRFR,

    /**
     * It is not known whether the investor was referred to the fund by a placement agent.
     * 
     */
    UKNW;

    public String value() {
        return name();
    }

    public static Referred1Code fromValue(String v) {
        return valueOf(v);
    }

}
