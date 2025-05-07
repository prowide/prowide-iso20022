
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
     * Holding to be transferred belongs to an investment plan.
     * 
     */
    INVP,

    /**
     * Holding to be transferred belongs to a switch plan.
     * 
     */
    SWIP,

    /**
     * Holding to be transferred belongs to a withdrawal plan.
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
