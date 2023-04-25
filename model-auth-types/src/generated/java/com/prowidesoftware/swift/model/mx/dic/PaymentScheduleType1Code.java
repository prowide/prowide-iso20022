
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentScheduleType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentScheduleType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNTR"/>
 *     <enumeration value="ESTM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentScheduleType1Code")
@XmlEnum
public enum PaymentScheduleType1Code {


    /**
     * Payment schedule is defined as per contract.
     * 
     */
    CNTR,

    /**
     * Payment schedule is estimated.
     * 
     */
    ESTM;

    public String value() {
        return name();
    }

    public static PaymentScheduleType1Code fromValue(String v) {
        return valueOf(v);
    }

}
