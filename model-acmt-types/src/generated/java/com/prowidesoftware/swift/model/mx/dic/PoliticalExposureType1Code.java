
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoliticalExposureType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PoliticalExposureType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NPEX"/>
 *     <enumeration value="PEXF"/>
 *     <enumeration value="PEXD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
