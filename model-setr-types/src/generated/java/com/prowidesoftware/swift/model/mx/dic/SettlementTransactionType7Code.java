
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTransactionType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementTransactionType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BSBK"/>
 *     <enumeration value="COLI"/>
 *     <enumeration value="COLO"/>
 *     <enumeration value="CONV"/>
 *     <enumeration value="FCTA"/>
 *     <enumeration value="INSP"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="MKDW"/>
 *     <enumeration value="MKUP"/>
 *     <enumeration value="NETT"/>
 *     <enumeration value="NSYN"/>
 *     <enumeration value="OWNE"/>
 *     <enumeration value="OWNI"/>
 *     <enumeration value="PAIR"/>
 *     <enumeration value="PLAC"/>
 *     <enumeration value="PORT"/>
 *     <enumeration value="REAL"/>
 *     <enumeration value="REDI"/>
 *     <enumeration value="RELE"/>
 *     <enumeration value="REPU"/>
 *     <enumeration value="RODE"/>
 *     <enumeration value="RPTO"/>
 *     <enumeration value="RVPO"/>
 *     <enumeration value="SBBK"/>
 *     <enumeration value="SECB"/>
 *     <enumeration value="SECL"/>
 *     <enumeration value="SYND"/>
 *     <enumeration value="TBAC"/>
 *     <enumeration value="TRAD"/>
 *     <enumeration value="TRPO"/>
 *     <enumeration value="TRVO"/>
 *     <enumeration value="TURN"/>
 *     <enumeration value="GUAR"/>
 *     <enumeration value="OFIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementTransactionType7Code")
@XmlEnum
public enum SettlementTransactionType7Code {


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
     * Relates to a depository receipt conversion.
     * 
     */
    CONV,

    /**
     * Relates to a factor update.
     * 
     */
    FCTA,

    /**
     * Relates to a movement of shares into or out of a pooled account.
     * 
     */
    INSP,

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
     * Relates to the netting of settlement instructions.
     * 
     */
    NETT,

    /**
     * Relates to the issue of medium and short term paper (CP, CD, MTN, notes.) under a program and without syndication arrangement.
     * 
     */
    NSYN,

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
     * Relates to a repurchase agreement transaction.
     * 
     */
    REPU,

    /**
     * Relates to the return of financial instruments resulting from a rejected delivery without matching operation.
     * 
     */
    RODE,

    /**
     * Relates to a transaction that is for reporting purposes only.
     * 
     */
    RPTO,

    /**
     * Relates to a reverse repurchase agreement transaction.
     * 
     */
    RVPO,

    /**
     * Relates to a sell buy back transaction.
     * 
     */
    SBBK,

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
     * Trade which is guaranteed to be finalized.
     * 
     */
    GUAR,

    /**
     * Offering issue trade.
     * 
     */
    OFIT;

    public String value() {
        return name();
    }

    public static SettlementTransactionType7Code fromValue(String v) {
        return valueOf(v);
    }

}
