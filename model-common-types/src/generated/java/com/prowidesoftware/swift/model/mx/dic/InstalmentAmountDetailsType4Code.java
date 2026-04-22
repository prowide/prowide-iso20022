
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalmentAmountDetailsType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InstalmentAmountDetailsType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AFCO"/>
 *     <enumeration value="EXPN"/>
 *     <enumeration value="FEES"/>
 *     <enumeration value="FUNA"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="OTHC"/>
 *     <enumeration value="PRNC"/>
 *     <enumeration value="RQST"/>
 *     <enumeration value="TAXX"/>
 *     <enumeration value="DCNT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InstalmentAmountDetailsType4Code")
@XmlEnum
public enum InstalmentAmountDetailsType4Code {


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

    public static InstalmentAmountDetailsType4Code fromValue(String v) {
        return valueOf(v);
    }

}
