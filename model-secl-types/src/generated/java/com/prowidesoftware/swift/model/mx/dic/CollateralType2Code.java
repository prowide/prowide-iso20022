
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="SECU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralType2Code")
@XmlEnum
public enum CollateralType2Code {


    /**
     * Collateral type is cash.
     * 
     */
    CASH,

    /**
     * Collateral type is securities.
     * 
     */
    SECU;

    public String value() {
        return name();
    }

    public static CollateralType2Code fromValue(String v) {
        return valueOf(v);
    }

}
