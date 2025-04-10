
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CNTI"/&gt;
 *     &lt;enumeration value="CNIS"/&gt;
 *     &lt;enumeration value="CNTA"/&gt;
 *     &lt;enumeration value="CNAS"/&gt;
 *     &lt;enumeration value="CPTR"/&gt;
 *     &lt;enumeration value="CHDV"/&gt;
 *     &lt;enumeration value="VIPM"/&gt;
 *     &lt;enumeration value="TRCK"/&gt;
 *     &lt;enumeration value="TRXR"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SIGN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
