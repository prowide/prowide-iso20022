
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DistributionType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FINL"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="ONGO"/>
 *     <enumeration value="ROLL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DistributionType3Code")
@XmlEnum
public enum DistributionType3Code {


    /**
     * Final payment.
     * 
     */
    FINL,

    /**
     * Interim payment.
     * 
     */
    INTE,

    /**
     * Event is ongoing for acceptance on an unsolicited basis.
     * 
     */
    ONGO,

    /**
     * Event will have a number of acceptance and payment dates until further announcement by the Issuer or its agent.
     * 
     */
    ROLL;

    public String value() {
        return name();
    }

    public static DistributionType3Code fromValue(String v) {
        return valueOf(v);
    }

}
