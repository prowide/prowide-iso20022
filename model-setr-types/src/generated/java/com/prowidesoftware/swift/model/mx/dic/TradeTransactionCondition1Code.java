
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTransactionCondition1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeTransactionCondition1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CBNS"/>
 *     <enumeration value="XBNS"/>
 *     <enumeration value="CCPN"/>
 *     <enumeration value="XCPN"/>
 *     <enumeration value="CDIV"/>
 *     <enumeration value="XDIV"/>
 *     <enumeration value="CRTS"/>
 *     <enumeration value="XRTS"/>
 *     <enumeration value="CWAR"/>
 *     <enumeration value="XWAR"/>
 *     <enumeration value="SPCU"/>
 *     <enumeration value="SPEX"/>
 *     <enumeration value="DUEB"/>
 *     <enumeration value="SSTI"/>
 *     <enumeration value="DIRT"/>
 *     <enumeration value="CLEN"/>
 *     <enumeration value="BLKO"/>
 *     <enumeration value="GTDL"/>
 *     <enumeration value="FRAC"/>
 *     <enumeration value="CRST"/>
 *     <enumeration value="NCRS"/>
 *     <enumeration value="DORD"/>
 *     <enumeration value="DIOR"/>
 *     <enumeration value="WARE"/>
 *     <enumeration value="DNIN"/>
 *     <enumeration value="DNRE"/>
 *     <enumeration value="FORW"/>
 *     <enumeration value="HIST"/>
 *     <enumeration value="BCRO"/>
 *     <enumeration value="BCRP"/>
 *     <enumeration value="BCPD"/>
 *     <enumeration value="BCFD"/>
 *     <enumeration value="BCBL"/>
 *     <enumeration value="BCBN"/>
 *     <enumeration value="BTEX"/>
 *     <enumeration value="CALL"/>
 *     <enumeration value="CLBR"/>
 *     <enumeration value="MONT"/>
 *     <enumeration value="NBFR"/>
 *     <enumeration value="TRFR"/>
 *     <enumeration value="PUTT"/>
 *     <enumeration value="SPCC"/>
 *     <enumeration value="SECN"/>
 *     <enumeration value="SEBN"/>
 *     <enumeration value="SCBN"/>
 *     <enumeration value="SCRT"/>
 *     <enumeration value="SERT"/>
 *     <enumeration value="SCCR"/>
 *     <enumeration value="SECR"/>
 *     <enumeration value="CAST"/>
 *     <enumeration value="SPPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
