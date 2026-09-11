
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorClassificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestorClassificationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ELIG"/>
 *     <enumeration value="NLIG"/>
 *     <enumeration value="NQIB"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="QUIB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestorClassificationType1Code")
@XmlEnum
public enum InvestorClassificationType1Code {


    /**
     * Investors eligible for participation in the event.
     * 
     */
    ELIG,

    /**
     * Investors not eligible for participation in the event.
     * 
     */
    NLIG,

    /**
     * Investors not eligible for participation in the event under US regulation.
     * 
     */
    NQIB,

    /**
     * Investors that may/may not be eligible to participate in the event as described by the issuer.
     * 
     */
    OTHR,

    /**
     * Investors eligible for participation in the event as deemed qualified under US regulation.
     * 
     */
    QUIB;

    public String value() {
        return name();
    }

    public static InvestorClassificationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
