
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerOrderRequest1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CustomerOrderRequest1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOTH"/>
 *     <enumeration value="CLSD"/>
 *     <enumeration value="OPEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CustomerOrderRequest1Code")
@XmlEnum
public enum CustomerOrderRequest1Code {


    /**
     * All types of CustomerOrder should be listed, some are open others closed.
     * 
     */
    BOTH,

    /**
     * Completed customer orders.
     * 
     */
    CLSD,

    /**
     * Customer order not completed.
     * 
     */
    OPEN;

    public String value() {
        return name();
    }

    public static CustomerOrderRequest1Code fromValue(String v) {
        return valueOf(v);
    }

}
