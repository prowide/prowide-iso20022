
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRate1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestRate1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GSRT"/&gt;
 *     &lt;enumeration value="NTRT"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterestRate1Code")
@XmlEnum
public enum InterestRate1Code {


    /**
     * Gross interest rate of the instalment
     * 
     */
    GSRT,

    /**
     * Net interest rate of the instalment
     * 
     */
    NTRT,

    /**
     * Other interest rate of the instalment
     * 
     */
    OTHN,

    /**
     * Other interest rate of the instalment
     * 
     */
    OTHP;

    public String value() {
        return name();
    }

    public static InterestRate1Code fromValue(String v) {
        return valueOf(v);
    }

}
