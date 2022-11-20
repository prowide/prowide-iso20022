
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountUnit1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmountUnit1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MONE"/&gt;
 *     &lt;enumeration value="POIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AmountUnit1Code")
@XmlEnum
public enum AmountUnit1Code {


    /**
     * The amount is expressed in a monetary value in a currency.
     * 
     */
    MONE,

    /**
     * The amount is expressed in point.
     * 
     */
    POIN;

    public String value() {
        return name();
    }

    public static AmountUnit1Code fromValue(String v) {
        return valueOf(v);
    }

}
