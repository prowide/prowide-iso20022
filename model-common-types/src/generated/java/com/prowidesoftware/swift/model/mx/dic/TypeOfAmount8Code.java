
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTL"/&gt;
 *     &lt;enumeration value="ESTM"/&gt;
 *     &lt;enumeration value="MAXI"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="RPLT"/&gt;
 *     &lt;enumeration value="INCR"/&gt;
 *     &lt;enumeration value="DECR"/&gt;
 *     &lt;enumeration value="RESD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount8Code")
@XmlEnum
public enum TypeOfAmount8Code {


    /**
     * Actual amount.
     * 
     */
    ACTL,

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
     * Default amount.
     * 
     */
    DFLT,

    /**
     * Replacement amount.
     * 
     */
    RPLT,

    /**
     * Incremental amount for reservation.
     * 
     */
    INCR,

    /**
     * Decremental amount for reservation.
     * 
     */
    DECR,

    /**
     * Reserved or updated reserved amount for reservation.
     * 
     */
    RESD;

    public String value() {
        return name();
    }

    public static TypeOfAmount8Code fromValue(String v) {
        return valueOf(v);
    }

}
