
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClosingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ClosingType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OVER"/>
 *     <enumeration value="TERM"/>
 *     <enumeration value="FLEX"/>
 *     <enumeration value="OPEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClosingType1Code")
@XmlEnum
public enum ClosingType1Code {


    /**
     * Repo with a term of one day.
     * 
     */
    OVER,

    /**
     * Repo with a term of more than one day.
     * 
     */
    TERM,

    /**
     * Identifies "a classic term repo with the added feature that the cash is repaid to the buyer in installments" (Definition from "Mastering Repo Markets" by Bob Steiner).
     * 
     */
    FLEX,

    /**
     * Repo which can be terminated by either party at any time, and which has an unspecified repurchase date.
     * 
     */
    OPEN;

    public String value() {
        return name();
    }

    public static ClosingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
