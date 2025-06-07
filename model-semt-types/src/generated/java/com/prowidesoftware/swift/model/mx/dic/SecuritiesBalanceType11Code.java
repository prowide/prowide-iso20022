
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesBalanceType11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BLOK"/&gt;
 *     &lt;enumeration value="AWAS"/&gt;
 *     &lt;enumeration value="AVAI"/&gt;
 *     &lt;enumeration value="BLCA"/&gt;
 *     &lt;enumeration value="BLOT"/&gt;
 *     &lt;enumeration value="BLOV"/&gt;
 *     &lt;enumeration value="BORR"/&gt;
 *     &lt;enumeration value="COLI"/&gt;
 *     &lt;enumeration value="COLO"/&gt;
 *     &lt;enumeration value="COLA"/&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="MARG"/&gt;
 *     &lt;enumeration value="PECA"/&gt;
 *     &lt;enumeration value="PEDA"/&gt;
 *     &lt;enumeration value="PLED"/&gt;
 *     &lt;enumeration value="REGO"/&gt;
 *     &lt;enumeration value="RSTR"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="DRAW"/&gt;
 *     &lt;enumeration value="CLEN"/&gt;
 *     &lt;enumeration value="DIRT"/&gt;
 *     &lt;enumeration value="NOMI"/&gt;
 *     &lt;enumeration value="SPOS"/&gt;
 *     &lt;enumeration value="UNRG"/&gt;
 *     &lt;enumeration value="ISSU"/&gt;
 *     &lt;enumeration value="QUAS"/&gt;
 *     &lt;enumeration value="LODE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType11Code")
@XmlEnum
public enum SecuritiesBalanceType11Code {


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
     * Balance of financial instruments that are available.
     * 
     */
    AVAI,

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
     * Balance of securities that are eligible for use for collateral purposes.
     * 
     */
    COLA,

    /**
     * Loan for consumption.
     * 
     */
    LOAN,

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
     * Tax-exempt financial instruments are to be settled.
     * 
     */
    CLEN,

    /**
     * Taxable financial instruments are to be settled.
     * 
     */
    DIRT,

    /**
     * Balance of financial instruments that are registered (in nominee name or in the name of the beneficial owner).
     * 
     */
    NOMI,

    /**
     * Balance of financial instruments that remain registered in the name of the prior beneficial owner.
     * 
     */
    SPOS,

    /**
     * Balance of securities that could not be registered due to foreign ownership limitation.
     * 
     */
    UNRG,

    /**
     * In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has been received.
     * 
     */
    ISSU,

    /**
     * In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has not yet been received.
     * 
     */
    QUAS,

    /**
     * Balance of financial instruments that are pending delivery in relation to a lending transaction.
     * 
     */
    LODE;

    public String value() {
        return name();
    }

    public static SecuritiesBalanceType11Code fromValue(String v) {
        return valueOf(v);
    }

}
