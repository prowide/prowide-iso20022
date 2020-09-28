
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BEND"/&gt;
 *     &lt;enumeration value="FEND"/&gt;
 *     &lt;enumeration value="SWIT"/&gt;
 *     &lt;enumeration value="DLEV"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="PENA"/&gt;
 *     &lt;enumeration value="MANF"/&gt;
 *     &lt;enumeration value="POST"/&gt;
 *     &lt;enumeration value="REGF"/&gt;
 *     &lt;enumeration value="SHIP"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="CDSC"/&gt;
 *     &lt;enumeration value="EQUL"/&gt;
 *     &lt;enumeration value="CBCH"/&gt;
 *     &lt;enumeration value="PREM"/&gt;
 *     &lt;enumeration value="INIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeType6Code")
@XmlEnum
public enum ChargeType6Code {


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
     * Fee paid to an investment manager for services. The fee usually includes fund administration costs and investor relationship management. Typically, the amount paid is a percentage of the assets under management.
     * 
     */
    MANF,

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
     * Another type of charge.
     * 
     */
    OTHR,

    /**
     * Deferred sales charge.
     * 
     */
    CDSC,

    /**
     * The part of an investor's subscription amount that is held by the fund in order to pay incentive or performance fees at the end of the fiscal year.
     * 
     */
    EQUL,

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
    INIT;

    public String value() {
        return name();
    }

    public static ChargeType6Code fromValue(String v) {
        return valueOf(v);
    }

}
