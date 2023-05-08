
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalmentAmountDetailsType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InstalmentAmountDetailsType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TAXX"/>
 *     <enumeration value="RQST"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHC"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="FUNA"/>
 *     <enumeration value="FEES"/>
 *     <enumeration value="EXPN"/>
 *     <enumeration value="AFCO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InstalmentAmountDetailsType1Code")
@XmlEnum
public enum InstalmentAmountDetailsType1Code {


    /**
     * Instalment amount tax
     * 
     */
    TAXX,

    /**
     * Requested amount
     * 
     */
    RQST,

    /**
     * Grace period unit type
     * 
     */
    OTHP,

    /**
     * Grace period unit type
     * 
     */
    OTHN,

    /**
     * Other amounts
     * 
     */
    OTHC,

    /**
     * Insurance amount
     * 
     */
    INSU,

    /**
     * Funded amount
     * 
     */
    FUNA,

    /**
     * Fees amount
     * 
     */
    FEES,

    /**
     * Expense Amount
     * 
     */
    EXPN,

    /**
     * Total financing cost per annum.
     * 
     */
    AFCO;

    public String value() {
        return name();
    }

    public static InstalmentAmountDetailsType1Code fromValue(String v) {
        return valueOf(v);
    }

}
