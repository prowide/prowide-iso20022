
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BSKT"/&gt;
 *     &lt;enumeration value="INDX"/&gt;
 *     &lt;enumeration value="IPOO"/&gt;
 *     &lt;enumeration value="LIST"/&gt;
 *     &lt;enumeration value="PRAL"/&gt;
 *     &lt;enumeration value="PROG"/&gt;
 *     &lt;enumeration value="TRAD"/&gt;
 *     &lt;enumeration value="BRBR"/&gt;
 *     &lt;enumeration value="RISK"/&gt;
 *     &lt;enumeration value="VWAP"/&gt;
 *     &lt;enumeration value="AGEN"/&gt;
 *     &lt;enumeration value="GUAR"/&gt;
 *     &lt;enumeration value="EMTR"/&gt;
 *     &lt;enumeration value="ISSU"/&gt;
 *     &lt;enumeration value="BOST"/&gt;
 *     &lt;enumeration value="BOEN"/&gt;
 *     &lt;enumeration value="LABO"/&gt;
 *     &lt;enumeration value="BORE"/&gt;
 *     &lt;enumeration value="OFIT"/&gt;
 *     &lt;enumeration value="BOSU"/&gt;
 *     &lt;enumeration value="FBBT"/&gt;
 *     &lt;enumeration value="OPTN"/&gt;
 *     &lt;enumeration value="FUOP"/&gt;
 *     &lt;enumeration value="FUTR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeType3Code")
@XmlEnum
public enum TradeType3Code {


    /**
     * A basket trade, i.e. a unit of 15 or more financial instruments used in program trading.
     * 
     */
    BSKT,

    /**
     * A trade of a predetermined set of financial instruments.
     * 
     */
    INDX,

    /**
     * Transaction is an Initial Public Offer (IPO) order.
     * 
     */
    IPOO,

    /**
     * A trade of a predetermined set of financial instruments.
     * 
     */
    LIST,

    /**
     * A pre-allocated trade.
     * 
     */
    PRAL,

    /**
     * A program trade, i.e. a computer-driven trade of buying and selling of baskets of 15 or more financial instruments by index arbitrage specialists or institutional traders.
     * 
     */
    PROG,

    /**
     * An executed order.
     * 
     */
    TRAD,

    /**
     * A trade from a broker to another broker.
     * 
     */
    BRBR,

    /**
     * Trade involving risk.
     * 
     */
    RISK,

    /**
     * Trade whose price is guaranteed as the weighted average of the trade prices on a specific day.
     * 
     */
    VWAP,

    /**
     * Trade in which an agent intermediates between a buyer and a seller.
     * 
     */
    AGEN,

    /**
     * Trade which is guaranteed to be finalized.
     * 
     */
    GUAR,

    /**
     * Transaction relates to employee trade reporting.
     * 
     */
    EMTR,

    /**
     * Relates to the issuance of a security such as an equity or a depositary receipt.
     * 
     */
    ISSU,

    /**
     * The trade is a Bond start.
     * 
     */
    BOST,

    /**
     * The trade is a Bond end.
     * 
     */
    BOEN,

    /**
     * Indicates that the trade is a Lending and borrowing.
     * 
     */
    LABO,

    /**
     * The trade is a Bond repricing.
     * 
     */
    BORE,

    /**
     * Indicates that the trade is a Offering issue trade.
     * 
     */
    OFIT,

    /**
     * The trade is a Bond substitution.
     * 
     */
    BOSU,

    /**
     * The security will be bought back in the future.
     * 
     */
    FBBT,

    /**
     * Indicates that the trade is a Option contract trade.
     * 
     */
    OPTN,

    /**
     * Indicates that the trade is a Futures option contract trade.
     * 
     */
    FUOP,

    /**
     * Indicates that the trade is a Futures contract trade.
     * 
     */
    FUTR;

    public String value() {
        return name();
    }

    public static TradeType3Code fromValue(String v) {
        return valueOf(v);
    }

}
