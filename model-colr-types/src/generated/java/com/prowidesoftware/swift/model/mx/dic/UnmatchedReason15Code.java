
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedReason15Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnmatchedReason15Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CPCA"/>
 *     <enumeration value="DCBS"/>
 *     <enumeration value="TMOP"/>
 *     <enumeration value="OPTP"/>
 *     <enumeration value="OFRF"/>
 *     <enumeration value="SPRD"/>
 *     <enumeration value="RITP"/>
 *     <enumeration value="RATE"/>
 *     <enumeration value="TMCY"/>
 *     <enumeration value="TXCY"/>
 *     <enumeration value="TXAM"/>
 *     <enumeration value="MNTP"/>
 *     <enumeration value="EGSP"/>
 *     <enumeration value="EXPO"/>
 *     <enumeration value="DTRD"/>
 *     <enumeration value="REDT"/>
 *     <enumeration value="CMIS"/>
 *     <enumeration value="TFRT"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="INPD"/>
 *     <enumeration value="PYFQ"/>
 *     <enumeration value="CSAC"/>
 *     <enumeration value="LBKD"/>
 *     <enumeration value="CRYD"/>
 *     <enumeration value="TENO"/>
 *     <enumeration value="SEPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
