
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldingsPlanType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HoldingsPlanType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVP"/&gt;
 *     &lt;enumeration value="SWIP"/&gt;
 *     &lt;enumeration value="PLAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HoldingsPlanType1Code")
@XmlEnum
public enum HoldingsPlanType1Code {


    /**
     * Identifies whether or not.holding to be transferred belong to an investment plan.
     * 
     */
    INVP,

    /**
     * Identifies whether or not holdings to be transferred belong to switch plan.
     * 
     */
    SWIP,

    /**
     * Identifies whether or not holdings to be transferred belong to a withdrawal plan.
     * 
     */
    PLAR;

    public String value() {
        return name();
    }

    public static HoldingsPlanType1Code fromValue(String v) {
        return valueOf(v);
    }

}
