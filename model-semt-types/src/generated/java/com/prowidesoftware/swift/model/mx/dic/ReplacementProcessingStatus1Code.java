
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplacementProcessingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReplacementProcessingStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEND"/&gt;
 *     &lt;enumeration value="EXCH"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="REPL"/&gt;
 *     &lt;enumeration value="REPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReplacementProcessingStatus1Code")
@XmlEnum
public enum ReplacementProcessingStatus1Code {


    /**
     * Replacement request cannot be executed.
     * 
     */
    DEND,

    /**
     * Replacement request previously received from you has been received at the stock exchange.
     * 
     */
    EXCH,

    /**
     * Replacement request previously received from you has been received at intermediary (if not stock exchange).
     * 
     */
    INTE,

    /**
     * Replacement request has been accepted for further processing by the account servicer (technical receipt).
     * 
     */
    PACK,

    /**
     * Order is partially filled, replacement processing accepted for the remaining.
     * 
     */
    PART,

    /**
     * Replacement request is pending.
     * 
     */
    PEND,

    /**
     * Replacement request has been rejected for further processing.
     * 
     */
    REJT,

    /**
     * Replacement request has been completed.
     * 
     */
    REPL,

    /**
     * Replacement request previously received from you is in repair.
     * 
     */
    REPR;

    public String value() {
        return name();
    }

    public static ReplacementProcessingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
