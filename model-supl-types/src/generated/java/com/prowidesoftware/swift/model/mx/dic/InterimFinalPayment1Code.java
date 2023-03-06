
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterimFinalPayment1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterimFinalPayment1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="FINL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterimFinalPayment1Code")
@XmlEnum
public enum InterimFinalPayment1Code {


    /**
     * Interim payment. Pending possible future payments.
     * 
     */
    INTE,

    /**
     * Final payment positions will be debited.
     * 
     */
    FINL;

    public String value() {
        return name();
    }

    public static InterimFinalPayment1Code fromValue(String v) {
        return valueOf(v);
    }

}
