
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLevel2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ServiceLevel2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SEPA"/>
 *     <enumeration value="SDVA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ServiceLevel2Code")
@XmlEnum
public enum ServiceLevel2Code {


    /**
     * Payment must be executed following the Single Euro Payments Area scheme.
     * 
     */
    SEPA,

    /**
     * Payment must be executed with same day value to the creditor.
     * 
     */
    SDVA;

    public String value() {
        return name();
    }

    public static ServiceLevel2Code fromValue(String v) {
        return valueOf(v);
    }

}
