
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LMTO"/&gt;
 *     &lt;enumeration value="STOP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderType3Code")
@XmlEnum
public enum OrderType3Code {


    /**
     * An order to buy at the indicated price limit or lower or an order to sell at the indicated limit price or higher.
     * 
     */
    LMTO,

    /**
     * An order to buy which becomes a market order when the financial instrument trades at or above the stop price after the order is submitted or an order to sell which becomes a market order when the financial instrument trades at or below the stop price after the order is submitted.
     * 
     */
    STOP;

    public String value() {
        return name();
    }

    public static OrderType3Code fromValue(String v) {
        return valueOf(v);
    }

}
