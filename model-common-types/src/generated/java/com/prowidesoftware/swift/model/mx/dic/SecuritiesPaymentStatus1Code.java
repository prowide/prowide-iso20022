
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesPaymentStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesPaymentStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="NILL"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecuritiesPaymentStatus1Code")
@XmlEnum
public enum SecuritiesPaymentStatus1Code {


    /**
     * Security is fully paid.
     * 
     */
    FULL,

    /**
     * Security is nill paid.
     * 
     */
    NILL,

    /**
     * Security is partially paid.
     * 
     */
    PART;

    public String value() {
        return name();
    }

    public static SecuritiesPaymentStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
