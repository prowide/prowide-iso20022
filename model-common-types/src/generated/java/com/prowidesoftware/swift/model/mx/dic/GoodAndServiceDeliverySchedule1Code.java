
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodAndServiceDeliverySchedule1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GoodAndServiceDeliverySchedule1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="ONDL"/>
 *     <enumeration value="SDDL"/>
 *     <enumeration value="TDDL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GoodAndServiceDeliverySchedule1Code")
@XmlEnum
public enum GoodAndServiceDeliverySchedule1Code {


    /**
     * Other delivery schedule defined at national level.
     * 
     * 
     */
    OTHN,

    /**
     * Other delivery schedule defined at private level.
     * 
     */
    OTHP,

    /**
     * Overnight delivery.
     * 
     */
    ONDL,

    /**
     * Same day delivery.
     * 
     * 
     */
    SDDL,

    /**
     * Two days or more delivery.
     * 
     */
    TDDL;

    public String value() {
        return name();
    }

    public static GoodAndServiceDeliverySchedule1Code fromValue(String v) {
        return valueOf(v);
    }

}
