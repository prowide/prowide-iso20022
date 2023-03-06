
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="INSU"/&gt;
 *     &lt;enumeration value="STCF"/&gt;
 *     &lt;enumeration value="BOND"/&gt;
 *     &lt;enumeration value="GBBK"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
