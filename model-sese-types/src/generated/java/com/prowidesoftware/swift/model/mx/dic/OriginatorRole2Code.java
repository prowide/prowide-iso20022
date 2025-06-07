
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginatorRole2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OriginatorRole2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SINT"/&gt;
 *     &lt;enumeration value="MLTF"/&gt;
 *     &lt;enumeration value="RMKT"/&gt;
 *     &lt;enumeration value="MKTM"/&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *     &lt;enumeration value="TAGT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OriginatorRole2Code")
@XmlEnum
public enum OriginatorRole2Code {


    /**
     * Firms which, on an organised, frequent and systematic basis deal on their own account by executing client orders outside a regulated market or a Multilateral Trading Facility. SI's will have the obligation to provide, and make public, a definite bid and offer quote for liquid securities. They act as "mini"exchanges.
     * 
     */
    SINT,

    /**
     * Multilateral system which brings together multiple third-party buying and selling interests in financial instruments in a way that results in a contract.
     * 
     */
    MLTF,

    /**
     * Market on which financial instruments can be traded according to rules defined by the stock exchange.
     * 
     */
    RMKT,

    /**
     * Dealer or specialist that is trading for their own account in the OTC market. Market makers are expected to maintain an orderly market by being available to buy or sell.
     * 
     */
    MKTM,

    /**
     * Party, either an individual or organisation, whose assets are being invested.
     * 
     */
    INVE,

    /**
     * Party appointed by the fund management company. It updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution.
     * 
     */
    TAGT;

    public String value() {
        return name();
    }

    public static OriginatorRole2Code fromValue(String v) {
        return valueOf(v);
    }

}
