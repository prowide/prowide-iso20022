
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionOption8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionOption8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABST"/&gt;
 *     &lt;enumeration value="AMGT"/&gt;
 *     &lt;enumeration value="BSPL"/&gt;
 *     &lt;enumeration value="BUYA"/&gt;
 *     &lt;enumeration value="CASE"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CEXC"/&gt;
 *     &lt;enumeration value="CONN"/&gt;
 *     &lt;enumeration value="CONY"/&gt;
 *     &lt;enumeration value="CTEN"/&gt;
 *     &lt;enumeration value="EXER"/&gt;
 *     &lt;enumeration value="LAPS"/&gt;
 *     &lt;enumeration value="MKDW"/&gt;
 *     &lt;enumeration value="MKUP"/&gt;
 *     &lt;enumeration value="MNGT"/&gt;
 *     &lt;enumeration value="MPUT"/&gt;
 *     &lt;enumeration value="NOAC"/&gt;
 *     &lt;enumeration value="NOQU"/&gt;
 *     &lt;enumeration value="OFFR"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="OVER"/&gt;
 *     &lt;enumeration value="PROX"/&gt;
 *     &lt;enumeration value="QINV"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="SLLE"/&gt;
 *     &lt;enumeration value="SPLI"/&gt;
 *     &lt;enumeration value="PRUN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionOption8Code")
@XmlEnum
public enum CorporateActionOption8Code {


    /**
     * Vote expressed as abstain. In this case, the issuing company will add the number of shares to the quorum of the meeting.
     * If the voting right is not executed, it will not be added to the quorum. In this case, code NOAC should be used.
     * 
     */
    ABST,

    /**
     * Vote against management.
     * 
     */
    AMGT,

    /**
     * Receive equities from the share premium reserve of the company and considered as a capital distribution rather than a disbursement of income with different tax implications (typically found in Australia).
     * 
     */
    BSPL,

    /**
     * Buy additional securities to round up position.
     * 
     */
    BUYA,

    /**
     * Option to choose between different security and cash options.
     * 
     */
    CASE,

    /**
     * Option to choose cash.
     * 
     */
    CASH,

    /**
     * Vote to consent to change the terms of the securities agreement and to exchange securities.
     * 
     */
    CEXC,

    /**
     * Vote not to approve the event or proposal.
     * 
     */
    CONN,

    /**
     * Vote to approve the event or proposal.
     * 
     */
    CONY,

    /**
     * Vote to consent to change the terms of the securities agreement and to tender securities for cash.
     * 
     */
    CTEN,

    /**
     * Exercise intermediate securities or warrants.
     * 
     */
    EXER,

    /**
     * Allow event or entitled security to expire.
     * 
     */
    LAPS,

    /**
     * Mark down the global certificate as a result of a corporate action (instruction from International Central Securities Depositories (ICSDs) to common depositories who are holding the global certificate on behalf of the International Central Securities Depositories (ICSDs)).
     * 
     */
    MKDW,

    /**
     * Mark up the global certificate as a result of a corporate action (instruction from International Central Securities Depositories (ICSDs) to common depositories who are holding the global certificate on behalf of the International Central Securities Depositories (ICSDs)).
     * 
     */
    MKUP,

    /**
     * Vote with management.
     * 
     */
    MNGT,

    /**
     * Option that allows a holder to elect to retain their holding, for example, a putable bond.
     * 
     */
    MPUT,

    /**
     * Option for the account owner not to take part in the event. This would include opt-out for class actions and lodging of dissenters' rights.
     * 
     */
    NOAC,

    /**
     * Account owner is a non-qualified investor.
     * 
     */
    NOQU,

    /**
     * In a remarketing of variable notes, the margin that shareholders can propose in respect of the next interest period.
     * 
     */
    OFFR,

    /**
     * Generic corporate action option to be used in case that no other specific code is appropriate.
     * 
     */
    OTHR,

    /**
     * Subscribe to more equities than underlying securities position allows.
     * 
     */
    OVER,

    /**
     * Issue a proxy card in case of voting.
     * 
     */
    PROX,

    /**
     * Account owner is a qualified investor.
     * 
     */
    QINV,

    /**
     * Distribution of securities to holders.
     * 
     */
    SECU,

    /**
     * Sell the intermediate securities.
     * 
     */
    SLLE,

    /**
     * Option to give a split instruction, for example, a split voting instruction on a meeting.
     * 
     */
    SPLI,

    /**
     * Proceeds not known during election period. The option can result in cash and/or securities.
     * 
     */
    PRUN;

    public String value() {
        return name();
    }

    public static CorporateActionOption8Code fromValue(String v) {
        return valueOf(v);
    }

}
