
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesBalanceType12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BLOK"/&gt;
 *     &lt;enumeration value="AWAS"/&gt;
 *     &lt;enumeration value="BLCA"/&gt;
 *     &lt;enumeration value="BLOT"/&gt;
 *     &lt;enumeration value="BLOV"/&gt;
 *     &lt;enumeration value="BORR"/&gt;
 *     &lt;enumeration value="BODE"/&gt;
 *     &lt;enumeration value="BORE"/&gt;
 *     &lt;enumeration value="COLI"/&gt;
 *     &lt;enumeration value="COLO"/&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="LODE"/&gt;
 *     &lt;enumeration value="LORE"/&gt;
 *     &lt;enumeration value="MARG"/&gt;
 *     &lt;enumeration value="PECA"/&gt;
 *     &lt;enumeration value="PEDA"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="PENR"/&gt;
 *     &lt;enumeration value="PLED"/&gt;
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
@XmlType(name = "SecuritiesBalanceType12Code")
@XmlEnum
public enum SecuritiesBalanceType12Code {


    /**
     * Balance of financial instruments that are blocked.
     * 
     */
    BLOK,

    /**
     * Balance of financial instruments that are freely available with no specific additional status.
     * 
     */
    AWAS,

    /**
     * Balance of financial instrument blocked following a corporate action, including proxy activities.
     * 
     */
    BLCA,

    /**
     * Balance of financial instruments that are blocked for trading.
     * 
     */
    BLOT,

    /**
     * Balance of financial instruments that are blocked for verification of authenticity.
     * 
     */
    BLOV,

    /**
     * Balance of financial instruments that have been borrowed from another party.
     * 
     */
    BORR,

    /**
     * Balance of financial instruments that are pending delivery in relation to a borrow transaction.
     * 
     */
    BODE,

    /**
     * Balance of financial instruments that are pending receipt in relation to a borrow transaction.
     * 
     */
    BORE,

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
     * Loan for consumption.
     * 
     */
    LOAN,

    /**
     * Balance of financial instruments that are pending delivery in relation to a lending transaction.
     * 
     */
    LODE,

    /**
     * Balance of financial instruments that are pending receipt in relation to a lending transaction.
     * 
     */
    LORE,

    /**
     * Account is used when financing is by the broker/dealer.
     * 
     */
    MARG,

    /**
     * Balance of financial instrument pending receipt following a corporate action.
     * 
     */
    PECA,

    /**
     * Balance of financial instrument pending delivery following a corporate action.
     * 
     */
    PEDA,

    /**
     * Processing has not been completed.
     * 
     */
    PEND,

    /**
     * The instruction is pending receipt of securities, for example, from a purchase, loan etc.
     * 
     */
    PENR,

    /**
     * Balance of securities that belong to and is kept in the safekeeping account indicated within this message, and that are pledged.
     * 
     */
    PLED,

    /**
     * Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).
     * 
     */
    REGO,

    /**
     * Balance of financial instruments that may only be sold under certain conditions or require legal documents.
     * 
     */
    RSTR,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Transaction has been generated due to transformation following a corporate action.
     * 
     */
    TRAN,

    /**
     * Settlement transactions relates to drawn securities.
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

    public static SecuritiesBalanceType12Code fromValue(String v) {
        return valueOf(v);
    }

}
