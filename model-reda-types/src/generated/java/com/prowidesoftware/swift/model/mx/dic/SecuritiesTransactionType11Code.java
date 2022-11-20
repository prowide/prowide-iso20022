
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesTransactionType11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NSYN"/&gt;
 *     &lt;enumeration value="SYND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecuritiesTransactionType11Code")
@XmlEnum
public enum SecuritiesTransactionType11Code {


    /**
     * Relates to the issue of medium and short term paper (CP, CD, MTN, notes.) under a program and without syndication arrangement.
     * 
     */
    NSYN,

    /**
     * Relates to the issue of financial instruments through a syndicate of underwriters and a lead manager.
     * 
     */
    SYND;

    public String value() {
        return name();
    }

    public static SecuritiesTransactionType11Code fromValue(String v) {
        return valueOf(v);
    }

}
