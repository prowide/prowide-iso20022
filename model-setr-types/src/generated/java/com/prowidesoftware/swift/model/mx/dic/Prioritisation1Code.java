
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Prioritisation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Prioritisation1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="BSPR"/&gt;
 *     &lt;enumeration value="SSPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Prioritisation1Code")
@XmlEnum
public enum Prioritisation1Code {


    /**
     * None of the sides should be prioritised.
     * 
     */
    NONE,

    /**
     * Buy side is prioritized.
     * 
     */
    BSPR,

    /**
     * Sell side is prioritised.
     * 
     */
    SSPR;

    public String value() {
        return name();
    }

    public static Prioritisation1Code fromValue(String v) {
        return valueOf(v);
    }

}
