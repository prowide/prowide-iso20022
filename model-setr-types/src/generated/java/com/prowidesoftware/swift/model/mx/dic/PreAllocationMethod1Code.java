
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreAllocationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PreAllocationMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PROR"/>
 *     <enumeration value="TALK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PreAllocationMethod1Code")
@XmlEnum
public enum PreAllocationMethod1Code {


    /**
     * Preallocation is proratised.
     * 
     */
    PROR,

    /**
     * No prorata, discuss first.
     * 
     */
    TALK;

    public String value() {
        return name();
    }

    public static PreAllocationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
