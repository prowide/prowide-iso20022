
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistributionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ROLL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
