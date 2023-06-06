
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasure10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnitOfMeasure10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KMET"/>
 *     <enumeration value="MILE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnitOfMeasure10Code")
@XmlEnum
public enum UnitOfMeasure10Code {


    /**
     * Unit of measure that is equal to 1, 000 meters.
     * 
     */
    KMET,

    /**
     * Unit of length equal to 1, 760 yards.
     * 
     */
    MILE;

    public String value() {
        return name();
    }

    public static UnitOfMeasure10Code fromValue(String v) {
        return valueOf(v);
    }

}
