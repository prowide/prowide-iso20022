
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareRanking1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ShareRanking1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DIVI"/>
 *     <enumeration value="PARI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ShareRanking1Code")
@XmlEnum
public enum ShareRanking1Code {


    /**
     * Payable on the date specified.
     * 
     */
    DIVI,

    /**
     * Pari Passu. With equal rights as other shares of the company.
     * 
     */
    PARI;

    public String value() {
        return name();
    }

    public static ShareRanking1Code fromValue(String v) {
        return valueOf(v);
    }

}
