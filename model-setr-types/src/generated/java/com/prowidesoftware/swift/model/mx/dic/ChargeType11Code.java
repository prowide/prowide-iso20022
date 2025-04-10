
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ChargeType11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BEND"/>
 *     <enumeration value="FEND"/>
 *     <enumeration value="SWIT"/>
 *     <enumeration value="DLEV"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="PENA"/>
 *     <enumeration value="POST"/>
 *     <enumeration value="REGF"/>
 *     <enumeration value="SHIP"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="CDSC"/>
 *     <enumeration value="CBCH"/>
 *     <enumeration value="PREM"/>
 *     <enumeration value="INIT"/>
 *     <enumeration value="BRKF"/>
 *     <enumeration value="UCIC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ChargeType11Code")
@XmlEnum
public enum ChargeType11Code {


    /**
     * Sales charge paid by the investor when redeeming an investment such as an investment fund.
     * 
     */
    BEND,

    /**
     * Sales charge paid immediately by the investor when subscribing to an investment such as an investment fund.
     * 
     */
    FEND,

    /**
     * In investment funds, charge related to a switch transaction.
     * 
     */
    SWIT,

    /**
     * In investment funds, a charge payable by the investor covering bid-offer spreads and dealing charges for the underlying investments. The dilution levy is paid to the fund for the benefit of other unit holders.
     * 
     */
    DLEV,

    /**
     * Charge that has been reduced from the standard initial charge levied by a fund, eg, during a launch period or as negotiated by a funds supermarket / discount broker.
     * 
     */
    DISC,

    /**
     * Fee charged to the investor for early redemption of the fund.
     * 
     */
    PENA,

    /**
     * Charge paid for the postage.
     * 
     */
    POST,

    /**
     * Fee charged by a regulatory authority, eg, Securities and Exchange fees.
     * 
     */
    REGF,

    /**
     * Charge for shipping, including the insurance of securities.
     * 
     */
    SHIP,

    /**
     * Fee paid for the provision of financial services.
     * 
     */
    CHAR,

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
     * In investment funds, pre-arranged addition to the trade amount based on the published net asset value.
     * 
     */
    PREM,

    /**
     * Charge paid at the time of the first subscription.
     * 
     */
    INIT,

    /**
     * Fee paid to a broker for services provided.
     * 
     */
    BRKF,

    /**
     * Charges paid by the investor to the Fund Company for subscription and redemption orders.
     * 
     */
    UCIC;

    public String value() {
        return name();
    }

    public static ChargeType11Code fromValue(String v) {
        return valueOf(v);
    }

}
