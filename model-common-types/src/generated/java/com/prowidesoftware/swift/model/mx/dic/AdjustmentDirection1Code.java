
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentDirection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdjustmentDirection1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADDD"/>
 *     <enumeration value="SUBS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdjustmentDirection1Code")
@XmlEnum
public enum AdjustmentDirection1Code {


    /**
     * Adjustment amount must be added to the total amount.
     * 
     */
    ADDD,

    /**
     * Adjustment amount must be substracted from the total amount.
     * 
     */
    SUBS;

    public String value() {
        return name();
    }

    public static AdjustmentDirection1Code fromValue(String v) {
        return valueOf(v);
    }

}
