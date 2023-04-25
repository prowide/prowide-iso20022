
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditLineUpdateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CreditLineUpdateType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DECR"/>
 *     <enumeration value="INCR"/>
 *     <enumeration value="RPLC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CreditLineUpdateType1Code")
@XmlEnum
public enum CreditLineUpdateType1Code {


    /**
     * Decrease to the credit line amount.
     * 
     */
    DECR,

    /**
     * Increase to the credit line amount.
     * 
     */
    INCR,

    /**
     * Credit line amount is replaced with new value.
     * 
     */
    RPLC;

    public String value() {
        return name();
    }

    public static CreditLineUpdateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
