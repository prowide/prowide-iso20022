
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalmentAmountDetailsType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InstalmentAmountDetailsType2Code">
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
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InstalmentAmountDetailsType2Code")
@XmlEnum
public enum InstalmentAmountDetailsType2Code {


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
    TAXX;

    public String value() {
        return name();
    }

    public static InstalmentAmountDetailsType2Code fromValue(String v) {
        return valueOf(v);
    }

}
