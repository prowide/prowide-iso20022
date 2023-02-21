
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundTransactionOutType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestmentFundTransactionOutType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="SWIO"/&gt;
 *     &lt;enumeration value="INSP"/&gt;
 *     &lt;enumeration value="CROO"/&gt;
 *     &lt;enumeration value="DIVI"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
