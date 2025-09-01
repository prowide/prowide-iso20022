
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundTransactionOutType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestmentFundTransactionOutType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="SWIO"/&gt;
 *     &lt;enumeration value="INSP"/&gt;
 *     &lt;enumeration value="CROO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestmentFundTransactionOutType1Code")
@XmlEnum
public enum InvestmentFundTransactionOutType1Code {


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
    CROO;

    public String value() {
        return name();
    }

    public static InvestmentFundTransactionOutType1Code fromValue(String v) {
        return valueOf(v);
    }

}
