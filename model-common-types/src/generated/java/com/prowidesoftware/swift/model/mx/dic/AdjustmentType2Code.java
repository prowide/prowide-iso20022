
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdjustmentType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REBA"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="CREN"/>
 *     <enumeration value="SURC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdjustmentType2Code")
@XmlEnum
public enum AdjustmentType2Code {


    /**
     * Adjustment is a rebate.
     * 
     */
    REBA,

    /**
     * Adjustment is a discount.
     * 
     */
    DISC,

    /**
     * Adjustment is a credit note.
     * 
     */
    CREN,

    /**
     * Adjustment is a surcharge.
     * 
     */
    SURC;

    public String value() {
        return name();
    }

    public static AdjustmentType2Code fromValue(String v) {
        return valueOf(v);
    }

}
