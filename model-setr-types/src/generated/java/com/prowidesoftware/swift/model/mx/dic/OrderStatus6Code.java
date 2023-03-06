
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DONE"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="EXEC"/&gt;
 *     &lt;enumeration value="CACE"/&gt;
 *     &lt;enumeration value="ALER"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="ACBI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus6Code")
@XmlEnum
public enum OrderStatus6Code {


    /**
     * Order has been partially filled, and is done for the day, ie, no further executions will take place today.
     * 
     */
    DONE,

    /**
     * Order has been rejected by sell-side. NOTE: An order can be rejected subsequent to order acknowledgment, i.e. an order can pass from New to Rejected status.
     * 
     */
    REJT,

    /**
     * Indicates that a list has been received and the sell side is working it.
     * 
     */
    EXEC,

    /**
     * Indicates that a cancellation request has been received and the sell side is in the process of pulling any orders that were being worked. The status of individual order can be found out from the detail repeating group.
     * 
     */
    CACE,

    /**
     * Used whenever any of the individual orders have a status that requires something to be done. For instance, an alert would be used when a buy-side firm has submitted a list that has individual stock reject that have not been addressed.
     * 
     */
    ALER,

    /**
     * Order is accepted and is ready for execution (execution is the moment when pricing is applied).
     * 
     */
    PACK,

    /**
     * Order has been received and is being evaluated for pricing.
     * 
     */
    ACBI;

    public String value() {
        return name();
    }

    public static OrderStatus6Code fromValue(String v) {
        return valueOf(v);
    }

}
