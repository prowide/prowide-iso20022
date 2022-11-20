
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTL"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="ESTM"/&gt;
 *     &lt;enumeration value="MAXI"/&gt;
 *     &lt;enumeration value="RESD"/&gt;
 *     &lt;enumeration value="PRXY"/&gt;
 *     &lt;enumeration value="DPST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount11Code")
@XmlEnum
public enum TypeOfAmount11Code {


    /**
     * Actual amount.
     * 
     */
    ACTL,

    /**
     * Default amount.
     * 
     */
    DFLT,

    /**
     * Estimated amount (the final amount could be above or below).
     * 
     */
    ESTM,

    /**
     * Maximum amount (the final amount must be less or equal).
     * 
     */
    MAXI,

    /**
     * Reserved or updated reserved amount for reservation.
     * 
     */
    RESD,

    /**
     * Substitute for an amount to be authorised.
     * 
     */
    PRXY,

    /**
     * Deposit amount.
     * 
     */
    DPST;

    public String value() {
        return name();
    }

    public static TypeOfAmount11Code fromValue(String v) {
        return valueOf(v);
    }

}
