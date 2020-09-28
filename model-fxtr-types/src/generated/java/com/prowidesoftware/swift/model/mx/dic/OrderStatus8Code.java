
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="NEWW"/&gt;
 *     &lt;enumeration value="REPL"/&gt;
 *     &lt;enumeration value="STOP"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="EXPI"/&gt;
 *     &lt;enumeration value="STNP"/&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="CANP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus8Code")
@XmlEnum
public enum OrderStatus8Code {


    /**
     * Cancelled order with or without executions.
     * 
     */
    CANC,

    /**
     * Outstanding order with no executions.
     * 
     */
    NEWW,

    /**
     * Order has been replaced.
     * 
     */
    REPL,

    /**
     * Order has been stopped at the exchange. Used when guaranteeing or protecting a price and quantity.
     * 
     */
    STOP,

    /**
     * Order has been rejected by sell-side.  NOTE:  An order can be rejected subsequent to order acknowledgment, i.e. an order can pass from New to Rejected status.
     * 
     */
    REJT,

    /**
     * Order has been cancelled in the broker's system due to time in force instructions.
     * 
     */
    EXPI,

    /**
     * Order has been sent to the next party, eg, the next intermediary.
     * 
     */
    STNP,

    /**
     * Order has been received, ie, technical validation of the message is ok, and the message is now at the receiving side.
     * 
     */
    RECE,

    /**
     * Order with an Order Cancel Request pending, used to confirm receipt of an Order Cancel Request.  Does not indicate that the order has been cancelled.
     * 
     */
    CANP;

    public String value() {
        return name();
    }

    public static OrderStatus8Code fromValue(String v) {
        return valueOf(v);
    }

}
