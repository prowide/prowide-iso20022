
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrawdownType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DrawdownType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAPP"/&gt;
 *     &lt;enumeration value="FLEX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DrawdownType1Code")
@XmlEnum
public enum DrawdownType1Code {


    /**
     * Drawdown type is capped.
     * 
     */
    CAPP,

    /**
     * Drawdown type is flexi-access.
     * 
     */
    FLEX;

    public String value() {
        return name();
    }

    public static DrawdownType1Code fromValue(String v) {
        return valueOf(v);
    }

}
