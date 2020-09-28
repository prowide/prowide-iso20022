
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOrderStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryOrderStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QUCO"/&gt;
 *     &lt;enumeration value="QOFP"/&gt;
 *     &lt;enumeration value="QFEO"/&gt;
 *     &lt;enumeration value="QPEO"/&gt;
 *     &lt;enumeration value="QUAO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
