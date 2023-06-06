
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXCS"/>
 *     <enumeration value="DEFI"/>
 *     <enumeration value="FLAT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralStatus1Code")
@XmlEnum
public enum CollateralStatus1Code {


    /**
     * Excess of collateral.
     * 
     */
    EXCS,

    /**
     * Shortage of collateral.
     * 
     */
    DEFI,

    /**
     * Collateral covers the exposure and there is no excess.
     * 
     */
    FLAT;

    public String value() {
        return name();
    }

    public static CollateralStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
