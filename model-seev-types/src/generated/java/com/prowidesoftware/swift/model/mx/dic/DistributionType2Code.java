
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DistributionType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ROLL"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="FINL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DistributionType2Code")
@XmlEnum
public enum DistributionType2Code {


    /**
     * Event will have a number of acceptance and payment dates until further announcement by the Issuer or its agent.
     * 
     */
    ROLL,

    /**
     * Interim payment.
     * 
     */
    INTE,

    /**
     * Final payment.
     * 
     */
    FINL;

    public String value() {
        return name();
    }

    public static DistributionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
