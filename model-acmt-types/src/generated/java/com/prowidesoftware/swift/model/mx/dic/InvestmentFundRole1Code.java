
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundRole1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestmentFundRole1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CACO"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="DATP"/&gt;
 *     &lt;enumeration value="FIAG"/&gt;
 *     &lt;enumeration value="FMCO"/&gt;
 *     &lt;enumeration value="FACT"/&gt;
 *     &lt;enumeration value="INVS"/&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *     &lt;enumeration value="PAYI"/&gt;
 *     &lt;enumeration value="REGI"/&gt;
 *     &lt;enumeration value="TRAG"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="FTAG"/&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *     &lt;enumeration value="CONC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestmentFundRole1Code")
@XmlEnum
public enum InvestmentFundRole1Code {


    /**
     * Financial institution that executes cash transfers on behalf of its clients.
     * 
     */
    CACO,

    /**
     * Party that safekeeps and administers assets on behalf of the owner.
     * 
     */
    CUST,

    /**
     * Source of financial information. Provides financial news and data (for example, facts, statistics and analysis), for professional and individual investors through various media, for example, the Internet, magazines.
     * 
     */
    DATP,

    /**
     * Financial institution that receives the payment transaction on behalf of an account owner, or other nominated party, and credits the account.
     * 
     */
    FIAG,

    /**
     * Party that sets up a fund, decides upon the investment strategy, appoints agents, and is responsible for the promotion and the marketing of the fund. This party makes all the strategic decisions related to a fund.
     * 
     */
    FMCO,

    /**
     * Party that keeps accounting records of the available assets and liabilities of the fund. This party calculates deal prices, the Net Asset Value (NAV) of the fund, and may provide fund performance and tax data.
     * 
     */
    FACT,

    /**
     * Party, either an individual or organisation, whose assets are being invested.
     * 
     */
    INVS,

    /**
     * Party that implements the investment strategy, that is, selects portfolio investments in accordance with the objectives and strategy in the fund's prospectus, and places orders to effect or liquidate selected investments in accordance with net flow of capital into or out of the fund.
     * 
     */
    INVE,

    /**
     * Agent that executes the payment. In the context of the investment fund industry, the paying agent is the local legal representative of the fund. It may pay out dividends, and collects money for the purchase of funds when a client deals directly with the fund and/or when a client deals with bearer shares. It pays out the redemption of the fund, may distribute information about the fund, and provides legal information about the fund.
     * 
     */
    PAYI,

    /**
     * Party responsible for keeping track of the owners of securities. In the investment fund business, this party keeps the investor registry of the fund, and administers investor accounts and related records. It is appointed by the fund management company.
     * 
     */
    REGI,

    /**
     * Party appointed by the fund management company. This party updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution.
     * 
     */
    TRAG,

    /**
     * Party that provides services to investors relating to financial products. These services may include some, or all of, provision of information and advice on products, placement of investment orders, transmission of payment, custody of assets, and the administration of rights and benefits. In the specific framework of investment funds industry, an intermediary may present information about funds to potential investors, and solicit orders for the fund. This intermediary may facilitate the transmission of the orders and information from/to the investors and/or other intermediaries. The intermediary receives commission from the Fund and/or fees from the investor.
     * 
     */
    INTR,

    /**
     * Financial institution that receives the payment transaction from the account owner, or other authorised party, and processes the instruction.
     * 
     */
    FTAG,

    /**
     * Party that act as an wholesaler of funds.
     * 
     */
    DIST,

    /**
     * Party that acts as an aggregator of funds, also called a funds hub.
     * 
     */
    CONC;

    public String value() {
        return name();
    }

    public static InvestmentFundRole1Code fromValue(String v) {
        return valueOf(v);
    }

}
