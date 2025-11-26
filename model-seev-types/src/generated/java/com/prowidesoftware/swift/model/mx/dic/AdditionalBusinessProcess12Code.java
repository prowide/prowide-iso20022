
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalBusinessProcess12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdditionalBusinessProcess12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLFT"/>
 *     <enumeration value="CLAI"/>
 *     <enumeration value="CLNT"/>
 *     <enumeration value="CLPT"/>
 *     <enumeration value="TAXR"/>
 *     <enumeration value="CONS"/>
 *     <enumeration value="FPRE"/>
 *     <enumeration value="INCP"/>
 *     <enumeration value="NPLE"/>
 *     <enumeration value="PPUT"/>
 *     <enumeration value="PPRE"/>
 *     <enumeration value="SCHM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdditionalBusinessProcess12Code")
@XmlEnum
public enum AdditionalBusinessProcess12Code {


    /**
     * Market Claim is to transfer proceeds received from the issuer to the entitled party.
     * 
     */
    CLFT,

    /**
     * Relates to a claim on the associated corporate action event.
     * 
     */
    CLAI,

    /**
     * Market Claim is to transfer proceeds partially received from the issuer to the entitled party. Part is compensated in cash by the party that failed to fulfil its obligation.
     * 
     */
    CLNT,

    /**
     * Market Claim is to compensate the entitled party in cash by the party that failed to fulfil its obligation. No proceeds have been received from the issuer.
     * 
     */
    CLPT,

    /**
     * Relates to a tax refund from the authorities on the associated corporate action event.
     * 
     */
    TAXR,

    /**
     * Relates to a consent within a corporate action event other than a Consent event (: 22F:: CAEV//CONS).
     * 
     */
    CONS,

    /**
     * Full pre-funding of a debt instrument by the issuer prior to original maturity when the issuer deposits assets in trust. Applicable only in the frame of a partial defeasance corporate action event.
     * 
     */
    FPRE,

    /**
     * The event is a payment of an incentive premium related to the voting conditions prescribed at a general meeting.
     * 
     */
    INCP,

    /**
     * Issuer only allows a single option to be selected per designated holding.
     * 
     */
    NPLE,

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
     * Component event of a scheme/plan of arrangement: a reorganisation of a company or a group of companies, and their capital.
     * 
     */
    SCHM;

    public String value() {
        return name();
    }

    public static AdditionalBusinessProcess12Code fromValue(String v) {
        return valueOf(v);
    }

}
