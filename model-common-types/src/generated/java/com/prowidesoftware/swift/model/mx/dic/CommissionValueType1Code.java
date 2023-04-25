
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionValueType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CommissionValueType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PEUN"/>
 *     <enumeration value="ABSO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CommissionValueType1Code")
@XmlEnum
public enum CommissionValueType1Code {


    /**
     * Price expressed per unit.
     * 
     */
    PEUN,

    /**
     * Price is expressed as absolute.
     * 
     */
    ABSO;

    public String value() {
        return name();
    }

    public static CommissionValueType1Code fromValue(String v) {
        return valueOf(v);
    }

}
