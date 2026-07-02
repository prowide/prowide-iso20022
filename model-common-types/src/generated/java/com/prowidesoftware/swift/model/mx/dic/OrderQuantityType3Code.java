
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderQuantityType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderQuantityType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNIT"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="UMPU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderQuantityType3Code")
@XmlEnum
public enum OrderQuantityType3Code {


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
     * For futures - units of Measure per Time Unit (if used - must specify UnitofMeasure and TimeUnit.
     * 
     */
    UMPU;

    public String value() {
        return name();
    }

    public static OrderQuantityType3Code fromValue(String v) {
        return valueOf(v);
    }

}
