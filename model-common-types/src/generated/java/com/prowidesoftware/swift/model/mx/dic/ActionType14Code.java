
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActionType14Code">
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
 *     <enumeration value="ACTV"/>
 *     <enumeration value="DEAC"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="FUPD"/>
 *     <enumeration value="PRNT"/>
 *     <enumeration value="SNDM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActionType14Code")
@XmlEnum
public enum ActionType14Code {


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
    SIGN,

    /**
     * Activate device or service.
     * 
     */
    ACTV,

    /**
     * Deactivate device or service.
     * 
     */
    DEAC,

    /**
     * Message to display, print or log.
     * 
     */
    DISP,

    /**
     * Update a data file.
     * 
     */
    FUPD,

    /**
     * Print a message.
     * 
     */
    PRNT,

    /**
     * Send a message.
     * 
     */
    SNDM;

    public String value() {
        return name();
    }

    public static ActionType14Code fromValue(String v) {
        return valueOf(v);
    }

}
