
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralType8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralType8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMO"/>
 *     <enumeration value="CCCL"/>
 *     <enumeration value="CEMC"/>
 *     <enumeration value="CXCC"/>
 *     <enumeration value="CFTD"/>
 *     <enumeration value="CFTI"/>
 *     <enumeration value="CTRC"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="LCRE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="CTCO"/>
 *     <enumeration value="CCVR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralType8Code")
@XmlEnum
public enum CollateralType8Code {


    /**
     * Total collateral affected to open market operations.
     * 
     */
    COMO,

    /**
     * Total credit claims.
     * 
     */
    CCCL,

    /**
     * Total externally managed collateral apart from credit claims.
     * 
     * 
     */
    CEMC,

    /**
     * Total externally managed collateral for credit claims.
     * 
     */
    CXCC,

    /**
     * Total fixed term deposit used as collateral.
     * 
     */
    CFTD,

    /**
     * Total interest for fixed term Deposit used as collateral.
     * 
     */
    CFTI,

    /**
     * Total triparty collateral.
     * 
     */
    CTRC,

    /**
     * Collateral type is cash.
     * 
     */
    CASH,

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
     * Collateral type is securities.
     * 
     */
    SECU,

    /**
     * Total collateral operations.
     * 
     * 
     * 
     */
    CTCO,

    /**
     * Total collateral value after relative credit limit.
     * 
     */
    CCVR;

    public String value() {
        return name();
    }

    public static CollateralType8Code fromValue(String v) {
        return valueOf(v);
    }

}
