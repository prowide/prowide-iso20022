
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorProfileStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestorProfileStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISA"/&gt;
 *     &lt;enumeration value="DISG"/&gt;
 *     &lt;enumeration value="ENAB"/&gt;
 *     &lt;enumeration value="ENBG"/&gt;
 *     &lt;enumeration value="ADMI"/&gt;
 *     &lt;enumeration value="ANLY"/&gt;
 *     &lt;enumeration value="NAPP"/&gt;
 *     &lt;enumeration value="PSUS"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="SUPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
