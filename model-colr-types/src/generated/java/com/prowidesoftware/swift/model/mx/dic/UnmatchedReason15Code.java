
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedReason15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnmatchedReason15Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CPCA"/&gt;
 *     &lt;enumeration value="DCBS"/&gt;
 *     &lt;enumeration value="TMOP"/&gt;
 *     &lt;enumeration value="OPTP"/&gt;
 *     &lt;enumeration value="OFRF"/&gt;
 *     &lt;enumeration value="SPRD"/&gt;
 *     &lt;enumeration value="RITP"/&gt;
 *     &lt;enumeration value="RATE"/&gt;
 *     &lt;enumeration value="TMCY"/&gt;
 *     &lt;enumeration value="TXCY"/&gt;
 *     &lt;enumeration value="TXAM"/&gt;
 *     &lt;enumeration value="MNTP"/&gt;
 *     &lt;enumeration value="EGSP"/&gt;
 *     &lt;enumeration value="EXPO"/&gt;
 *     &lt;enumeration value="DTRD"/&gt;
 *     &lt;enumeration value="REDT"/&gt;
 *     &lt;enumeration value="CMIS"/&gt;
 *     &lt;enumeration value="TFRT"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="INPD"/&gt;
 *     &lt;enumeration value="PYFQ"/&gt;
 *     &lt;enumeration value="CSAC"/&gt;
 *     &lt;enumeration value="LBKD"/&gt;
 *     &lt;enumeration value="CRYD"/&gt;
 *     &lt;enumeration value="TENO"/&gt;
 *     &lt;enumeration value="SEPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnmatchedReason15Code")
@XmlEnum
public enum UnmatchedReason15Code {


    /**
     * Counterparty cancelled their instruction.
     * 
     */
    CPCA,

    /**
     * Day Count Basis does  not match.
     * 
     */
    DCBS,

    /**
     * Termination Option does not match.
     * 
     */
    TMOP,

    /**
     * Option Type does not match.
     * 
     */
    OPTP,

    /**
     * Overnight Frequency Rate Fixing does not match.
     * 
     */
    OFRF,

    /**
     * Spread does not match.
     * 
     */
    SPRD,

    /**
     * Rate Index Type does not match.
     * 
     */
    RITP,

    /**
     * Rate does not match.
     * 
     */
    RATE,

    /**
     * Termination Currency does not match
     * 
     */
    TMCY,

    /**
     * Transaction Currency does not match.
     * 
     */
    TXCY,

    /**
     * Transaction amount does not  match.
     * 
     * 
     */
    TXAM,

    /**
     * Minimum Notice Period does not match
     * 
     */
    MNTP,

    /**
     * The Eligibility Set Profile does not match.
     * 
     */
    EGSP,

    /**
     * The exposure type does not match.
     * 
     */
    EXPO,

    /**
     * Trade date does not match.
     * 
     */
    DTRD,

    /**
     * Requested Execution Date Time does not match.
     * 
     */
    REDT,

    /**
     * A matching instruction from your counterparty could not be found.
     * 
     */
    CMIS,

    /**
     * Transfer Title Indicator does not match.
     * 
     */
    TFRT,

    /**
     * Closing date/time does not match.
     * 
     */
    TERM,

    /**
     * Number of days after the accrual payment is due does not match.
     * 
     */
    INPD,

    /**
     * The computation method of (accrued) interest does not match.
     * 
     */
    PYFQ,

    /**
     * Compound simple accrual calculation indicator doe not match.
     * 
     */
    CSAC,

    /**
     * Lookback days does not match.
     * 
     */
    LBKD,

    /**
     * Crystallisation date does not match.
     * 
     */
    CRYD,

    /**
     * Tenor of the interest rate index does not match.
     * 
     */
    TENO,

    /**
     * Settlement process in which the collateral will be settled does not match.
     * 
     */
    SEPR;

    public String value() {
        return name();
    }

    public static UnmatchedReason15Code fromValue(String v) {
        return valueOf(v);
    }

}
