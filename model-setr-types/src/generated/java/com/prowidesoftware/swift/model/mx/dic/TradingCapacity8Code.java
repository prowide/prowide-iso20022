
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingCapacity8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradingCapacity8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AGEN"/&gt;
 *     &lt;enumeration value="PRIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradingCapacity8Code")
@XmlEnum
public enum TradingCapacity8Code {


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

    public static TradingCapacity8Code fromValue(String v) {
        return valueOf(v);
    }

}
