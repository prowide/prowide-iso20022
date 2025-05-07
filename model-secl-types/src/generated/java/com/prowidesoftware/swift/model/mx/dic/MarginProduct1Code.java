
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginProduct1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarginProduct1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EQUI"/&gt;
 *     &lt;enumeration value="FIXI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarginProduct1Code")
@XmlEnum
public enum MarginProduct1Code {


    /**
     * Specifies that the margin is related to equities.
     * 
     */
    EQUI,

    /**
     * Specifies that the margin is related to fixed income.
     * 
     */
    FIXI;

    public String value() {
        return name();
    }

    public static MarginProduct1Code fromValue(String v) {
        return valueOf(v);
    }

}
