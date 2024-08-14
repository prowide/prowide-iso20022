
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DistributionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ROLL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DistributionType1Code")
@XmlEnum
public enum DistributionType1Code {


    /**
     * Event will have a number of acceptance and payment dates until further announcement by the Issuer or its agent.
     * 
     */
    ROLL;

    public String value() {
        return name();
    }

    public static DistributionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
