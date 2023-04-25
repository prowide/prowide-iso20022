
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentScheduleType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentScheduleType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNTR"/>
 *     <enumeration value="ESTM"/>
 *     <enumeration value="BOTH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentScheduleType2Code")
@XmlEnum
public enum PaymentScheduleType2Code {


    /**
     * Payment schedule is defined as per contract.
     * 
     */
    CNTR,

    /**
     * Payment schedule is estimated.
     * 
     */
    ESTM,

    /**
     * Contract Payment schedule is both defined as per Contract and estimated.
     * 
     */
    BOTH;

    public String value() {
        return name();
    }

    public static PaymentScheduleType2Code fromValue(String v) {
        return valueOf(v);
    }

}
