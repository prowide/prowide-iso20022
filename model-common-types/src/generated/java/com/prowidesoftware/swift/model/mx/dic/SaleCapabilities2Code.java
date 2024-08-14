
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleCapabilities2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SaleCapabilities2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHIN"/&gt;
 *     &lt;enumeration value="CUIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
