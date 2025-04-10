
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallIn1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CallIn1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CFAV"/>
 *     <enumeration value="CFST"/>
 *     <enumeration value="CFCC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CallIn1Code")
@XmlEnum
public enum CallIn1Code {


    /**
     * Pay-in call is for account value.
     * 
     */
    CFAV,

    /**
     * Pay-in call is for settlement.
     * 
     */
    CFST,

    /**
     * Pay-in call is for currency close.
     * 
     */
    CFCC;

    public String value() {
        return name();
    }

    public static CallIn1Code fromValue(String v) {
        return valueOf(v);
    }

}
