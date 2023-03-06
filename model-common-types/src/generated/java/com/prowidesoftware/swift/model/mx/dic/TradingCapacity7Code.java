
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingCapacity7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradingCapacity7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AGEN"/&gt;
 *     &lt;enumeration value="PRIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradingCapacity7Code")
@XmlEnum
public enum TradingCapacity7Code {


    /**
     * Trading as Agent on behalf of a customer.
     * 
     */
    AGEN,

    /**
     * Trading as Principal.
     * 
     */
    PRIN;

    public String value() {
        return name();
    }

    public static TradingCapacity7Code fromValue(String v) {
        return valueOf(v);
    }

}
