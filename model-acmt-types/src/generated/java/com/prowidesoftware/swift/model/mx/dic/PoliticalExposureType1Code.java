
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoliticalExposureType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PoliticalExposureType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NPEX"/&gt;
 *     &lt;enumeration value="PEXF"/&gt;
 *     &lt;enumeration value="PEXD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PoliticalExposureType1Code")
@XmlEnum
public enum PoliticalExposureType1Code {


    /**
     * No political exposure.
     * 
     */
    NPEX,

    /**
     * Political exposure type is foreign.
     * 
     */
    PEXF,

    /**
     * Political exposure type is domestic.
     * 
     */
    PEXD;

    public String value() {
        return name();
    }

    public static PoliticalExposureType1Code fromValue(String v) {
        return valueOf(v);
    }

}
