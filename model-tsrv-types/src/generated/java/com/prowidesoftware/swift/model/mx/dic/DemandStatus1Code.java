
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DemandStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DemandStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXTD"/>
 *     <enumeration value="PAYD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DemandStatus1Code")
@XmlEnum
public enum DemandStatus1Code {


    /**
     * Extend undertaking expiry date.
     * 
     */
    EXTD,

    /**
     * Pay undertaking demand.
     * 
     */
    PAYD;

    public String value() {
        return name();
    }

    public static DemandStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
