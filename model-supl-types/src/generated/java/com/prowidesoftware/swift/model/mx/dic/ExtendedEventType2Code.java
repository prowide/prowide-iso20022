
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedEventType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtendedEventType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BRIS"/&gt;
 *     &lt;enumeration value="FLPR"/&gt;
 *     &lt;enumeration value="PDEF"/&gt;
 *     &lt;enumeration value="PPUT"/&gt;
 *     &lt;enumeration value="PPRE"/&gt;
 *     &lt;enumeration value="RPLA"/&gt;
 *     &lt;enumeration value="TMTN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExtendedEventType2Code")
@XmlEnum
public enum ExtendedEventType2Code {


    /**
     * Security holders are issued additional securities, free of payment, from the issuer in proportion to their holdings. A bonus issue is typically represented by shares or warrants. Nominal value does not change. The security holder may be offered choice of entitlement. Distinguishes from  Rights Subscription, Sale Of Rights event types mapped to the same ISO event type code.
     * 
     */
    BRIS,

    /**
     * Exercise of a privilege by the issuer to repay, in full, any debt security prior to maturity when the issuer deposits assets in trust. This irrevocably restricts their use to satisfaction of the debt. Distinguishes from  "partial defeasance", "partial prerefunding" event types mapped to the same ISO event type code.
     * 
     */
    FLPR,

    /**
     * Issuer sets aside funds in escrow to guarantee payment for the portion of the security on maturity date. Defeased and Non-defeased cusips are issued respectively for the defeased and non-defeased portions.
     * 
     */
    PDEF,

    /**
     * The mandatory exchange of a portion of bonds where the exchanged securities are usually remarketed. The issuer may offer holders the right to retain instead of exchanging their securities.
     * 
     */
    PPUT,

    /**
     * Issuer sets aside funds in escrow to guarantee payment for the portion of the security prior to maturity date. Refunded and Non-Refunded cusips are issued respectively for the refunded and non-refunded portions.
     * 
     */
    PPRE,

    /**
     * General information provided by the issuer that should not result in material changes to the security.
     * 
     */
    RPLA,

    /**
     * Security, usually a form of a derivative, for which the agent or issuer has decided to terminate the derivative based on a change to the underlying security(ies) or a change in strategy. Distinguishes from  Mandatory Exchange, Exchange Offer event types mapped to the same ISO event type code.
     * 
     */
    TMTN;

    public String value() {
        return name();
    }

    public static ExtendedEventType2Code fromValue(String v) {
        return valueOf(v);
    }

}
