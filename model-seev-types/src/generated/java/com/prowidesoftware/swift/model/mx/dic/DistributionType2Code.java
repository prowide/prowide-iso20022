
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistributionType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ROLL"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="FINL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
