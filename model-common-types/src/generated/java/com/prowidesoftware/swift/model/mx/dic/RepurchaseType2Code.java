
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepurchaseType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepurchaseType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CADJ"/&gt;
 *     &lt;enumeration value="CALL"/&gt;
 *     &lt;enumeration value="PAIR"/&gt;
 *     &lt;enumeration value="RATE"/&gt;
 *     &lt;enumeration value="ROLP"/&gt;
 *     &lt;enumeration value="TOPU"/&gt;
 *     &lt;enumeration value="WTHD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepurchaseType2Code")
@XmlEnum
public enum RepurchaseType2Code {


    /**
     * Relates to a Swap/Substitution.
     * 
     */
    CADJ,

    /**
     * Relates to a change in the closing or maturity date.
     * 
     */
    CALL,

    /**
     * Relates to a pair-off: the transaction is paired off and netted against one or more previous transactions.
     * 
     */
    PAIR,

    /**
     * Is part of a pair-off.
     * 
     */
    RATE,

    /**
     * Relates to a repo rollover of a position extending the closing or maturity date.
     * 
     */
    ROLP,

    /**
     * Relates to a repo rollover of a position extending the closing or maturity date.
     * 
     */
    TOPU,

    /**
     * Relates to a repo rollover of a position extending the closing or maturity date.
     * 
     */
    WTHD;

    public String value() {
        return name();
    }

    public static RepurchaseType2Code fromValue(String v) {
        return valueOf(v);
    }

}
