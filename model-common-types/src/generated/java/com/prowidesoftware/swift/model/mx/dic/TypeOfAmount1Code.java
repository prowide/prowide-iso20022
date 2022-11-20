
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfAmount1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfAmount1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTL"/&gt;
 *     &lt;enumeration value="ESTM"/&gt;
 *     &lt;enumeration value="MAXI"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="RPLT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount1Code")
@XmlEnum
public enum TypeOfAmount1Code {


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
    RPLT;

    public String value() {
        return name();
    }

    public static TypeOfAmount1Code fromValue(String v) {
        return valueOf(v);
    }

}
