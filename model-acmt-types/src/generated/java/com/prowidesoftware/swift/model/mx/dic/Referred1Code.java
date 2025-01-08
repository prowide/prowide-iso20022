
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Referred1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Referred1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REFR"/>
 *     <enumeration value="NRFR"/>
 *     <enumeration value="UKNW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
