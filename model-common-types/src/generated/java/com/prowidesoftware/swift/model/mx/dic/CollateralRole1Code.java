
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralRole1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralRole1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GIVE"/>
 *     <enumeration value="TAKE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralRole1Code")
@XmlEnum
public enum CollateralRole1Code {


    /**
     * Collateral giver.
     * 
     */
    GIVE,

    /**
     * Collateral taker. 
     * 
     */
    TAKE;

    public String value() {
        return name();
    }

    public static CollateralRole1Code fromValue(String v) {
        return valueOf(v);
    }

}
