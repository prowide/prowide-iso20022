
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrePaymentSpeed1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PrePaymentSpeed1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SIMM"/>
 *     <enumeration value="COPR"/>
 *     <enumeration value="ABPS"/>
 *     <enumeration value="MOPR"/>
 *     <enumeration value="HOEP"/>
 *     <enumeration value="BOMA"/>
 *     <enumeration value="PROP"/>
 *     <enumeration value="MAHP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PrePaymentSpeed1Code")
@XmlEnum
public enum PrePaymentSpeed1Code {


    /**
     * Prepayment speed schedule is Single Monthly Mortality, ie, the percentage of outstanding mortgage loan principal prepays in one month.
     * 
     */
    SIMM,

    /**
     * Measure of prepayment as a percentage of the current outstanding loan balance, expressed as a compound annual rate.
     * 
     */
    COPR,

    /**
     * Measure of prepayment as a monthly percentage of the original loan balance.
     * 
     */
    ABPS,

    /**
     * Repayment measure for nonamortizing assets not subject to prepayment. It is calculated by dividing the sum of the interest and principal payments received in a month by the outstanding balance.
     * 
     */
    MOPR,

    /**
     * Contains the type of prepayment speed of the financial instrument, expressed as a percentage of the final Constant Prepayment Rate of the Home Equity Prepayment Curve (10-month seasoning scale composed of even step-ups, terminating at the final Home Equity Prepayment percentage in the 10th month).
     * 
     */
    HOEP,

    /**
     * Contains the type of prepayment speed of the financial instrument, expressed as a percentage of the Bonds Market Association prepayment Curve.
     * 
     */
    BOMA,

    /**
     * Refers to the pricing speed of a transaction as defined in the prospectus and is specific to the issue which are normally priced at 100 percent PPC.
     * 
     */
    PROP,

    /**
     * Contains the type of prepayment speed of the financial instrument, expressed as a percentage of the Manufactured Housing Prepayment Curve (24-month seasoning scale composed of even step-ups).
     * 
     */
    MAHP;

    public String value() {
        return name();
    }

    public static PrePaymentSpeed1Code fromValue(String v) {
        return valueOf(v);
    }

}
