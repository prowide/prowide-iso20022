
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnnualChargePaymentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AnnualChargePaymentType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAPL"/>
 *     <enumeration value="INCO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AnnualChargePaymentType1Code")
@XmlEnum
public enum AnnualChargePaymentType1Code {


    /**
     * Annual charge is deducted from the fund capital.
     * 
     */
    CAPL,

    /**
     * Annual charge is deducted from the fund income.
     * 
     */
    INCO;

    public String value() {
        return name();
    }

    public static AnnualChargePaymentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
