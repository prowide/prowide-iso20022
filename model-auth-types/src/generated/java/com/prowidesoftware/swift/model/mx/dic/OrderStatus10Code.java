
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTI"/&gt;
 *     &lt;enumeration value="INAC"/&gt;
 *     &lt;enumeration value="SUSP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus10Code")
@XmlEnum
public enum OrderStatus10Code {


    /**
     * Non-quote orders that are tradable.
     * 
     */
    ACTI,

    /**
     * Non-quote orders that are not tradable.
     * 
     */
    INAC,

    /**
     * Order has been placed in suspended state at the request of the client.
     * 
     */
    SUSP;

    public String value() {
        return name();
    }

    public static OrderStatus10Code fromValue(String v) {
        return valueOf(v);
    }

}
