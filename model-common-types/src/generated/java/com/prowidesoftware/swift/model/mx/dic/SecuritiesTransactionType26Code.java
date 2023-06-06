
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionType26Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesTransactionType26Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BSBK"/>
 *     <enumeration value="COLI"/>
 *     <enumeration value="COLO"/>
 *     <enumeration value="MKDW"/>
 *     <enumeration value="MKUP"/>
 *     <enumeration value="NETT"/>
 *     <enumeration value="NSYN"/>
 *     <enumeration value="PAIR"/>
 *     <enumeration value="PLAC"/>
 *     <enumeration value="PORT"/>
 *     <enumeration value="REAL"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="REPU"/>
 *     <enumeration value="RODE"/>
 *     <enumeration value="RVPO"/>
 *     <enumeration value="SECB"/>
 *     <enumeration value="SECL"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="SYND"/>
 *     <enumeration value="TBAC"/>
 *     <enumeration value="TRAD"/>
 *     <enumeration value="TRPO"/>
 *     <enumeration value="TRVO"/>
 *     <enumeration value="TURN"/>
 *     <enumeration value="BYIY"/>
 *     <enumeration value="CNCB"/>
 *     <enumeration value="OWNE"/>
 *     <enumeration value="FCTA"/>
 *     <enumeration value="OWNI"/>
 *     <enumeration value="RELE"/>
 *     <enumeration value="SBRE"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="CLAI"/>
 *     <enumeration value="AUTO"/>
 *     <enumeration value="SWIF"/>
 *     <enumeration value="SWIT"/>
 *     <enumeration value="CONV"/>
 *     <enumeration value="ETFT"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="SLRE"/>
 *     <enumeration value="INSP"/>
 *     <enumeration value="SBBK"/>
 *     <enumeration value="REDI"/>
 *     <enumeration value="REBL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesTransactionType26Code")
@XmlEnum
public enum SecuritiesTransactionType26Code {


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
     * Relates to the decrease of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceeds of corporate event realigned).
     * 
     */
    MKDW,

    /**
     * Relates to the increase of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceeds of corporate event realigned).
     * 
     */
    MKUP,

    /**
     * Relates to the netting of settlement instructions.
     * 
     */
    NETT,

    /**
     * Relates to the issue of medium and short term paper (CP, CD, MTN, notes) under a program and without syndication arrangement.
     * 
     */
    NSYN,

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
     * Relates to the return of financial instruments resulting from a rejected delivery without a matching operation.
     * 
     */
    RODE,

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
     * Relates to the issue of financial instruments through a syndicate of underwriters and a lead manager.
     * 
     */
    SYND,

    /**
     * Relates to a To Be Announced (TBA) closing trade.
     * 
     */
    TBAC,

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
     * Relates to a buy-in by the market following a delivery transaction failure.
     * 
     */
    BYIY,

    /**
     * Relates to a collateral delivery/receipt to a national central bank for central bank credit operations.
     * 
     */
    CNCB,

    /**
     * Relates to an account transfer involving more than one instructing party (message sender) and/or account servicer (messages receiver).
     * 
     */
    OWNE,

    /**
     * Relates to a factor update.
     * 
     */
    FCTA,

    /**
     * Relates to an account transfer involving one instructing party (message sender) at one account servicer (messages receiver).
     * 
     */
    OWNI,

    /**
     * Relates to a release (into/from local) of depository receipt operation.
     * 
     */
    RELE,

    /**
     * Internal reallocation of a borrowed holding from one safekeeping account to another.
     * 
     */
    SBRE,

    /**
     * Relates to a corporate action.
     * 
     */
    CORP,

    /**
     * Relates to a market claim.
     * 
     */
    CLAI,

    /**
     * Relates to an auto-collateralisation movement.
     * 
     */
    AUTO,

    /**
     * Transaction is a change of an investment from one sub-fund to another sub-fund (redemption-leg).
     * 
     */
    SWIF,

    /**
     * Transaction is a change of an investment from one sub-fund to another sub-fund (subscription-leg).
     * 
     */
    SWIT,

    /**
     * Relates to a depository receipt conversion.
     * 
     */
    CONV,

    /**
     * Relates to an ETF creation or redemption.
     * 
     */
    ETFT,

    /**
     * Relates to the issuance of a security such as an equity or a depositary receipt.
     * 
     */
    ISSU,

    /**
     * Internal reallocation of a holding on loan from one safekeeping account to another.
     * 
     */
    SLRE,

    /**
     * Relates to a movement of shares into or out of a pooled account.
     * 
     */
    INSP,

    /**
     * Relates to a sell buy back transaction.
     * 
     */
    SBBK,

    /**
     * Relates to the withdrawal of specified amounts from specified subaccounts.
     * 
     */
    REDI,

    /**
     * Relates to a rebalanced transaction.
     * 
     */
    REBL;

    public String value() {
        return name();
    }

    public static SecuritiesTransactionType26Code fromValue(String v) {
        return valueOf(v);
    }

}
