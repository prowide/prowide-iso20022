
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundFee2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentFundFee2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BEND"/>
 *     <enumeration value="FEND"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="POST"/>
 *     <enumeration value="REGF"/>
 *     <enumeration value="SHIP"/>
 *     <enumeration value="SPCN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentFundFee2Code")
@XmlEnum
public enum InvestmentFundFee2Code {


    /**
     * Fee paid by the investor to the fund or fund management company when redeeming.
     * 
     */
    BEND,

    /**
     * Fee paid by the investor to the fund or fund management company when subscribing.
     * 
     */
    FEND,

    /**
     * In investment funds, a fee charged for the transfer of ownership of an investment fund.
     * 
     */
    TRAN,

    /**
     * Charge paid for the postage.
     * 
     */
    POST,

    /**
     * Fee charged by a regulatory authority, for example, securities and exchange fees.
     * 
     */
    REGF,

    /**
     * Charge for shipping, including the insurance of securities.
     * 
     */
    SHIP,

    /**
     * Fees, drawdown, or other reduction from or in addition to the deal price.
     * 
     */
    SPCN;

    public String value() {
        return name();
    }

    public static InvestmentFundFee2Code fromValue(String v) {
        return valueOf(v);
    }

}
