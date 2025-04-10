
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingCapacity4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradingCapacity4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIN"/&gt;
 *     &lt;enumeration value="CPRN"/&gt;
 *     &lt;enumeration value="RISP"/&gt;
 *     &lt;enumeration value="PROP"/&gt;
 *     &lt;enumeration value="AGEN"/&gt;
 *     &lt;enumeration value="CAGN"/&gt;
 *     &lt;enumeration value="OAGN"/&gt;
 *     &lt;enumeration value="PRAG"/&gt;
 *     &lt;enumeration value="BAGN"/&gt;
 *     &lt;enumeration value="INFI"/&gt;
 *     &lt;enumeration value="MKTM"/&gt;
 *     &lt;enumeration value="MLTF"/&gt;
 *     &lt;enumeration value="RMKT"/&gt;
 *     &lt;enumeration value="SINT"/&gt;
 *     &lt;enumeration value="TAGT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradingCapacity4Code")
@XmlEnum
public enum TradingCapacity4Code {


    /**
     * Trading as Principal.
     * 
     */
    PRIN,

    /**
     * Crossing as a principal.
     * 
     */
    CPRN,

    /**
     * Trading as a riskless principal, ie, the order to buy(sell) has been simultaneously offset by an order to sell (buy) with another party.
     * 
     */
    RISP,

    /**
     * Trading for its firm. The transaction affects the firm's own account, not that of its customers.
     * 
     */
    PROP,

    /**
     * Trading as Agent on behalf of a customer.
     * 
     */
    AGEN,

    /**
     * Crossing as an agent.
     * 
     */
    CAGN,

    /**
     * Acting as an agent for a party other than a customer.
     * 
     */
    OAGN,

    /**
     * Acting as an agent for some executions and principal for others in the same transaction.
     * 
     */
    PRAG,

    /**
     * Party acting as an agent for both customer and another person.
     * 
     */
    BAGN,

    /**
     * Any legal person whose regular occupation or business is the provision of one or more investment services to third parties and/or the performance of one or more investment activities on a professional basis.
     * 
     */
    INFI,

    /**
     * Dealer or specialist that is trading for their own account in the OTC market. Market makers are expected to maintain an orderly market by being available to buy or sell.
     * 
     */
    MKTM,

    /**
     * Multilateral Trading Facility (MTF) is a multilateral system which brings together multiple third-party buying and selling interests in financial instruments in a way that results in a contract.
     * 
     */
    MLTF,

    /**
     * Regulated market on which financial instruments can be traded according to rules defined by the stock exchange.
     * 
     */
    RMKT,

    /**
     * Firms which, on an organised, frequent and systematic basis, deal on their own account by executing client orders outside a regulated market or an MTF. SIs have the obligation to provide, and make public, a definite bid and offer quote for liquid securities.
     * 
     */
    SINT,

    /**
     * Party appointed by the Fund Management Company. It updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution.
     * 
     */
    TAGT;

    public String value() {
        return name();
    }

    public static TradingCapacity4Code fromValue(String v) {
        return valueOf(v);
    }

}
