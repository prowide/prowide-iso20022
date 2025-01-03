
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POIComponentAssessment1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="POIComponentAssessment1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APPL"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="EVAL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "POIComponentAssessment1Code")
@XmlEnum
public enum POIComponentAssessment1Code {


    /**
     * Approval number delivered by an approval centre.
     * 
     */
    APPL,

    /**
     * Certification number delivered by a certification body.
     * 
     */
    CERT,

    /**
     * Evaluation by a lab or a tool.
     * 
     */
    EVAL;

    public String value() {
        return name();
    }

    public static POIComponentAssessment1Code fromValue(String v) {
        return valueOf(v);
    }

}
