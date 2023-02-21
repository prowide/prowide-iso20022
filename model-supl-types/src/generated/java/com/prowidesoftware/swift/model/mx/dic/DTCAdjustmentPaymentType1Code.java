
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCAdjustmentPaymentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCAdjustmentPaymentType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STOK"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="MISC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
