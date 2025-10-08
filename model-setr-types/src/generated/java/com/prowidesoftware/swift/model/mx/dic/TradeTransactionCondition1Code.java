
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTransactionCondition1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeTransactionCondition1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CBNS"/&gt;
 *     &lt;enumeration value="XBNS"/&gt;
 *     &lt;enumeration value="CCPN"/&gt;
 *     &lt;enumeration value="XCPN"/&gt;
 *     &lt;enumeration value="CDIV"/&gt;
 *     &lt;enumeration value="XDIV"/&gt;
 *     &lt;enumeration value="CRTS"/&gt;
 *     &lt;enumeration value="XRTS"/&gt;
 *     &lt;enumeration value="CWAR"/&gt;
 *     &lt;enumeration value="XWAR"/&gt;
 *     &lt;enumeration value="SPCU"/&gt;
 *     &lt;enumeration value="SPEX"/&gt;
 *     &lt;enumeration value="DUEB"/&gt;
 *     &lt;enumeration value="SSTI"/&gt;
 *     &lt;enumeration value="DIRT"/&gt;
 *     &lt;enumeration value="CLEN"/&gt;
 *     &lt;enumeration value="BLKO"/&gt;
 *     &lt;enumeration value="GTDL"/&gt;
 *     &lt;enumeration value="FRAC"/&gt;
 *     &lt;enumeration value="CRST"/&gt;
 *     &lt;enumeration value="NCRS"/&gt;
 *     &lt;enumeration value="DORD"/&gt;
 *     &lt;enumeration value="DIOR"/&gt;
 *     &lt;enumeration value="WARE"/&gt;
 *     &lt;enumeration value="DNIN"/&gt;
 *     &lt;enumeration value="DNRE"/&gt;
 *     &lt;enumeration value="FORW"/&gt;
 *     &lt;enumeration value="HIST"/&gt;
 *     &lt;enumeration value="BCRO"/&gt;
 *     &lt;enumeration value="BCRP"/&gt;
 *     &lt;enumeration value="BCPD"/&gt;
 *     &lt;enumeration value="BCFD"/&gt;
 *     &lt;enumeration value="BCBL"/&gt;
 *     &lt;enumeration value="BCBN"/&gt;
 *     &lt;enumeration value="BTEX"/&gt;
 *     &lt;enumeration value="CALL"/&gt;
 *     &lt;enumeration value="CLBR"/&gt;
 *     &lt;enumeration value="MONT"/&gt;
 *     &lt;enumeration value="NBFR"/&gt;
 *     &lt;enumeration value="TRFR"/&gt;
 *     &lt;enumeration value="PUTT"/&gt;
 *     &lt;enumeration value="SPCC"/&gt;
 *     &lt;enumeration value="SECN"/&gt;
 *     &lt;enumeration value="SEBN"/&gt;
 *     &lt;enumeration value="SCBN"/&gt;
 *     &lt;enumeration value="SCRT"/&gt;
 *     &lt;enumeration value="SERT"/&gt;
 *     &lt;enumeration value="SCCR"/&gt;
 *     &lt;enumeration value="SECR"/&gt;
 *     &lt;enumeration value="CAST"/&gt;
 *     &lt;enumeration value="SPPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeTransactionCondition1Code")
@XmlEnum
public enum TradeTransactionCondition1Code {


    /**
     * Indicates whether the trade is executed cum bonus.
     * 
     */
    CBNS,

    /**
     * Indicates whether the trade is executed ex bonus.
     * 
     */
    XBNS,

    /**
     * Indicates whether the trade is executed cum coupon.
     * 
     */
    CCPN,

    /**
     * Indicates whether the trade is executed ex coupon.
     * 
     */
    XCPN,

    /**
     * Indicates whether the trade is executed cum dividend.
     * 
     */
    CDIV,

    /**
     * Indicates whether the trade is executed ex dividend.
     * 
     */
    XDIV,

    /**
     * Indicates whether the trade is executed cum rights.
     * 
     */
    CRTS,

    /**
     * Indicates whether the trade is executed ex rights.
     * 
     */
    XRTS,

    /**
     * Indicates whether the trade is executed cum warrant.
     * 
     */
    CWAR,

    /**
     * Indicates whether the trade is executed ex warrant.
     * 
     */
    XWAR,

    /**
     * Indicates whether the trade is executed with a special cum 
     * dividend, that is, buying after the ex date and getting the dividend.
     * 
     */
    SPCU,

    /**
     * Indicates whether the trade is executed with a special ex 
     * dividend, that is, selling before the ex date without the coupon.
     * 
     */
    SPEX,

    /**
     * Indicates that the trade is executed cum-dividend or cum-coupon and a due bill is required. 
     * A due bill is a contractual agreement to pay the dividend along with the delivery of 
     * the financial instrument.
     * 
     */
    DUEB,

    /**
     * Indicates whether the trade is sold short. When the seller does not have the 
     * financial instrument, the delivery is effected by borrowing the financial instrument by or 
     * for the account of the seller.
     * 
     */
    SSTI,

    /**
     * Indicates that the trade is executed dirty, ie government tax must be paid on the accrued interest on the bond.
     * 
     */
    DIRT,

    /**
     * Indicates that the trade is executed clean, ie government tax must not be paid on the accrued interest on the bond.
     * 
     */
    CLEN,

    /**
     * Indicates whether the trade is a block trade or not, ie, whether allocation instruction will follow or not.
     * 
     */
    BLKO,

    /**
     * Indicates whether the delivery of the financial instrument on settlement date 
     * is guaranteed.
     * 
     */
    GTDL,

    /**
     * Indicates whether fractional parts are allowed.
     * 
     */
    FRAC,

    /**
     * Indicates that cross trades are allowed whereby buy and sell orders are offset without recording the trade on the exchange.
     * 
     */
    CRST,

    /**
     * Indicates that cross trades, whereby buy and sell orders are offset without recording the trade on the exchange, are not allowed.
     * 
     */
    NCRS,

    /**
     * Indicates that the order is to be executed by a trading party other than the trading party to which the 
     * order is sent. In this case, the instructing party has traded with another broker which will 
     * subsequently send an advice of execution to the executing party who received the order 
     * and which is acting as clearing broker.
     * 
     */
    DORD,

    /**
     * Indicates that the order must be executed with a specific trading party.
     * 
     */
    DIOR,

    /**
     * Warehouse Trade.
     * 
     */
    WARE,

    /**
     * A limit order to buy or a stop order to sell or a stop limit order which is not to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution.
     * 
     */
    DNIN,

    /**
     * A limit order to buy or a stop order to sell, or a stop-limit order to sell which is not to be reduced in price by the amount of an ordinary cash dividend. Only applies to ordinary stock dividends; it should be reduced for other distributions. e.g. when a stock goes 'ex' stock dividend or rights.
     * 
     */
    DNRE,

    /**
     * Indicates that the order is based on a forward price.
     * 
     */
    FORW,

    /**
     * Indicates that the order is based on a historic price.
     * 
     */
    HIST,

    /**
     * Result of option when set. (UK specific).
     * 
     */
    BCRO,

    /**
     * Result of repo when set (UK specific).
     * 
     */
    BCRP,

    /**
     * Place of delivery, in country of incorporation when unset (UK specific).
     * 
     */
    BCPD,

    /**
     * Form of delivery, not for foreign registration when unset (UK specific).
     * 
     */
    BCFD,

    /**
     * Board lots, not set for odd lots (UK specific).
     * 
     */
    BCBL,

    /**
     * Bad names, not set for good names (UK specific).
     * 
     */
    BCBN,

    /**
     * Trade to be executed done at best execution.
     * 
     */
    BTEX,

    /**
     * Trade to be executed following the exercise of a call option on the security.
     * 
     */
    CALL,

    /**
     * Trade to be executed for closure of a previous position before the rollover of a position (Deferred Settlement Service).
     * 
     */
    CLBR,

    /**
     * Trade to be executed for month-end settlement (Deferred Settlement Service).
     * 
     */
    MONT,

    /**
     * Trade to be executed for a new trade position on the next month following the roll-over of a position (Deferred Settlement Service).
     * 
     */
    NBFR,

    /**
     * Trade to be executed on the next month following the roll-over of positions.
     * 
     */
    TRFR,

    /**
     * Trade to be executed following the exercise of a put option on the security.
     * 
     */
    PUTT,

    /**
     * Indicates whether the trade is executed with a special cum coupon.
     * 
     */
    SPCC,

    /**
     * Indicates whether the trade is executed with a special ex coupon.
     * 
     */
    SECN,

    /**
     * Indicates whether the trade is executed special ex bonus.
     * 
     */
    SEBN,

    /**
     * Indicates whether the trade is executed special cum bonus.
     * 
     */
    SCBN,

    /**
     * Indicates whether the trade is executed special cum rights.
     * 
     */
    SCRT,

    /**
     * Indicates whether the trade is executed special ex rights.
     * 
     */
    SERT,

    /**
     * Indicates whether the trade is executed special cum capital repayments.
     * 
     */
    SCCR,

    /**
     * Indicates whether the trade is executed special ex capital repayments.
     * 
     */
    SECR,

    /**
     * Indicates whether the trade is executed with a cash settlement.
     * 
     */
    CAST,

    /**
     * Indicates whether the trade is executed with a special price.
     * 
     */
    SPPR;

    public String value() {
        return name();
    }

    public static TradeTransactionCondition1Code fromValue(String v) {
        return valueOf(v);
    }

}
