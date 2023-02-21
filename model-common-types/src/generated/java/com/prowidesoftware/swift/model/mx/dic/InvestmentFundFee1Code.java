
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundFee1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestmentFundFee1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BEND"/&gt;
 *     &lt;enumeration value="BRKF"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="CDPL"/&gt;
 *     &lt;enumeration value="CDSC"/&gt;
 *     &lt;enumeration value="CBCH"/&gt;
 *     &lt;enumeration value="DLEV"/&gt;
 *     &lt;enumeration value="FEND"/&gt;
 *     &lt;enumeration value="INIT"/&gt;
 *     &lt;enumeration value="ADDF"/&gt;
 *     &lt;enumeration value="POST"/&gt;
 *     &lt;enumeration value="PREM"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="SHIP"/&gt;
 *     &lt;enumeration value="SWIT"/&gt;
 *     &lt;enumeration value="UCIC"/&gt;
 *     &lt;enumeration value="REGF"/&gt;
 *     &lt;enumeration value="PENA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestmentFundFee1Code")
@XmlEnum
public enum InvestmentFundFee1Code {


    /**
     * Fee paid by the investor to the fund or fund management company when redeeming.
     * 
     */
    BEND,

    /**
     * Fee paid to a broker for services provided.
     * 
     */
    BRKF,

    /**
     * Amount paid out by the fund to a third party.
     * 
     */
    COMM,

    /**
     * Amount of cash due to an intermediary for selling a product, or services, to a third party.
     * 
     */
    CDPL,

    /**
     * Deferred sales charge.
     * 
     */
    CDSC,

    /**
     * In investment funds, the charge of the correspondent bank for transferring money.
     * 
     */
    CBCH,

    /**
     * In investment funds, a charge payable by the investor covering bid-offer spreads and dealing charges for the underlying investments. The dilution levy is paid to the fund for the benefit of other unit holders.
     * 
     */
    DLEV,

    /**
     * Fee paid by the investor to the fund or fund management company when subscribing.
     * 
     */
    FEND,

    /**
     * Charge paid at the time of the first subscription.
     * 
     */
    INIT,

    /**
     * Additional fee not covered by another fee type.
     * 
     */
    ADDF,

    /**
     * Charge paid for the postage.
     * 
     */
    POST,

    /**
     * In investment funds, pre-arranged addition to the trade amount based on the published net asset value.
     * 
     */
    PREM,

    /**
     * Fee paid by the investor to a distributor/intermediary or other service provider for the provision of financial services.
     * 
     */
    CHAR,

    /**
     * Charge for shipping, including the insurance of securities.
     * 
     */
    SHIP,

    /**
     * In investment funds, charge related to a switch transaction.
     * 
     */
    SWIT,

    /**
     * Charges paid by the investor to the fund company for subscription and redemption orders.
     * 
     */
    UCIC,

    /**
     * Fee charged by a regulatory authority, for example, securities and exchange fees.
     * 
     */
    REGF,

    /**
     * Fee charged to the investor for early redemption of the fund.
     * 
     */
    PENA;

    public String value() {
        return name();
    }

    public static InvestmentFundFee1Code fromValue(String v) {
        return valueOf(v);
    }

}
