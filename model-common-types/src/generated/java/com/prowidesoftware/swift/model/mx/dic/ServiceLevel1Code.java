
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLevel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ServiceLevel1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SEPA"/>
 *     <enumeration value="SDVA"/>
 *     <enumeration value="PRPT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ServiceLevel1Code")
@XmlEnum
public enum ServiceLevel1Code {


    /**
     * Payment must be executed following the Single Euro Payments Area scheme.
     * 
     */
    SEPA,

    /**
     * Payment must be executed with same day value to the creditor.
     * 
     */
    SDVA,

    /**
     * Transaction must be processed according to the EBA
     * Priority Service.
     * 
     */
    PRPT;

    public String value() {
        return name();
    }

    public static ServiceLevel1Code fromValue(String v) {
        return valueOf(v);
    }

}
