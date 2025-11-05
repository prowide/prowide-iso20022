
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalmentAmountDetailsType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InstalmentAmountDetailsType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AFCO"/>
 *     <enumeration value="EXPN"/>
 *     <enumeration value="FEES"/>
 *     <enumeration value="FUNA"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="OTHC"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PRNC"/>
 *     <enumeration value="RQST"/>
 *     <enumeration value="TAXX"/>
 *     <enumeration value="DCNT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InstalmentAmountDetailsType3Code")
@XmlEnum
public enum InstalmentAmountDetailsType3Code {


    /**
     * Total financing cost per annum.
     * 
     */
    AFCO,

    /**
     * Expense Amount
     * 
     */
    EXPN,

    /**
     * Fees amount
     * 
     */
    FEES,

    /**
     * Funded amount
     * 
     */
    FUNA,

    /**
     * Insurance amount
     * 
     */
    INSU,

    /**
     * Interest amount.
     * 
     */
    INTR,

    /**
     * Other amounts
     * 
     */
    OTHC,

    /**
     * Grace period unit type
     * 
     */
    OTHN,

    /**
     * Grace period unit type
     * 
     */
    OTHP,

    /**
     * Principal amount.
     * 
     */
    PRNC,

    /**
     * Requested amount
     * 
     */
    RQST,

    /**
     * Instalment amount tax
     * 
     */
    TAXX,

    /**
     * Discount.
     * 
     */
    DCNT;

    public String value() {
        return name();
    }

    public static InstalmentAmountDetailsType3Code fromValue(String v) {
        return valueOf(v);
    }

}
