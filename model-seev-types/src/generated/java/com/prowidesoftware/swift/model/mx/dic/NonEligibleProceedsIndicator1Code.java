
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEligibleProceedsIndicator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NonEligibleProceedsIndicator1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NELC"/>
 *     <enumeration value="ACLI"/>
 *     <enumeration value="ONEL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NonEligibleProceedsIndicator1Code")
@XmlEnum
public enum NonEligibleProceedsIndicator1Code {


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
    ONEL;

    public String value() {
        return name();
    }

    public static NonEligibleProceedsIndicator1Code fromValue(String v) {
        return valueOf(v);
    }

}
