
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesEntryType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesEntryType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ELIG"/>
 *     <enumeration value="UNBA"/>
 *     <enumeration value="INBA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesEntryType3Code")
@XmlEnum
public enum SecuritiesEntryType3Code {


    /**
     * Total number of securities eligible for this event.
     * 
     */
    ELIG,

    /**
     * Balance of uninstructed position.
     * 
     */
    UNBA,

    /**
     * Balance of instructed position.
     * 
     */
    INBA;

    public String value() {
        return name();
    }

    public static SecuritiesEntryType3Code fromValue(String v) {
        return valueOf(v);
    }

}
