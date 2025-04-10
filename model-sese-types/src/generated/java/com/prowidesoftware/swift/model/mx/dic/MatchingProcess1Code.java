
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchingProcess1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MatchingProcess1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNMT"/>
 *     <enumeration value="MTRE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MatchingProcess1Code")
@XmlEnum
public enum MatchingProcess1Code {


    /**
     * The referenced transaction is requested to be unmatched.
     * 
     */
    UNMT,

    /**
     * Matching process is to be resumed for the referenced transaction.
     * 
     */
    MTRE;

    public String value() {
        return name();
    }

    public static MatchingProcess1Code fromValue(String v) {
        return valueOf(v);
    }

}
