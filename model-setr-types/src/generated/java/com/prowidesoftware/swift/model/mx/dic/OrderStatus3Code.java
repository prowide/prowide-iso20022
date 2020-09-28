
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STNP"/&gt;
 *     &lt;enumeration value="CANP"/&gt;
 *     &lt;enumeration value="CAND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus3Code")
@XmlEnum
public enum OrderStatus3Code {


    /**
     * Order has been sent to the next party, eg, the next intermediary.
     * 
     */
    STNP,

    /**
     * Order with an Order Cancel Request pending, used to confirm receipt of an Order Cancel Request.  Does not indicate that the order has been cancelled.
     * 
     */
    CANP,

    /**
     * Request for cancellation instruction for the order has been accepted and processed; the order has been cancelled.
     * 
     */
    CAND;

    public String value() {
        return name();
    }

    public static OrderStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
