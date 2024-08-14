
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GBBK"/>
 *     <enumeration value="BOND"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="LCRE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="STCF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralType6Code")
@XmlEnum
public enum CollateralType6Code {


    /**
     * Collateral type is a bank guarantee.
     * 
     */
    GBBK,

    /**
     * Collateral type is bonds.
     * 
     */
    BOND,

    /**
     * Collateral type is cash.
     * 
     */
    CASH,

    /**
     * Collateral type is commodities.
     * 
     */
    COMM,

    /**
     * Collateral type is an insurance contract.
     * 
     */
    INSU,

    /**
     * Instrument issued by a bank substituting its name and credit standing for that of its customer. A letter of credit is a written undertaking of the bank, issued for the account of a customer (the applicant), to honour a demand for payment, upon the beneficiary's compliance with the terms and conditions set forth in the undertaking.
     * 
     */
    LCRE,

    /**
     * Other assets that could be used as collateral.
     * 
     */
    OTHR,

    /**
     * Collateral type are physical entities, for example, airplanes for debt issued by the airline industry.
     * 
     */
    PHYS,

    /**
     * Collateral type is securities.
     * 
     */
    SECU,

    /**
     * Collateral type is stock certificates.
     * 
     */
    STCF;

    public String value() {
        return name();
    }

    public static CollateralType6Code fromValue(String v) {
        return valueOf(v);
    }

}
