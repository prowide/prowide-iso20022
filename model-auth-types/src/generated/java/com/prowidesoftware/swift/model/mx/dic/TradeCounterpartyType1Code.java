
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeCounterpartyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeCounterpartyType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BENE"/>
 *     <enumeration value="BROK"/>
 *     <enumeration value="CLEM"/>
 *     <enumeration value="EXEA"/>
 *     <enumeration value="OTHC"/>
 *     <enumeration value="REPC"/>
 *     <enumeration value="SBMA"/>
 *     <enumeration value="ERFR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
