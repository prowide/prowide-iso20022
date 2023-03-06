
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepurchaseType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepurchaseType10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAIR"/&gt;
 *     &lt;enumeration value="ROLP"/&gt;
 *     &lt;enumeration value="RATE"/&gt;
 *     &lt;enumeration value="CALL"/&gt;
 *     &lt;enumeration value="CADJ"/&gt;
 *     &lt;enumeration value="TOPU"/&gt;
 *     &lt;enumeration value="WTHD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepurchaseType10Code")
@XmlEnum
public enum RepurchaseType10Code {


    /**
     * Relates to a transaction that is paired off and netted against one or more previous transactions. A paired off transaction is a buyback to offset and effectively liquidate a prior sale of securities or a sellback to offset and effectively liquidate a prior buy of securities.
     * 
     */
    PAIR,

    /**
     * Relates to a repo rollover of a contract extending the closing or maturity date without the underlying collateral impacted.
     * 
     */
    ROLP,

    /**
     * Is part of a pair-off.
     * 
     */
    RATE,

    /**
     * Relates to the early closing/maturity date for a term repo or a termination date of an open repo with the underlying collateral.
     * 
     */
    CALL,

    /**
     * Relates to a swap/substitution.
     * 
     */
    CADJ,

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

    public static RepurchaseType10Code fromValue(String v) {
        return valueOf(v);
    }

}
