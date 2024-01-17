
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="STCF"/>
 *     <enumeration value="BOND"/>
 *     <enumeration value="GBBK"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralType3Code")
@XmlEnum
public enum CollateralType3Code {


    /**
     * Collateral type is cash.
     * 
     */
    CASH,

    /**
     * Collateral type is securities.
     * 
     */
    SECU,

    /**
     * Collateral type are physical entities, for example, airplanes for debt issued by the airline industry.
     * 
     */
    PHYS,

    /**
     * Collateral type is an insurance contract.
     * 
     */
    INSU,

    /**
     * Collateral type is stock certificates.
     * 
     */
    STCF,

    /**
     * Collateral type is bonds.
     * 
     */
    BOND,

    /**
     * Collateral type is a bank guarantee.
     * 
     */
    GBBK,

    /**
     * Other assets that could be used as collateral.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static CollateralType3Code fromValue(String v) {
        return valueOf(v);
    }

}
