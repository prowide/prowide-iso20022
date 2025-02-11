
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionOptionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionOptionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BSPL"/>
 *     <enumeration value="BUYA"/>
 *     <enumeration value="CASE"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="CEXC"/>
 *     <enumeration value="CTEN"/>
 *     <enumeration value="CONN"/>
 *     <enumeration value="CONY"/>
 *     <enumeration value="EXER"/>
 *     <enumeration value="LAPS"/>
 *     <enumeration value="MPUT"/>
 *     <enumeration value="NOAC"/>
 *     <enumeration value="OFFR"/>
 *     <enumeration value="OVER"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="SLLE"/>
 *     <enumeration value="SPLI"/>
 *     <enumeration value="NOQU"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="QINV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionOptionType1Code")
@XmlEnum
public enum CorporateActionOptionType1Code {


    /**
     * Receive shares issued from the Share Premium Reserve of the company and considered as a capital distribution rather than a disbursement of income, with different tax implications (typically found in Australia).
     * 
     */
    BSPL,

    /**
     * Buy additional securities to round up position.
     * 
     */
    BUYA,

    /**
     * Election choice includes a combination of both cash and securities.
     * 
     */
    CASE,

    /**
     * Distribution of cash.
     * 
     */
    CASH,

    /**
     * Vote to consent to change the terms of the securities agreement and to exchange securities.
     * 
     */
    CEXC,

    /**
     * Vote to consent to change the terms of the securities agreement and to tender securities for cash.
     * 
     */
    CTEN,

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
     * An option that allows a holder to elect to retain their holding, eg, a putable bond.
     * 
     */
    MPUT,

    /**
     * Option for the account owner not to take part in the event.
     * 
     */
    NOAC,

    /**
     * In a remarketing of variable notes, the margin that shareholders can propose in respect of the next interest period.
     * 
     */
    OFFR,

    /**
     * Subscribe to more equities than underlying securities position allows.
     * 
     */
    OVER,

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
     * Option to give a split instruction, eg, a split voting instruction on a meeting.
     * 
     */
    SPLI,

    /**
     * The account owner is a Non-Qualified Investor.
     * 
     */
    NOQU,

    /**
     * Generic corporate action option to be used in case that no other specific code is appropriate.
     * 
     */
    OTHR,

    /**
     * The account owner is a Qualified Investor.
     * 
     */
    QINV;

    public String value() {
        return name();
    }

    public static CorporateActionOptionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
