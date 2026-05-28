
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundFee3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentFundFee3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BEND"/>
 *     <enumeration value="BRKF"/>
 *     <enumeration value="CDSC"/>
 *     <enumeration value="CBCH"/>
 *     <enumeration value="DLEV"/>
 *     <enumeration value="FEND"/>
 *     <enumeration value="INIT"/>
 *     <enumeration value="PREM"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="SWIT"/>
 *     <enumeration value="UCIC"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="SHIP"/>
 *     <enumeration value="POST"/>
 *     <enumeration value="CDPL"/>
 *     <enumeration value="ADDF"/>
 *     <enumeration value="REGF"/>
 *     <enumeration value="PENA"/>
 *     <enumeration value="NTWK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentFundFee3Code")
@XmlEnum
public enum InvestmentFundFee3Code {


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
     * Amount paid out by the fund to a third party.
     * 
     */
    COMM,

    /**
     * Charge for shipping, including the insurance of securities.
     * 
     */
    SHIP,

    /**
     * Charge paid for the postage.
     * 
     */
    POST,

    /**
     * Amount of cash due to an intermediary for selling a product, or services, to a third party.
     * 
     */
    CDPL,

    /**
     * Additional fee not covered by another fee type.
     * 
     */
    ADDF,

    /**
     * Fee charged by a regulatory authority, for example, securities and exchange fees.
     * 
     */
    REGF,

    /**
     * Fee charged to the investor for early redemption of the fund.
     * 
     */
    PENA,

    /**
     * Network fee assigned to a transaction on a DLT network.
     * 
     */
    NTWK;

    public String value() {
        return name();
    }

    public static InvestmentFundFee3Code fromValue(String v) {
        return valueOf(v);
    }

}
