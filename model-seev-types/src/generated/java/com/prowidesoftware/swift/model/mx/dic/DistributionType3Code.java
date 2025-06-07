
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistributionType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FINL"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="ONGO"/&gt;
 *     &lt;enumeration value="ROLL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
