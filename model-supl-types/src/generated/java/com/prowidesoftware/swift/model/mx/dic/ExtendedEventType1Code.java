
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedEventType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtendedEventType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RPLA"/&gt;
 *     &lt;enumeration value="TMTN"/&gt;
 *     &lt;enumeration value="BRIS"/&gt;
 *     &lt;enumeration value="FLPR"/&gt;
 *     &lt;enumeration value="PDEF"/&gt;
 *     &lt;enumeration value="PPRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExtendedEventType1Code")
@XmlEnum
public enum ExtendedEventType1Code {


    /**
     * General information provided by the issuer that should not result in material changes to the security.
     * 
     */
    RPLA,

    /**
     * Security, usually a form of a derivative, for which the agent or issuer has decided to terminate the derivative based on a change to the underlying security(ies) or a change in strategy. Distinguishes from Mandatory Exchange, Exchange Offer event types mapped to the same ISO event type code.
     * 
     */
    TMTN,

    /**
     * Security holders are issued additional securities, free of payment, from the issuer in proportion to their holdings. A bonus issue is typically represented by shares or warrants. Nominal value does not change. The security holder may be offered choice of entitlement. Distinguishes from Rights Subscription, Sale Of Rights event types mapped to the same ISO event type code.
     * 
     */
    BRIS,

    /**
     * Exercise of a privilege by the issuer to repay, in full, any debt security prior to maturity when the issuer deposits assets in trust. This irrevocably restricts their use to satisfaction of the debt. Distinguishes from "partial defeasance", "partial prerefunding" event types mapped to the same ISO event type code.
     * 
     */
    FLPR,

    /**
     * Issuer sets aside cash in escrow to pay off a portion of the issue before the maturity date. New securities are issued for the portion defeased. Distinguishes from "full prerefunding", "partial prerefunding" event types mapped to the same ISO event type code.
     * 
     */
    PDEF,

    /**
     * Similar to a Full Prerefunding, a partial prerefunding is the exercise of a privilege by the issuer to repay, in part, any debt security prior to maturity when the issuer deposits assets in trust. This irrevocably restricts their use to satisfaction of the debt. New securities are issued for the portion prerefunded. Distinguishes from "full prerefunding", "partial defeasance" event types mapped to the same ISO event type code.
     * 
     */
    PPRE;

    public String value() {
        return name();
    }

    public static ExtendedEventType1Code fromValue(String v) {
        return valueOf(v);
    }

}
