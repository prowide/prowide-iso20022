
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEligibleProceedsIndicator2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NonEligibleProceedsIndicator2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NELC"/>
 *     <enumeration value="ACLI"/>
 *     <enumeration value="ONEL"/>
 *     <enumeration value="NELS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NonEligibleProceedsIndicator2Code")
@XmlEnum
public enum NonEligibleProceedsIndicator2Code {


    /**
     * Currency not eligible for settlement in the Central Securities Depository (CSD).
     * 
     */
    NELC,

    /**
     * Participant's account limitation.
     * 
     */
    ACLI,

    /**
     * Other source of non eligibility.
     * 
     */
    ONEL,

    /**
     * Security not eligible in the Central Securities Depository (CSD).
     * 
     */
    NELS;

    public String value() {
        return name();
    }

    public static NonEligibleProceedsIndicator2Code fromValue(String v) {
        return valueOf(v);
    }

}
