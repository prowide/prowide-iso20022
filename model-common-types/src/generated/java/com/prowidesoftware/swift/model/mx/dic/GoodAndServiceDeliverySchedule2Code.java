
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodAndServiceDeliverySchedule2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GoodAndServiceDeliverySchedule2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ONDL"/>
 *     <enumeration value="SDDL"/>
 *     <enumeration value="TDDL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GoodAndServiceDeliverySchedule2Code")
@XmlEnum
public enum GoodAndServiceDeliverySchedule2Code {


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

    public static GoodAndServiceDeliverySchedule2Code fromValue(String v) {
        return valueOf(v);
    }

}
