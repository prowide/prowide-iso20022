
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeType13Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BEND"/&gt;
 *     &lt;enumeration value="FEND"/&gt;
 *     &lt;enumeration value="SWIT"/&gt;
 *     &lt;enumeration value="DLEV"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="PENA"/&gt;
 *     &lt;enumeration value="POST"/&gt;
 *     &lt;enumeration value="REGF"/&gt;
 *     &lt;enumeration value="SHIP"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="CDSC"/&gt;
 *     &lt;enumeration value="CBCH"/&gt;
 *     &lt;enumeration value="PREM"/&gt;
 *     &lt;enumeration value="INIT"/&gt;
 *     &lt;enumeration value="BRKF"/&gt;
 *     &lt;enumeration value="UCIC"/&gt;
 *     &lt;enumeration value="SFEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeType13Code")
@XmlEnum
public enum ChargeType13Code {


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
    UCIC,

    /**
     * Specially agreed front-end load.
     * 
     */
    SFEN;

    public String value() {
        return name();
    }

    public static ChargeType13Code fromValue(String v) {
        return valueOf(v);
    }

}
