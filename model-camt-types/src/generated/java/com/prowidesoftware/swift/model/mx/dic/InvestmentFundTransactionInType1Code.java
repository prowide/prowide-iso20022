
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundTransactionInType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentFundTransactionInType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SUBS"/>
 *     <enumeration value="SWII"/>
 *     <enumeration value="INSP"/>
 *     <enumeration value="CROI"/>
 *     <enumeration value="RDIV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentFundTransactionInType1Code")
@XmlEnum
public enum InvestmentFundTransactionInType1Code {


    /**
     * Transaction is a subscription to an investment fund.
     * 
     */
    SUBS,

    /**
     * Transaction is a subscription leg of a switch order execution.
     * 
     */
    SWII,

    /**
     * Transaction is an InSpecie.
     * 
     */
    INSP,

    /**
     * Transaction is a cross-in.
     * 
     */
    CROI,

    /**
     * Transaction is a reinvestment of dividend.
     * 
     */
    RDIV;

    public String value() {
        return name();
    }

    public static InvestmentFundTransactionInType1Code fromValue(String v) {
        return valueOf(v);
    }

}
