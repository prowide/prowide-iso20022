
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PNDG"/&gt;
 *     &lt;enumeration value="NOAP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceStatus1Code")
@XmlEnum
public enum PriceStatus1Code {


    /**
     * Price is pending.
     * 
     */
    PNDG,

    /**
     * No price for transaction (e.g. transfer between accounts).
     * 
     */
    NOAP;

    public String value() {
        return name();
    }

    public static PriceStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
