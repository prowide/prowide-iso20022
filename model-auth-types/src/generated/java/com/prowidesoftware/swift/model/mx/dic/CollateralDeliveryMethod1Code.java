
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralDeliveryMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralDeliveryMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SICA"/>
 *     <enumeration value="SIUR"/>
 *     <enumeration value="TTCA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralDeliveryMethod1Code")
@XmlEnum
public enum CollateralDeliveryMethod1Code {


    /**
     * Securities interest collateral arrangement.
     * 
     */
    SICA,

    /**
     * Securities interest with the right of use.
     * 
     */
    SIUR,

    /**
     * Title transfer collateral arrangement.
     * 
     */
    TTCA;

    public String value() {
        return name();
    }

    public static CollateralDeliveryMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
