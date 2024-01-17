
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoliticalExposureType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PoliticalExposureType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NPEX"/>
 *     <enumeration value="YPEX"/>
 *     <enumeration value="PEXD"/>
 *     <enumeration value="PEXF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PoliticalExposureType2Code")
@XmlEnum
public enum PoliticalExposureType2Code {


    /**
     * No political exposure.
     * 
     */
    NPEX,

    /**
     * Political exposure.
     * 
     */
    YPEX,

    /**
     * Political exposure type is domestic.
     * 
     */
    PEXD,

    /**
     * Political exposure type is foreign.
     * 
     */
    PEXF;

    public String value() {
        return name();
    }

    public static PoliticalExposureType2Code fromValue(String v) {
        return valueOf(v);
    }

}
