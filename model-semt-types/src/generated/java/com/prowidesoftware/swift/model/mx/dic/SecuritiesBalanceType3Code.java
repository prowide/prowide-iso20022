
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesBalanceType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOK"/>
 *     <enumeration value="BORR"/>
 *     <enumeration value="COLI"/>
 *     <enumeration value="COLO"/>
 *     <enumeration value="LOAN"/>
 *     <enumeration value="MARG"/>
 *     <enumeration value="PDMT"/>
 *     <enumeration value="PRMT"/>
 *     <enumeration value="PRUM"/>
 *     <enumeration value="PECA"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="PLED"/>
 *     <enumeration value="PDUM"/>
 *     <enumeration value="REGO"/>
 *     <enumeration value="RSTR"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="DRAW"/>
 *     <enumeration value="WDOC"/>
 *     <enumeration value="BTRA"/>
 *     <enumeration value="SPCM"/>
 *     <enumeration value="HOLD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType3Code")
@XmlEnum
public enum SecuritiesBalanceType3Code {


    /**
     * Balance of securities that are blocked or frozen. A financial instrument may be unavailable due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy.
     * 
     */
    BLOK,

    /**
     * Balance of securities that have been borrowed from another party.
     * 
     */
    BORR,

    /**
     * Balance of securities that belong to a third party and that are held for the purpose of collateralisation.
     * 
     */
    COLI,

    /**
     * Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.
     * 
     */
    COLO,

    /**
     * Balance of securities that have been loaned to a third party.
     * 
     */
    LOAN,

    /**
     * Balance of securities that are used as collateral for derivatives.
     * 
     */
    MARG,

    /**
     * Balance of securities pending delivery that have been matched. This is only applicable in a CSD to participant communication.
     * 
     */
    PDMT,

    /**
     * Balance of securities pending receipt that have been matched. This is only applicable in a CSD to participant communication.
     * 
     */
    PRMT,

    /**
     * Balance of securities pending receipt that are unmatched. This is only applicable in a CSD to participant communication.
     * 
     */
    PRUM,

    /**
     * Balance of securities, before ex-date, that are involved in a corporate action (CA). Securities blocked due to a CA, for example, proxi, in escrow, are to be identified in the BLOK sub-balance.
     * 
     */
    PECA,

    /**
     * Balance of securities that are pending delivery.
     * 
     */
    PEND,

    /**
     * Balance of securities that are pending receipt.
     * 
     */
    PENR,

    /**
     * Balance of securities that are pledged, for example, a financial instrument is unavailable because it has been used or given as a guarantee.
     * 
     */
    PLED,

    /**
     * Balance of securities pending delivery that are unmatched. This is only applicable in a CSD to participant communication.
     * 
     */
    PDUM,

    /**
     * Balance of securities currently being processed by the institution responsible for registering the new beneficial owner (or nominee) of securities after a transaction has settled.
     * 
     */
    REGO,

    /**
     * Balance of securities that may only be sold under certain conditions or require legal documents.
     * 
     */
    RSTR,

    /**
     * Balance of securities that is unclassified, ie, is not identified with one of the existing sub-balance types.
     * 
     */
    OTHR,

    /**
     * Balance of physical securities that are in transshipment, eg, in the process of being transferred from one depository or agent to another.
     * 
     */
    TRAN,

    /**
     * Balance of securities that are drawn for redemption.
     * 
     */
    DRAW,

    /**
     * Financial instrument is unavailable due to missing or incomplete documentation pertaining to the account, or due to a missing or incomplete order.
     * 
     */
    WDOC,

    /**
     * Financial instrument is unavailable as a result of a transfer order, pending movement in the shareholders' register.
     * 
     */
    BTRA,

    /**
     * Investment fund order contains a side pocket component.
     * 
     */
    SPCM,

    /**
     * Investment fund order execution subject to redemption proceeds.
     * 
     */
    HOLD;

    public String value() {
        return name();
    }

    public static SecuritiesBalanceType3Code fromValue(String v) {
        return valueOf(v);
    }

}
