
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoodAndServiceDeliverySchedule1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GoodAndServiceDeliverySchedule1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="ONDL"/&gt;
 *     &lt;enumeration value="SDDL"/&gt;
 *     &lt;enumeration value="TDDL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
