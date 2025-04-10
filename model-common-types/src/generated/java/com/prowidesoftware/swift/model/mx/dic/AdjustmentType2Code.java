
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdjustmentType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REBA"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="CREN"/&gt;
 *     &lt;enumeration value="SURC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
