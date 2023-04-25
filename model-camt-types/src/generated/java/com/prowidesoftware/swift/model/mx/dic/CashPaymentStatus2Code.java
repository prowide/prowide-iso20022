
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashPaymentStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CashPaymentStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PDNG"/>
 *     <enumeration value="FINL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CashPaymentStatus2Code")
@XmlEnum
public enum CashPaymentStatus2Code {


    /**
     * The payment is awaiting settlement.
     * 
     */
    PDNG,

    /**
     * The payment has been settled or stopped.
     * 
     */
    FINL;

    public String value() {
        return name();
    }

    public static CashPaymentStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
