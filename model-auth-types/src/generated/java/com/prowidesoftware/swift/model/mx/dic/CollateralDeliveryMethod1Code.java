
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralDeliveryMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralDeliveryMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SICA"/&gt;
 *     &lt;enumeration value="SIUR"/&gt;
 *     &lt;enumeration value="TTCA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
