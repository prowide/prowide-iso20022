
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OrderStatus10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTI"/>
 *     <enumeration value="INAC"/>
 *     <enumeration value="SUSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
