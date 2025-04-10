
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorRestrictionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestorRestrictionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LERE"/>
 *     <enumeration value="CITI"/>
 *     <enumeration value="INDV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestorRestrictionType1Code")
@XmlEnum
public enum InvestorRestrictionType1Code {


    /**
     * Restriction applies to a legal resident.
     * 
     */
    LERE,

    /**
     * Restriction applies to a citizen.
     * 
     */
    CITI,

    /**
     * Restriction applies to an individual.
     * 
     */
    INDV;

    public String value() {
        return name();
    }

    public static InvestorRestrictionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
