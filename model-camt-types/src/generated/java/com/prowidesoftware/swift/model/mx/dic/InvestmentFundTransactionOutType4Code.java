
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundTransactionOutType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentFundTransactionOutType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REDM"/>
 *     <enumeration value="SWIO"/>
 *     <enumeration value="INSP"/>
 *     <enumeration value="CROO"/>
 *     <enumeration value="DIVI"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentFundTransactionOutType4Code")
@XmlEnum
public enum InvestmentFundTransactionOutType4Code {


    /**
     * Transaction is a redemption of an investment fund.
     * 
     */
    REDM,

    /**
     * Transaction is a subscription leg of a switch order execution.
     * 
     */
    SWIO,

    /**
     * Transaction is an InSpecie.
     * 
     */
    INSP,

    /**
     * Transaction is a cross out.
     * 
     */
    CROO,

    /**
     * Transaction is a dividend.
     * 
     */
    DIVI,

    /**
     * Transaction is another type of transaction.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static InvestmentFundTransactionOutType4Code fromValue(String v) {
        return valueOf(v);
    }

}
