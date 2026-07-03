
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerOrderRequest1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerOrderRequest1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOTH"/&gt;
 *     &lt;enumeration value="CLSD"/&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
