
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderQuantityType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OrderQuantityType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNIT"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
