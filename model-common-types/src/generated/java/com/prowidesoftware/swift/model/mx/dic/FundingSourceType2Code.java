
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundingSourceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundingSourceType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOYL"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SVNG"/&gt;
 *     &lt;enumeration value="UVRL"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CRDT"/&gt;
 *     &lt;enumeration value="CDBT"/&gt;
 *     &lt;enumeration value="EPRS"/&gt;
 *     &lt;enumeration value="DBAC"/&gt;
 *     &lt;enumeration value="CURR"/&gt;
 *     &lt;enumeration value="CHQE"/&gt;
 *     &lt;enumeration value="PRPD"/&gt;
 *     &lt;enumeration value="LCDT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FundingSourceType2Code")
@XmlEnum
public enum FundingSourceType2Code {


    /**
     * Loyalty points converted into cash
     * 
     */
    LOYL,

    /**
     * Other type of account defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of account defined at private level.
     * 
     */
    OTHP,

    /**
     * Savings account.
     * 
     */
    SVNG,

    /**
     * Universal account.
     * 
     */
    UVRL,

    /**
     * Cash as a source type  to perform the transaction.
     * 
     */
    CASH,

    /**
     * Credit card account.
     * 
     */
    CRDT,

    /**
     * Debit card account.
     * 
     */
    CDBT,

    /**
     * Electronic purse card account.
     * 
     */
    EPRS,

    /**
     * Account for debiting funds.
     * 
     */
    DBAC,

    /**
     * Current account.
     * 
     */
    CURR,

    /**
     * Cheque
     * 
     */
    CHQE,

    /**
     * Pre-paid account.
     * 
     */
    PRPD,

    /**
     * Line of credit account.
     * 
     */
    LCDT;

    public String value() {
        return name();
    }

    public static FundingSourceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
