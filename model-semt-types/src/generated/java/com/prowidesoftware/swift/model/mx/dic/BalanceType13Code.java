
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BalanceType13Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *     &lt;enumeration value="CASE"/&gt;
 *     &lt;enumeration value="BORR"/&gt;
 *     &lt;enumeration value="REVE"/&gt;
 *     &lt;enumeration value="EXPN"/&gt;
 *     &lt;enumeration value="IIOF"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PAYA"/&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BalanceType13Code")
@XmlEnum
public enum BalanceType13Code {


    /**
     * Balance attributed to investments at value.
     * 
     */
    INVE,

    /**
     * Balance attributed to cash and cash equivalents.
     * 
     */
    CASE,

    /**
     * Balance attributed to borrowings.
     * 
     */
    BORR,

    /**
     * Balance attributed to revenues; including dividends, interest, net realised gains/losses etc.
     * 
     */
    REVE,

    /**
     * Balance attributed to expenses.
     * 
     */
    EXPN,

    /**
     * Balance attributed to investor inflow/outflow (creations, cancellations, income distributions).
     * 
     */
    IIOF,

    /**
     * Balance attributed according to a different classification, which is not explictly defined.
     * 
     */
    OTHR,

    /**
     * Balance attributed to payables.
     * 
     */
    PAYA,

    /**
     * Balance attributed to receivables.
     * 
     */
    RECE;

    public String value() {
        return name();
    }

    public static BalanceType13Code fromValue(String v) {
        return valueOf(v);
    }

}
