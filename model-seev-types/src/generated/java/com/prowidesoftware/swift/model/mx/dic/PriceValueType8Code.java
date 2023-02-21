
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceValueType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceValueType8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TBSP"/&gt;
 *     &lt;enumeration value="UNSP"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="NILP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceValueType8Code")
@XmlEnum
public enum PriceValueType8Code {


    /**
     * Price to be specified by account owner.
     * 
     */
    TBSP,

    /**
     * Price is not required to be specified by account owner.
     * 
     */
    UNSP,

    /**
     * Price is unknown by the sender or has not been established.
     * 
     */
    UKWN,

    /**
     * Price will not be paid.
     * 
     */
    NILP;

    public String value() {
        return name();
    }

    public static PriceValueType8Code fromValue(String v) {
        return valueOf(v);
    }

}
