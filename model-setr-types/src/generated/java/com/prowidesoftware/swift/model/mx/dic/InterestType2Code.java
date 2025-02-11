
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InterestType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CINT"/>
 *     <enumeration value="XINT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InterestType2Code")
@XmlEnum
public enum InterestType2Code {


    /**
     * Indicates deal price including accrued interest.
     * 
     */
    CINT,

    /**
     * Indicates deal price excluding accrued interest.
     * 
     */
    XINT;

    public String value() {
        return name();
    }

    public static InterestType2Code fromValue(String v) {
        return valueOf(v);
    }

}
