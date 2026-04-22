
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemporaryServicesCharge2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TemporaryServicesCharge2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WKND"/>
 *     <enumeration value="REGL"/>
 *     <enumeration value="OVRT"/>
 *     <enumeration value="ONCL"/>
 *     <enumeration value="NITE"/>
 *     <enumeration value="HOLI"/>
 *     <enumeration value="HAZD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TemporaryServicesCharge2Code")
@XmlEnum
public enum TemporaryServicesCharge2Code {


    /**
     * Weekend
     * 
     */
    WKND,

    /**
     * Regular
     * 
     */
    REGL,

    /**
     * Overtime
     * 
     */
    OVRT,

    /**
     * On call
     * 
     */
    ONCL,

    /**
     * Night
     * 
     */
    NITE,

    /**
     * Holiday
     * 
     */
    HOLI,

    /**
     * Hazard
     * 
     */
    HAZD;

    public String value() {
        return name();
    }

    public static TemporaryServicesCharge2Code fromValue(String v) {
        return valueOf(v);
    }

}
