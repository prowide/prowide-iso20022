
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderQuantityType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderQuantityType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNIT"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderQuantityType1Code")
@XmlEnum
public enum OrderQuantityType1Code {


    /**
     * Order is placed by unit.
     * 
     */
    UNIT,

    /**
     * Order is placed by amount of money.
     * 
     */
    CASH,

    /**
     * Transaction is another type of transaction.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static OrderQuantityType1Code fromValue(String v) {
        return valueOf(v);
    }

}
