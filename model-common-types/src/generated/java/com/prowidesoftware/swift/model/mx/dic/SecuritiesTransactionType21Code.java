
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionType21Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesTransactionType21Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CNCB"/&gt;
 *     &lt;enumeration value="BSBK"/&gt;
 *     &lt;enumeration value="COLI"/&gt;
 *     &lt;enumeration value="COLO"/&gt;
 *     &lt;enumeration value="NETT"/&gt;
 *     &lt;enumeration value="OWNE"/&gt;
 *     &lt;enumeration value="OWNI"/&gt;
 *     &lt;enumeration value="PAIR"/&gt;
 *     &lt;enumeration value="PLAC"/&gt;
 *     &lt;enumeration value="PORT"/&gt;
 *     &lt;enumeration value="REAL"/&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="REPU"/&gt;
 *     &lt;enumeration value="RVPO"/&gt;
 *     &lt;enumeration value="SECB"/&gt;
 *     &lt;enumeration value="SECL"/&gt;
 *     &lt;enumeration value="SUBS"/&gt;
 *     &lt;enumeration value="TRAD"/&gt;
 *     &lt;enumeration value="TRPO"/&gt;
 *     &lt;enumeration value="TRVO"/&gt;
 *     &lt;enumeration value="TURN"/&gt;
 *     &lt;enumeration value="AUTO"/&gt;
 *     &lt;enumeration value="CLAI"/&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *     &lt;enumeration value="ETFT"/&gt;
 *     &lt;enumeration value="BIYI"/&gt;
 *     &lt;enumeration value="CONV"/&gt;
 *     &lt;enumeration value="ISSU"/&gt;
 *     &lt;enumeration value="MKDW"/&gt;
 *     &lt;enumeration value="MKUP"/&gt;
 *     &lt;enumeration value="NSYN"/&gt;
 *     &lt;enumeration value="REDI"/&gt;
 *     &lt;enumeration value="RELE"/&gt;
 *     &lt;enumeration value="SBBK"/&gt;
 *     &lt;enumeration value="SYND"/&gt;
 *     &lt;enumeration value="SWIF"/&gt;
 *     &lt;enumeration value="SWIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecuritiesTransactionType21Code")
@XmlEnum
public enum SecuritiesTransactionType21Code {


    /**
     * Relates to a collateral delivery/receipt to a national central bank for central bank credit operations.
     * 
     */
    CNCB,

    /**
     * Relates to a buy sell back transaction.
     * 
     */
    BSBK,

    /**
     * Relates to a collateral transaction, from the point of view of the collateral taker or its agent.
     * 
     */
    COLI,

    /**
     * Relates to a collateral transaction, from the point of view of the collateral giver or its agent.
     * 
     */
    COLO,

    /**
     * Relates to the netting of settlement instructions.
     * 
     */
    NETT,

    /**
     * Relates to an account transfer involving more than one instructing party (messages sender) and/or account servicer (messages receiver).
     * 
     */
    OWNE,

    /**
     * Relates to an account transfer involving one instructing party (messages sender) at one account servicer (messages receiver).
     * 
     */
    OWNI,

    /**
     * Relates to a pair-off: the transaction is paired off and netted against one or more previous transactions.
     * 
     */
    PAIR,

    /**
     * Relates to the placement/new issue of a financial instrument.
     * 
     */
    PLAC,

    /**
     * Relates to a portfolio move from one investment manager to another and/or from an account servicer to another. It is generally charged differently than another account transfer, hence the need to identify this type of transfer as such.
     * 
     */
    PORT,

    /**
     * Relates to a realignment of positions.
     * 
     */
    REAL,

    /**
     * Relates to a redemption of funds (funds industry only).
     * 
     */
    REDM,

    /**
     * Relates to a repurchase agreement transaction.
     * 
     */
    REPU,

    /**
     * Relates to a reverse repurchase agreement transaction.
     * 
     */
    RVPO,

    /**
     * Relates to a securities borrowing operation.
     * 
     */
    SECB,

    /**
     * Relates to a securities lending operation.
     * 
     */
    SECL,

    /**
     * Relates to a subscription to funds (funds industry only).
     * 
     */
    SUBS,

    /**
     * Relates to the settlement of a trade.
     * 
     */
    TRAD,

    /**
     * Relates to a triparty repurchase agreement.
     * 
     */
    TRPO,

    /**
     * Relates to a triparty reverse repurchase agreement.
     * 
     */
    TRVO,

    /**
     * Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.
     * 
     */
    TURN,

    /**
     * Relates to an auto-collateralisation movement.
     * 
     */
    AUTO,

    /**
     * Relates to a market claim.
     * 
     */
    CLAI,

    /**
     * Relates to a corporate action.
     * 
     */
    CORP,

    /**
     * Relates to an ETF creation or redemption.
     * 
     */
    ETFT,

    /**
     * Transaction relates to a buy-in by the market following a delivery transaction failure.
     * 
     */
    BIYI,

    /**
     * Relates to a depository receipt conversion.
     * 
     */
    CONV,

    /**
     * Relates to the issuance of a security such as an equity or a depositary receipt.
     * 
     */
    ISSU,

    /**
     * Relates to the decrease of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corp. event realigned).
     * 
     */
    MKDW,

    /**
     * Relates to the increase of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corporate event realigned).
     * 
     */
    MKUP,

    /**
     * Relates to the issue of medium and short term paper (CP, CD, MTN, notes ...) under a program and without syndication arrangement.
     * 
     */
    NSYN,

    /**
     * Relates to the withdrawal of specified amounts from specified subaccounts.
     * 
     */
    REDI,

    /**
     * Relates to a release (into/from local) of depository receipt operation.
     * 
     */
    RELE,

    /**
     * Relates to a sell buy back transaction.
     * 
     */
    SBBK,

    /**
     * Relates to the issue of financial instruments through a syndicate of underwriters and a lead manager.
     * 
     */
    SYND,

    /**
     * Transaction is a change of an investment from one sub-fund to another sub-fund (redemption-leg).
     * 
     */
    SWIF,

    /**
     * Transaction is a change of an investment from one sub-fund to another sub-fund (subscription-leg).
     * 
     */
    SWIT;

    public String value() {
        return name();
    }

    public static SecuritiesTransactionType21Code fromValue(String v) {
        return valueOf(v);
    }

}
