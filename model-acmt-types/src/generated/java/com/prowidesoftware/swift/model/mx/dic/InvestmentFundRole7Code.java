
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundRole7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentFundRole7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONC"/>
 *     <enumeration value="DIST"/>
 *     <enumeration value="FMCO"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="PAYI"/>
 *     <enumeration value="TRAG"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="CACO"/>
 *     <enumeration value="FACT"/>
 *     <enumeration value="INVE"/>
 *     <enumeration value="INVS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentFundRole7Code")
@XmlEnum
public enum InvestmentFundRole7Code {


    /**
     * Party that acts as an aggregator of funds, also called a funds hub.
     * 
     */
    CONC,

    /**
     * Party that act as an wholesaler of funds.
     * 
     */
    DIST,

    /**
     * Party that sets up a fund, decides upon the investment strategy, appoints agents, and is responsible for the promotion and the marketing of the fund. This party makes all the strategic decisions related to a fund.
     * 
     */
    FMCO,

    /**
     * Party that provides services to investors relating to financial products. These services may include some, or all of, provision of information and advice on products, placement of investment orders, transmission of payment, custody of assets, and the administration of rights and benefits. In the specific framework of investment funds industry, an intermediary may present information about funds to potential investors, and solicit orders for the fund. This intermediary may facilitate the transmission of the orders and information from/to the investors and/or other intermediaries. The intermediary receives commission from the Fund and/or fees from the investor.
     * 
     */
    INTR,

    /**
     * Agent that executes the payment. In the context of the investment fund industry, the paying agent is the local legal representative of the fund. It may pay out dividends, and collects money for the purchase of funds when a client deals directly with the fund and/or when a client deals with bearer shares. It pays out the redemption of the fund, may distribute information about the fund, and provides legal information about the fund.
     * 
     */
    PAYI,

    /**
     * Party appointed by the fund management company. This party updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution.
     * 
     */
    TRAG,

    /**
     * Party that safekeeps and administers assets on behalf of the owner.
     * 
     */
    CUST,

    /**
     * Financial institution that executes cash transfers on behalf of its clients.
     * 
     */
    CACO,

    /**
     * Party that keeps accounting records of the available assets and liabilities of the fund. This party calculates deal prices, the Net Asset Value (NAV) of the fund, and may provide fund performance and tax data.
     * 
     */
    FACT,

    /**
     * Party that implements the investment strategy, that is, selects portfolio investments in accordance with the objectives and strategy in the fund's prospectus, and places orders to effect or liquidate selected investments in accordance with net flow of capital into or out of the fund.
     * 
     */
    INVE,

    /**
     * Party, either an individual or organisation, whose assets are being invested.
     * 
     */
    INVS;

    public String value() {
        return name();
    }

    public static InvestmentFundRole7Code fromValue(String v) {
        return valueOf(v);
    }

}
