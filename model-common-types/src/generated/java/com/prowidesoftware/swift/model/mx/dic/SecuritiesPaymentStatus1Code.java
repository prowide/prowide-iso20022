
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesPaymentStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesPaymentStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FULL"/>
 *     <enumeration value="NILL"/>
 *     <enumeration value="PART"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
