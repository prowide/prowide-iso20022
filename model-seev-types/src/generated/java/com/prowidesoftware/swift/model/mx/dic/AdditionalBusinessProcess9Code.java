
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalBusinessProcess9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalBusinessProcess9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACLA"/&gt;
 *     &lt;enumeration value="ATXF"/&gt;
 *     &lt;enumeration value="CNTR"/&gt;
 *     &lt;enumeration value="NAMC"/&gt;
 *     &lt;enumeration value="NPLE"/&gt;
 *     &lt;enumeration value="SCHM"/&gt;
 *     &lt;enumeration value="CONS"/&gt;
 *     &lt;enumeration value="PPUT"/&gt;
 *     &lt;enumeration value="FPRE"/&gt;
 *     &lt;enumeration value="PPRE"/&gt;
 *     &lt;enumeration value="REAC"/&gt;
 *     &lt;enumeration value="INCP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdditionalBusinessProcess9Code")
@XmlEnum
public enum AdditionalBusinessProcess9Code {


    /**
     * Will automatically give rise to market claims by the account servicer, for example, a Central Securities Depository (CSD).
     * 
     */
    ACLA,

    /**
     * As a result of the corporate action, all transactions in the underlying security will be cancelled by the system and replaced with transactions in the outturn resource(s).
     * 
     */
    ATXF,

    /**
     * As a result of the corporate action, all transactions in the underlying security will be cancelled by the system.
     * 
     */
    CNTR,

    /**
     * Event will not automatically give rise to market claims and transformations by the account servicer, for example, a Central Securities Depository (CSD).
     * 
     */
    NAMC,

    /**
     * Issuer only allows a single option to be selected per designated holding.
     * 
     */
    NPLE,

    /**
     * Component event of a scheme/plan of arrangement: a reorganisation of a company or a group of companies, and their capital.
     * 
     */
    SCHM,

    /**
     * Relates to a consent within a corporate action event other than a Consent event (: 22F:: CAEV//CONS).
     * 
     */
    CONS,

    /**
     * Partial mandatory exchange of a portion of bonds where the exchanged securities are usually remarketed. The issuer may offer holders the right to retain instead of exchanging their securities. A lottery will be used to determine eligibility for the event.
     * 
     */
    PPUT,

    /**
     * Full pre-funding of a debt instrument by the issuer prior to original maturity when the issuer deposits assets in trust. Applicable only in the frame of a partial defeasance corporate action event.
     * 
     */
    FPRE,

    /**
     * Partial pre-funding of a debt instrument prior to maturity drawn through a lottery process. One new security is issued with an earlier maturity date for the refunded (called portion) and the other new security is issued with the original maturity date for the non refunded (remaining) portion. Applicable only in the frame of a partial defeasance corporate action event.
     * 
     */
    PPRE,

    /**
     * Proceeds / entitlements of the mandatory event can only be paid if specified action is taken by the account owner.
     * 
     */
    REAC,

    /**
     * The event is a payment of an incentive premium related to the voting conditions prescribed at a general meeting.
     * 
     */
    INCP;

    public String value() {
        return name();
    }

    public static AdditionalBusinessProcess9Code fromValue(String v) {
        return valueOf(v);
    }

}
