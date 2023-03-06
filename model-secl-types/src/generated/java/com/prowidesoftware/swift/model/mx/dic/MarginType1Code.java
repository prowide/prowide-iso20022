
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarginType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SEMA"/&gt;
 *     &lt;enumeration value="ADFM"/&gt;
 *     &lt;enumeration value="SCMA"/&gt;
 *     &lt;enumeration value="COMA"/&gt;
 *     &lt;enumeration value="UFMA"/&gt;
 *     &lt;enumeration value="CEMA"/&gt;
 *     &lt;enumeration value="INDE"/&gt;
 *     &lt;enumeration value="NEMA"/&gt;
 *     &lt;enumeration value="INMA"/&gt;
 *     &lt;enumeration value="VAMA"/&gt;
 *     &lt;enumeration value="INCA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarginType1Code")
@XmlEnum
public enum MarginType1Code {


    /**
     * Margin required to cover the risk of non settlement of the underlying. Also used to cover the risk linked to the non settlement on payment platforms (for example TARGET2 vs CLS).
     * 
     */
    SEMA,

    /**
     * Additional margin required to cover the daily risk encountered by the central counterparty before the clearing member is actually called to cover the default fund. Indeed, central counterparty calculates the margin on the default fund on a daily basis but only calls the clearing member at the end of the month.
     * 
     */
    ADFM,

    /**
     * Margin required to cover the concentration risk linked to the default of the seller of the "protection" (for example CDS seller).
     * 
     */
    SCMA,

    /**
     * Margin required to cover the non payment of the monthly premium (for credit derivatives).
     * 
     */
    COMA,

    /**
     * Margin required to cover the non payment of the upfront premium (for credit derivatives).
     * 
     */
    UFMA,

    /**
     * Margin required to cover the risk of any event linked to the underlying (for example the payment default by the issuer of a debt).
     * 
     */
    CEMA,

    /**
     * Margin required to enable a member to start trading on a specific market where high risks and amounts are involved.
     * 
     */
    INDE,

    /**
     * Margin calculated on the same basis as for the variation margin but the margin is kept by the central counterparty and not "paid " to the other clearing member.
     * 
     */
    NEMA,

    /**
     * Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the central counterparty.
     * 
     */
    INMA,

    /**
     * Margin required to cover the risk linked to the price fluctuations occurred on the unsettled exposures towards central counterparty.
     * 
     */
    VAMA,

    /**
     * Additional margin required to cover a risk increase (expressed in the reporting currency). This results from a risk management decision depending on central counterparty specific criteria.
     * 
     */
    INCA;

    public String value() {
        return name();
    }

    public static MarginType1Code fromValue(String v) {
        return valueOf(v);
    }

}
