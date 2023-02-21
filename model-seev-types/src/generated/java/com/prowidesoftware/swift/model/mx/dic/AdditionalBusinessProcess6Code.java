
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalBusinessProcess6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalBusinessProcess6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLAI"/&gt;
 *     &lt;enumeration value="REVR"/&gt;
 *     &lt;enumeration value="TAXR"/&gt;
 *     &lt;enumeration value="PPUT"/&gt;
 *     &lt;enumeration value="PPRE"/&gt;
 *     &lt;enumeration value="FPRE"/&gt;
 *     &lt;enumeration value="REAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdditionalBusinessProcess6Code")
@XmlEnum
public enum AdditionalBusinessProcess6Code {


    /**
     * Relates to a claim on the associated corporate action event.
     * 
     */
    CLAI,

    /**
     * Indicates a preadvice of movement reversal.
     * 
     */
    REVR,

    /**
     * Relates to a tax refund from the authorities on the associated corporate action event.
     * 
     */
    TAXR,

    /**
     * Partial mandatory exchange of a portion of bonds where the exchanged securities are usually remarketed. The issuer may offer holders the right to retain instead of exchanging their securities. A lottery will be used to determine eligibility for the event.
     * 
     */
    PPUT,

    /**
     * Partial pre-funding of a debt instrument prior to maturity drawn through a lottery process. One new security is issued with an earlier maturity date for the refunded (called portion) and the other new security is issued with the original maturity date for the non refunded (remaining) portion. Applicable only in the frame of a partial defeasance corporate action event.
     * 
     */
    PPRE,

    /**
     * Full pre-funding of a debt instrument by the issuer prior to original maturity when the issuer deposits assets in trust. Applicable only in the frame of a partial defeasance corporate action event.
     * 
     */
    FPRE,

    /**
     * Proceeds / entitlements of the mandatory event can only be paid if specified action is taken by the account owner.
     * 
     */
    REAC;

    public String value() {
        return name();
    }

    public static AdditionalBusinessProcess6Code fromValue(String v) {
        return valueOf(v);
    }

}
