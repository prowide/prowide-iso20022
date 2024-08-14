
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCAdjustmentPaymentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCAdjustmentPaymentType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STOK"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="MISC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCAdjustmentPaymentType1Code")
@XmlEnum
public enum DTCAdjustmentPaymentType1Code {


    /**
     * Stock loan transaction.
     * 
     */
    STOK,

    /**
     * REPO (repurchase agreement) transaction.
     * 
     */
    REPO,

    /**
     * FAIL (undelivered securities) transaction.
     * 
     */
    FAIL,

    /**
     * Miscellaneous (adjustment) transaction.
     * 
     */
    MISC;

    public String value() {
        return name();
    }

    public static DTCAdjustmentPaymentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
