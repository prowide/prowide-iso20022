
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Eligibility1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Eligibility1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ELIG"/>
 *     <enumeration value="RETL"/>
 *     <enumeration value="PROF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Eligibility1Code")
@XmlEnum
public enum Eligibility1Code {


    /**
     * Eligible customers are the most sophisticated level of investor, able to opt out of some the protections afforded by conduct of business rules.
     * 
     */
    ELIG,

    /**
     * Retail customers are the least sophisticated level of investor.
     * 
     */
    RETL,

    /**
     * Professional customers are, for example, investment firms, credit institutions, insurance companies.
     * 
     */
    PROF;

    public String value() {
        return name();
    }

    public static Eligibility1Code fromValue(String v) {
        return valueOf(v);
    }

}
