
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskAssessment1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RiskAssessment1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APPC"/>
 *     <enumeration value="APPH"/>
 *     <enumeration value="APPU"/>
 *     <enumeration value="DONT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RiskAssessment1Code")
@XmlEnum
public enum RiskAssessment1Code {


    /**
     * Recommended to approve conditionally.
     * 
     */
    APPC,

    /**
     * Recommended to approve conditionally; high risk conditions exist.
     * 
     */
    APPH,

    /**
     * Recommended to approve unconditionally.
     * 
     */
    APPU,

    /**
     * Recommended to not approve.
     * 
     */
    DONT;

    public String value() {
        return name();
    }

    public static RiskAssessment1Code fromValue(String v) {
        return valueOf(v);
    }

}
