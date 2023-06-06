
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalServiceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdditionalServiceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CACT"/>
 *     <enumeration value="CSHB"/>
 *     <enumeration value="DCCV"/>
 *     <enumeration value="INTP"/>
 *     <enumeration value="INTT"/>
 *     <enumeration value="LOYT"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PRST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdditionalServiceType1Code")
@XmlEnum
public enum AdditionalServiceType1Code {


    /**
     * Card activation
     * 
     */
    CACT,

    /**
     * Purchase of goods or services with cashback
     * 
     */
    CSHB,

    /**
     * Dynamic Currency Conversion (DCC)
     * 
     */
    DCCV,

    /**
     * Instant payment from a cardholder's account to an acceptor's account
     * 
     */
    INTP,

    /**
     * Instant transfer of funds from a payer's account to a payee's account.
     * 
     */
    INTT,

    /**
     * Loyalty services
     * 
     */
    LOYT,

    /**
     * Other type of additional service at national level
     * 
     */
    OTHN,

    /**
     * Other type of additional service at private level
     * 
     */
    OTHP,

    /**
     * Withdrawal transaction was pre-authorised by another channel (amount could be absent).
     * 
     */
    PRST;

    public String value() {
        return name();
    }

    public static AdditionalServiceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
