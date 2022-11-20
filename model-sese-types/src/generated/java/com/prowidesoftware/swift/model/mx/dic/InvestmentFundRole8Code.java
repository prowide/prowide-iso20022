
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundRole8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestmentFundRole8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *     &lt;enumeration value="FMCO"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *     &lt;enumeration value="INVS"/&gt;
 *     &lt;enumeration value="TRAG"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="UCL1"/&gt;
 *     &lt;enumeration value="UCL2"/&gt;
 *     &lt;enumeration value="REGI"/&gt;
 *     &lt;enumeration value="CACO"/&gt;
 *     &lt;enumeration value="CONC"/&gt;
 *     &lt;enumeration value="DATP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestmentFundRole8Code")
@XmlEnum
public enum InvestmentFundRole8Code {


    /**
     * Party that safekeeps and administers assets on behalf of the owner.
     * 
     */
    CUST("CUST"),

    /**
     * Party that act as an wholesaler of funds.
     * 
     */
    DIST("DIST"),

    /**
     * Party that sets up a fund, decides upon the investment strategy, appoints agents, and is responsible for the promotion and the marketing of the fund. This party makes all the strategic decisions related to a fund.
     * 
     */
    FMCO("FMCO"),

    /**
     * Party that provides services to investors relating to financial products. These services may include some, or all of, provision of information and advice on products, placement of investment orders, transmission of payment, custody of assets, and the administration of rights and benefits. In the specific framework of investment funds industry, an intermediary may present information about funds to potential investors, and solicit orders for the fund. This intermediary may facilitate the transmission of the orders and information from/to the investors and/or other intermediaries. The intermediary receives commission from the Fund and/or fees from the investor.
     * 
     */
    INTR("INTR"),

    /**
     * Party that implements the investment strategy, that is, selects portfolio investments in accordance with the objectives and strategy in the fund's prospectus, and places orders to effect or liquidate selected investments in accordance with net flow of capital into or out of the fund.
     * 
     */
    INVE("INVE"),

    /**
     * Party, either an individual or organisation, whose assets are being invested.
     * 
     */
    INVS("INVS"),

    /**
     * Party appointed by the fund management company. This party updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution.
     * 
     */
    TRAG("TRAG"),

    /**
     * Party that transmits the instruction, advice, notification or report.
     * 
     */
    TRAN("TRAN"),

    /**
     * Underlying client of the intermediary.
     * 
     */
    @XmlEnumValue("UCL1")
    UCL_1("UCL1"),

    /**
     * Underlying client of underlying client 1.
     * 
     */
    @XmlEnumValue("UCL2")
    UCL_2("UCL2"),

    /**
     * Party responsible for keeping track of the owners of securities. In the investment fund business, this party keeps the investor registry of the fund, and administers investor accounts and related records. It is appointed by the fund management company.
     * 
     */
    REGI("REGI"),

    /**
     * Financial institution that executes cash transfers on behalf of its clients.
     * 
     */
    CACO("CACO"),

    /**
     * Party that acts as an aggregator of funds, also called a funds hub.
     * 
     */
    CONC("CONC"),

    /**
     * Source of financial information. Provides financial news and data (for example, facts, statistics and analysis), for professional and individual investors through various media, for example, the Internet, magazines.
     * 
     */
    DATP("DATP");
    private final String value;

    InvestmentFundRole8Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvestmentFundRole8Code fromValue(String v) {
        for (InvestmentFundRole8Code c: InvestmentFundRole8Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
