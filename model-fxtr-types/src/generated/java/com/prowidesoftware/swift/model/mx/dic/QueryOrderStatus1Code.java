
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOrderStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="QueryOrderStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="QUCO"/>
 *     <enumeration value="QOFP"/>
 *     <enumeration value="QFEO"/>
 *     <enumeration value="QPEO"/>
 *     <enumeration value="QUAO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "QueryOrderStatus1Code")
@XmlEnum
public enum QueryOrderStatus1Code {


    /**
     * Query for orders which are not confirmed by a party.
     * 
     */
    QUCO,

    /**
     * Query for all orders for a party.
     * 
     */
    QOFP,

    /**
     * Query for orders have been completely executed.
     * 
     */
    QFEO,

    /**
     * Query for orders have been partially executed.
     * 
     */
    QPEO,

    /**
     * Query for all orders.
     * 
     * 
     */
    QUAO;

    public String value() {
        return name();
    }

    public static QueryOrderStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
