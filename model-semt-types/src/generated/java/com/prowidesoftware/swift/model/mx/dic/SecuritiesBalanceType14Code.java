
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesBalanceType14Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AWAS"/&gt;
 *     &lt;enumeration value="BTRA"/&gt;
 *     &lt;enumeration value="BLOK"/&gt;
 *     &lt;enumeration value="BLOV"/&gt;
 *     &lt;enumeration value="BLCA"/&gt;
 *     &lt;enumeration value="BLOT"/&gt;
 *     &lt;enumeration value="BORR"/&gt;
 *     &lt;enumeration value="OPNT"/&gt;
 *     &lt;enumeration value="PNET"/&gt;
 *     &lt;enumeration value="COLI"/&gt;
 *     &lt;enumeration value="COLO"/&gt;
 *     &lt;enumeration value="MARG"/&gt;
 *     &lt;enumeration value="DRAW"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="REGO"/&gt;
 *     &lt;enumeration value="BODE"/&gt;
 *     &lt;enumeration value="BORE"/&gt;
 *     &lt;enumeration value="PEDA"/&gt;
 *     &lt;enumeration value="PECA"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="LODE"/&gt;
 *     &lt;enumeration value="LORE"/&gt;
 *     &lt;enumeration value="PENR"/&gt;
 *     &lt;enumeration value="PLED"/&gt;
 *     &lt;enumeration value="RSTR"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="WDOC"/&gt;
 *     &lt;enumeration value="GRP1"/&gt;
 *     &lt;enumeration value="GRP2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType14Code")
@XmlEnum
public enum SecuritiesBalanceType14Code {


    /**
     * Balance of financial instruments that are freely available with no specific additional status.
     * 
     */
    AWAS("AWAS"),

    /**
     * Financial instrument is unavailable as a result of a transfer order, pending movement in the shareholders' register.
     * 
     */
    BTRA("BTRA"),

    /**
     * Balance of financial instruments that are blocked.
     * 
     */
    BLOK("BLOK"),

    /**
     * Balance of financial instruments that are blocked for verification of authenticity.
     * 
     */
    BLOV("BLOV"),

    /**
     * Balance of financial instrument blocked following a corporate action, including proxy activities.
     * 
     */
    BLCA("BLCA"),

    /**
     * Balance of financial instruments that are blocked for trading.
     * 
     */
    BLOT("BLOT"),

    /**
     * Balance of financial instruments that have been borrowed from another party.
     * 
     */
    BORR("BORR"),

    /**
     * Net balance of financial instrument that is traded pending settlement and settlement is overdue.
     * 
     */
    OPNT("OPNT"),

    /**
     * Net balance of financial instrument that is traded pending settlement.
     * 
     */
    PNET("PNET"),

    /**
     * Balance of securities that belong to a third party and that are held for the purpose of collateralisation.
     * 
     */
    COLI("COLI"),

    /**
     * Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.
     * 
     */
    COLO("COLO"),

    /**
     * Account is used when financing is by the broker/dealer.
     * 
     */
    MARG("MARG"),

    /**
     * Settlement transactions relates to drawn securities.
     * 
     */
    DRAW("DRAW"),

    /**
     * Transaction has been generated due to transformation following a corporate action.
     * 
     */
    TRAN("TRAN"),

    /**
     * Loan for consumption.
     * 
     */
    LOAN("LOAN"),

    /**
     * Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).
     * 
     */
    REGO("REGO"),

    /**
     * Balance of financial instruments that are pending delivery in relation to a borrow transaction.
     * 
     */
    BODE("BODE"),

    /**
     * Balance of financial instruments that are pending receipt in relation to a borrow transaction.
     * 
     */
    BORE("BORE"),

    /**
     * Balance of financial instrument pending delivery following a corporate action.
     * 
     */
    PEDA("PEDA"),

    /**
     * Balance of financial instrument pending receipt following a corporate action.
     * 
     */
    PECA("PECA"),

    /**
     * Processing has not been completed.
     * 
     */
    PEND("PEND"),

    /**
     * Balance of financial instruments that are pending delivery in relation to a lending transaction.
     * 
     */
    LODE("LODE"),

    /**
     * Balance of financial instruments that are pending receipt in relation to a lending transaction.
     * 
     */
    LORE("LORE"),

    /**
     * The instruction is pending receipt of securities, for example, from a purchase, loan etc.
     * 
     */
    PENR("PENR"),

    /**
     * Balance of securities that belong to and is kept in the safekeeping account indicated within this message, and that are pledged.
     * 
     */
    PLED("PLED"),

    /**
     * Balance of financial instruments that may only be sold under certain conditions or require legal documents.
     * 
     */
    RSTR("RSTR"),

    /**
     * Other. See Narrative.
     * 
     */
    OTHR("OTHR"),

    /**
     * Financial instrument is unavailable due to missing or incomplete documentation pertaining to the account, or due to a missing or incomplete order.
     * 
     */
    WDOC("WDOC"),

    /**
     * Purchased investment fund units that were purchased prior to the last ex-div date.
     * 
     * 
     */
    @XmlEnumValue("GRP1")
    GRP_1("GRP1"),

    /**
     * Purchased investment fund units that were purchased since the ex-div date, and that benefit from the tax exemption.
     * 
     */
    @XmlEnumValue("GRP2")
    GRP_2("GRP2");
    private final String value;

    SecuritiesBalanceType14Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecuritiesBalanceType14Code fromValue(String v) {
        for (SecuritiesBalanceType14Code c: SecuritiesBalanceType14Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
