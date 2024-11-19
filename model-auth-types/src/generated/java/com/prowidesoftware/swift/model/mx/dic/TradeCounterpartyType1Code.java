
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeCounterpartyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeCounterpartyType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BENE"/&gt;
 *     &lt;enumeration value="BROK"/&gt;
 *     &lt;enumeration value="CLEM"/&gt;
 *     &lt;enumeration value="EXEA"/&gt;
 *     &lt;enumeration value="OTHC"/&gt;
 *     &lt;enumeration value="REPC"/&gt;
 *     &lt;enumeration value="SBMA"/&gt;
 *     &lt;enumeration value="ERFR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeCounterpartyType1Code")
@XmlEnum
public enum TradeCounterpartyType1Code {


    /**
     * Specifies that party to the transaction is a Beneficiary.
     * 
     */
    BENE,

    /**
     * Specifies that party to the transaction is a Broker.
     * 
     */
    BROK,

    /**
     * Specifies that party to the transaction is a Clearing Member.
     * 
     */
    CLEM,

    /**
     * Specifies that party to the transaction is an Executing Agent.
     * 
     */
    EXEA,

    /**
     * Specifies that party to the transaction is an Other Counterparty.
     * 
     */
    OTHC,

    /**
     * Specifies that party to the transaction is a Reporting Counterparty.
     * 
     */
    REPC,

    /**
     * Specifies that party to the transaction is a Submitting Agent.
     * 
     */
    SBMA,

    /**
     * Specifies that party to the transaction is an Entity Responsible For Report.
     * 
     */
    ERFR;

    public String value() {
        return name();
    }

    public static TradeCounterpartyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
