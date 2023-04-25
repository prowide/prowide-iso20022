
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActionType11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNTI"/>
 *     <enumeration value="CNIS"/>
 *     <enumeration value="CNTA"/>
 *     <enumeration value="CNAS"/>
 *     <enumeration value="CPTR"/>
 *     <enumeration value="CHDV"/>
 *     <enumeration value="VIPM"/>
 *     <enumeration value="TRCK"/>
 *     <enumeration value="TRXR"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="SIGN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActionType11Code")
@XmlEnum
public enum ActionType11Code {


    /**
     * Contact card issuer.
     * 
     */
    CNTI,

    /**
     * Refer to card issuer's special conditions.
     * 
     */
    CNIS,

    /**
     * Contact acquirer.
     * 
     */
    CNTA,

    /**
     * Card acceptor to call acquirer's security department.
     * 
     */
    CNAS,

    /**
     * Capture the card.
     * 
     */
    CPTR,

    /**
     * Additional verification of cardholder required.
     * 
     */
    CHDV,

    /**
     * Manage account as a VIP one.
     * 
     */
    VIPM,

    /**
     * Track provided in the response must be updated on the card.
     * 
     */
    TRCK,

    /**
     * Transaction to be re-entered.
     * 
     */
    TRXR,

    /**
     * Other action defined at national level.
     * 
     */
    OTHN,

    /**
     * Other action defined at private level
     * 
     */
    OTHP,

    /**
     * Signature required.
     * 
     */
    SIGN;

    public String value() {
        return name();
    }

    public static ActionType11Code fromValue(String v) {
        return valueOf(v);
    }

}
