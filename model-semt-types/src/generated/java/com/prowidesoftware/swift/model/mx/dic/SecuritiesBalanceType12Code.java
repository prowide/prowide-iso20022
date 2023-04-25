
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesBalanceType12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOK"/>
 *     <enumeration value="AWAS"/>
 *     <enumeration value="BLCA"/>
 *     <enumeration value="BLOT"/>
 *     <enumeration value="BLOV"/>
 *     <enumeration value="BORR"/>
 *     <enumeration value="BODE"/>
 *     <enumeration value="BORE"/>
 *     <enumeration value="COLI"/>
 *     <enumeration value="COLO"/>
 *     <enumeration value="LOAN"/>
 *     <enumeration value="LODE"/>
 *     <enumeration value="LORE"/>
 *     <enumeration value="MARG"/>
 *     <enumeration value="PECA"/>
 *     <enumeration value="PEDA"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="PLED"/>
 *     <enumeration value="REGO"/>
 *     <enumeration value="RSTR"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="DRAW"/>
 *     <enumeration value="WDOC"/>
 *     <enumeration value="BTRA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
