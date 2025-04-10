
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RateStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTU"/>
 *     <enumeration value="INDI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
