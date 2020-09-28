
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundTransactionInType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestmentFundTransactionInType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUBS"/&gt;
 *     &lt;enumeration value="SWII"/&gt;
 *     &lt;enumeration value="INSP"/&gt;
 *     &lt;enumeration value="CROI"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestmentFundTransactionInType3Code")
@XmlEnum
public enum InvestmentFundTransactionInType3Code {


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
     * Transaction is an InSpecie
     * 
     */
    INSP,

    /**
     * Transaction is a cross-in.
     * 
     */
    CROI,

    /**
     * Transaction is another type of transaction.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static InvestmentFundTransactionInType3Code fromValue(String v) {
        return valueOf(v);
    }

}
