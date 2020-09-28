
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OVER"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="FLEX"/&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TerminationType1Code")
@XmlEnum
public enum TerminationType1Code {


    /**
     * Repo with a term of one day.
     * 
     */
    OVER,

    /**
     * Repo with a term of more than one day.
     * 
     */
    TERM,

    /**
     * Identifies "a classic term repo with the added feature that the cash is repaid to the buyer in installments" (Definition from "Mastering Repo Markets" by Bob Steiner).
     * 
     */
    FLEX,

    /**
     * Repo which can be terminated by either party at any time, and which has an unspecified repurchase date.
     * 
     */
    OPEN;

    public String value() {
        return name();
    }

    public static TerminationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
