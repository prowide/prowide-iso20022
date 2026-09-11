
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPendingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionPendingStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNFC"/>
 *     <enumeration value="PUBF"/>
 *     <enumeration value="REOR"/>
 *     <enumeration value="ACCR"/>
 *     <enumeration value="SCAL"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="MATU"/>
 *     <enumeration value="PAYD"/>
 *     <enumeration value="POSD"/>
 *     <enumeration value="CNPC"/>
 *     <enumeration value="CNRD"/>
 *     <enumeration value="CNRE"/>
 *     <enumeration value="VRON"/>
 *     <enumeration value="VRZC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionPendingStatus1Code")
@XmlEnum
public enum CorporateActionPendingStatus1Code {


    /**
     * Concurrent full call event exists.
     * 
     */
    CNFC,

    /**
     * Pending due to future publication date.
     * 
     */
    PUBF,

    /**
     * Concurrent reorganisation announcement exists.
     * 
     */
    REOR,

    /**
     * Unable to calculate accrued interest. Missing payment details.
     * 
     */
    ACCR,

    /**
     * Invalid Security Called Amount.
     * 
     */
    SCAL,

    /**
     * Late announcement. The declared payment date is outside of acceptable range in the past.
     * 
     */
    LATE,

    /**
     * Maturing issue. Redemption date is greater than or equal to maturity date.
     * 
     */
    MATU,

    /**
     * Payable date outside of applicable date range.
     * 
     */
    PAYD,

    /**
     * Position discrepancy. Potential partial call.
     * 
     */
    POSD,

    /**
     * Verify event. Potential conflicting partial call exists.
     * 
     */
    CNPC,

    /**
     * Verify event. Concurrent redemption event exists.
     * 
     */
    CNRD,

    /**
     * Verify event. Concurrent reorganisation event exists.
     * 
     */
    CNRE,

    /**
     * Verify rate. On-cycle redemption.
     * 
     */
    VRON,

    /**
     * Verify rate. Zero coupon bond.
     * 
     */
    VRZC;

    public String value() {
        return name();
    }

    public static CorporateActionPendingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
