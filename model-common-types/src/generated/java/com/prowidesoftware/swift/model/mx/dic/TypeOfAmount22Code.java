
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount22Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount22Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTL"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="DPST"/&gt;
 *     &lt;enumeration value="ESTM"/&gt;
 *     &lt;enumeration value="MAXI"/&gt;
 *     &lt;enumeration value="PRXY"/&gt;
 *     &lt;enumeration value="RESD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount22Code")
@XmlEnum
public enum TypeOfAmount22Code {


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
     * Deposit amount.
     * 
     */
    DPST,

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
     * Substitute for an amount to be authorised.
     * 
     */
    PRXY,

    /**
     * Reserved or updated reserved amount for reservation.
     * 
     */
    RESD;

    public String value() {
        return name();
    }

    public static TypeOfAmount22Code fromValue(String v) {
        return valueOf(v);
    }

}
