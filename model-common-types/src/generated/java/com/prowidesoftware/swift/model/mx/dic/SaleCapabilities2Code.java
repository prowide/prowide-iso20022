
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleCapabilities2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SaleCapabilities2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CHIN"/>
 *     <enumeration value="CUIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SaleCapabilities2Code")
@XmlEnum
public enum SaleCapabilities2Code {


    /**
     * Any kind of keyboard allowing all or part of the commands 	of the Input message request from the Sale System to the POI System (InputCommand data element). The output device attached to this input device is the CashierDisplay device.
     * 
     */
    CHIN,

    /**
     * Any kind of keyboard allowing all or part of the commands 	of the Input message request from the Sale System to the POI System (InputCommand data element).
     * 
     */
    CUIN;

    public String value() {
        return name();
    }

    public static SaleCapabilities2Code fromValue(String v) {
        return valueOf(v);
    }

}
