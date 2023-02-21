
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAccountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardAccountType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="SVNG"/&gt;
 *     &lt;enumeration value="CHCK"/&gt;
 *     &lt;enumeration value="CRDT"/&gt;
 *     &lt;enumeration value="UVRL"/&gt;
 *     &lt;enumeration value="INVS"/&gt;
 *     &lt;enumeration value="EPRS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardAccountType1Code")
@XmlEnum
public enum CardAccountType1Code {


    /**
     * Default account.
     * 
     */
    DFLT,

    /**
     * Savings account.
     * 
     */
    SVNG,

    /**
     * Checking account.
     * 
     */
    CHCK,

    /**
     * Credit card account.
     * 
     */
    CRDT,

    /**
     * Universal account.
     * 
     */
    UVRL,

    /**
     * Investment account.
     * 
     */
    INVS,

    /**
     * Electronic purse card account.
     * 
     */
    EPRS;

    public String value() {
        return name();
    }

    public static CardAccountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
