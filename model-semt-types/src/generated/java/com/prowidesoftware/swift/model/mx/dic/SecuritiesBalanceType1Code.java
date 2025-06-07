
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesBalanceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BLOK"/&gt;
 *     &lt;enumeration value="BORR"/&gt;
 *     &lt;enumeration value="COLI"/&gt;
 *     &lt;enumeration value="COLO"/&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="MARG"/&gt;
 *     &lt;enumeration value="PDMT"/&gt;
 *     &lt;enumeration value="PRMT"/&gt;
 *     &lt;enumeration value="PRUM"/&gt;
 *     &lt;enumeration value="PECA"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="PENR"/&gt;
 *     &lt;enumeration value="PLED"/&gt;
 *     &lt;enumeration value="PDUM"/&gt;
 *     &lt;enumeration value="REGO"/&gt;
 *     &lt;enumeration value="RSTR"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="DRAW"/&gt;
 *     &lt;enumeration value="WDOC"/&gt;
 *     &lt;enumeration value="BTRA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType1Code")
@XmlEnum
public enum SecuritiesBalanceType1Code {


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
    BTRA;

    public String value() {
        return name();
    }

    public static SecuritiesBalanceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
