
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLevel3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ServiceLevel3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SEPA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ServiceLevel3Code")
@XmlEnum
public enum ServiceLevel3Code {


    /**
     * Payment must be executed following the Single Euro Payments Area scheme.
     * 
     */
    SEPA;

    public String value() {
        return name();
    }

    public static ServiceLevel3Code fromValue(String v) {
        return valueOf(v);
    }

}
