
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepurchaseType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RepurchaseType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CADJ"/>
 *     <enumeration value="CALL"/>
 *     <enumeration value="PAIR"/>
 *     <enumeration value="RATE"/>
 *     <enumeration value="ROLP"/>
 *     <enumeration value="TOPU"/>
 *     <enumeration value="WTHD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
