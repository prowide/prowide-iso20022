
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundRole2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestmentFundRole2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FMCO"/&gt;
 *     &lt;enumeration value="REGI"/&gt;
 *     &lt;enumeration value="TRAG"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *     &lt;enumeration value="CONC"/&gt;
 *     &lt;enumeration value="UCL1"/&gt;
 *     &lt;enumeration value="UCL2"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestmentFundRole2Code")
@XmlEnum
public enum InvestmentFundRole2Code {


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
    TRAN("TRAN");
    private final String value;

    InvestmentFundRole2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvestmentFundRole2Code fromValue(String v) {
        for (InvestmentFundRole2Code c: InvestmentFundRole2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
