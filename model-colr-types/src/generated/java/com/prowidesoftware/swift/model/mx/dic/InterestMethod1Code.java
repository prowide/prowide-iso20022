
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InterestMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PHYS"/>
 *     <enumeration value="ROLL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InterestMethod1Code")
@XmlEnum
public enum InterestMethod1Code {


    /**
     * Indicates that the interest is intended to be settled in cash.
     * 
     */
    PHYS,

    /**
     * Indicates that the interest is intended to be rolled in to existing collateral balances.
     * 
     */
    ROLL;

    public String value() {
        return name();
    }

    public static InterestMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
