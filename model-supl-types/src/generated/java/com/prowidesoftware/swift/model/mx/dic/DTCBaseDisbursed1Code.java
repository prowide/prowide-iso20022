
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCBaseDisbursed1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DTCBaseDisbursed1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BASE"/>
 *     <enumeration value="DISB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DTCBaseDisbursed1Code")
@XmlEnum
public enum DTCBaseDisbursed1Code {


    /**
     * Based on base security.
     * 
     */
    BASE,

    /**
     * Based on disbursed security.
     * 
     */
    DISB;

    public String value() {
        return name();
    }

    public static DTCBaseDisbursed1Code fromValue(String v) {
        return valueOf(v);
    }

}
