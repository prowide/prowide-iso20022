
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorProfileStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestorProfileStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DISA"/>
 *     <enumeration value="DISG"/>
 *     <enumeration value="ENAB"/>
 *     <enumeration value="ENBG"/>
 *     <enumeration value="ADMI"/>
 *     <enumeration value="ANLY"/>
 *     <enumeration value="NAPP"/>
 *     <enumeration value="PSUS"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="SUPS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestorProfileStatus1Code")
@XmlEnum
public enum InvestorProfileStatus1Code {


    /**
     * Status of the investor profile is disabled.
     * 
     */
    DISA,

    /**
     * Status of the investor profile is in the process of being disabled.
     * 
     */
    DISG,

    /**
     * Status of the investor profile is enabled.
     * 
     */
    ENAB,

    /**
     * Status of the investor profile is in the process of being enabled.
     * 
     */
    ENBG,

    /**
     * Status of the investor profile is in admission.
     * 
     */
    ADMI,

    /**
     * Status of the investor profile is in analysis.
     * 
     */
    ANLY,

    /**
     * Status of the investor profile is not approved.
     * 
     */
    NAPP,

    /**
     * Status of the investor profile is partially suspended.
     * 
     */
    PSUS,

    /**
     * Status of the investor profile is pending approval.
     * 
     */
    PEND,

    /**
     * Status of the investor profile is suspended.
     * 
     */
    SUPS;

    public String value() {
        return name();
    }

    public static InvestorProfileStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
