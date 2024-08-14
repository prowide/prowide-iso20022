
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackerPaymentStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TrackerPaymentStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCC"/>
 *     <enumeration value="ACSP"/>
 *     <enumeration value="RJCT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TrackerPaymentStatus1Code")
@XmlEnum
public enum TrackerPaymentStatus1Code {


    /**
     * Settlement on the creditor's account has been completed. 
     * 
     */
    ACCC,

    /**
     * All preceding checks such as technical validation and customer profile were successful and therefore the payment initiation has been accepted for execution.
     * 
     */
    ACSP,

    /**
     * Payment initiation or individual transaction included in the payment initiation has been rejected.
     * 
     */
    RJCT;

    public String value() {
        return name();
    }

    public static TrackerPaymentStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
