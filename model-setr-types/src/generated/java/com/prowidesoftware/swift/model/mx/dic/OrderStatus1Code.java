
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEWW"/&gt;
 *     &lt;enumeration value="PARF"/&gt;
 *     &lt;enumeration value="FILL"/&gt;
 *     &lt;enumeration value="DONE"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="REPL"/&gt;
 *     &lt;enumeration value="CANP"/&gt;
 *     &lt;enumeration value="STOP"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="SUSP"/&gt;
 *     &lt;enumeration value="PENN"/&gt;
 *     &lt;enumeration value="CALC"/&gt;
 *     &lt;enumeration value="EXPI"/&gt;
 *     &lt;enumeration value="ACBI"/&gt;
 *     &lt;enumeration value="PENR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus1Code")
@XmlEnum
public enum OrderStatus1Code {


    /**
     * Outstanding order with no executions.
     * 
     */
    NEWW,

    /**
     * Outstanding order with executions and remaining quantity.
     * 
     */
    PARF,

    /**
     * Order completely filled, no remaining quantity.
     * 
     */
    FILL,

    /**
     * Order has been partially filled, and is done for the day, ie, no further executions will take place today.
     * 
     */
    DONE,

    /**
     * Cancelled order with or without executions.
     * 
     */
    CANC,

    /**
     * Order has been replaced.
     * 
     */
    REPL,

    /**
     * Order with an Order Cancel Request pending, used to confirm receipt of an Order Cancel Request.  Does not indicate that the order has been cancelled.
     * 
     */
    CANP,

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
     * Order has been placed in suspended state at the request of the client.
     * 
     */
    SUSP,

    /**
     * Order has been received by sell-side system but not yet accepted for execution.  An execution message with this status will only be sent in response to a Status Request message.
     * 
     */
    PENN,

    /**
     * Order has been completed for the day (either filled or done for day).  Commission or currency settlement details have been calculated and reported in this execution message.
     * 
     */
    CALC,

    /**
     * Order has been cancelled in the broker's system due to time in force instructions.
     * 
     */
    EXPI,

    /**
     * Order has been received and is being evaluated for pricing.
     * 
     */
    ACBI,

    /**
     * Order with an Order Cancel/Replace Request pending, used to confirm receipt of an Order Cancel/Replace Request. Does not indicate that the order has been replaced.
     * 
     */
    PENR;

    public String value() {
        return name();
    }

    public static OrderStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
