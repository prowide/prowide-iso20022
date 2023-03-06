
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskAssessment1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RiskAssessment1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPC"/&gt;
 *     &lt;enumeration value="APPH"/&gt;
 *     &lt;enumeration value="APPU"/&gt;
 *     &lt;enumeration value="DONT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
