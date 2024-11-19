
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundRole4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentFundRole4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FMCO"/>
 *     <enumeration value="REGI"/>
 *     <enumeration value="TRAG"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="DIST"/>
 *     <enumeration value="CONC"/>
 *     <enumeration value="UCL1"/>
 *     <enumeration value="UCL2"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="CONI"/>
 *     <enumeration value="CONE"/>
 *     <enumeration value="CONA"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="FNBR"/>
 *     <enumeration value="PRBR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentFundRole4Code")
@XmlEnum
public enum InvestmentFundRole4Code {


    /**
     * Party that sets up a fund, decides upon the investment strategy, appoints agents, and is responsible for the promotion and the marketing of the fund. This party makes all the strategic decisions related to a fund.
     * 
     */
    FMCO("FMCO"),

    /**
     * Party responsible for keeping track of the owners of securities. In the investment fund business, this party keeps the investor registry of the fund, and administers investor accounts and related records. It is appointed by the fund management company.
     * 
     */
    REGI("REGI"),

    /**
     * Party appointed by the fund management company. This party updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution.
     * 
     */
    TRAG("TRAG"),

    /**
     * Party that provides services to investors relating to financial products. These services may include some, or all of, provision of information and advice on products, placement of investment orders, transmission of payment, custody of assets, and the administration of rights and benefits. In the specific framework of investment funds industry, an intermediary may present information about funds to potential investors, and solicit orders for the fund. This intermediary may facilitate the transmission of the orders and information from/to the investors and/or other intermediaries. The intermediary receives commission from the Fund and/or fees from the investor.
     * 
     */
    INTR("INTR"),

    /**
     * Party that act as an wholesaler of funds.
     * 
     */
    DIST("DIST"),

    /**
     * Party that acts as an aggregator of funds, also called a funds hub.
     * 
     */
    CONC("CONC"),

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
     * Party that transmits the instruction, advice, notification or report.
     * 
     */
    TRAN("TRAN"),

    /**
     * Party acting as the contact person at the instructing party institution.
     * 
     */
    CONI("CONI"),

    /**
     * Party acting as the contact person at the executing party institution.
     * 
     */
    CONE("CONE"),

    /**
     * Name of Agent to the order, if different from the instructing party.
     * 
     */
    CONA("CONA"),

    /**
     * Party that safekeeps and administers assets on behalf of the owner.
     * 
     */
    CUST("CUST"),

    /**
     * Party acting as an intermediary agent between an investor and a transfer agent for the subscription or redemption to a fund.
     * 
     */
    FNBR("FNBR"),

    /**
     * Party acting as settlement agent, provides custody for assets, provides financing for leverage, and prepares daily account statements for its clients, who are money managers, hedge funds, market makers, arbitrageurs, specialists and other professional investors.
     * 
     */
    PRBR("PRBR");
    private final String value;

    InvestmentFundRole4Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvestmentFundRole4Code fromValue(String v) {
        for (InvestmentFundRole4Code c: InvestmentFundRole4Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
