
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EligibilityType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EligibilityType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SECU"/>
 *     <enumeration value="ISCS"/>
 *     <enumeration value="CTRY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EligibilityType1Code")
@XmlEnum
public enum EligibilityType1Code {


    /**
     * Eligibility applies at securities level.
     * 
     */
    SECU,

    /**
     * Eligibility applies at the level of issuer CSD.
     * All of the securities issued by the issuer CSD are eligible.
     * 
     */
    ISCS,

    /**
     * Eligibility applies at country level.
     * All of the securities issued in that country are eligible.
     * 
     */
    CTRY;

    public String value() {
        return name();
    }

    public static EligibilityType1Code fromValue(String v) {
        return valueOf(v);
    }

}
