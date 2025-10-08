
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceValueType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceValueType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *     &lt;enumeration value="TBSP"/&gt;
 *     &lt;enumeration value="UNSP"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceValueType4Code")
@XmlEnum
public enum PriceValueType4Code {


    /**
     * Price has not been established.
     * 
     */
    OPEN,

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
    UKWN;

    public String value() {
        return name();
    }

    public static PriceValueType4Code fromValue(String v) {
        return valueOf(v);
    }

}
