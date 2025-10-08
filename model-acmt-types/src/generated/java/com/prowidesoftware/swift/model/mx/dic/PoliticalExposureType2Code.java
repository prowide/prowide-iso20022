
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoliticalExposureType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PoliticalExposureType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NPEX"/&gt;
 *     &lt;enumeration value="YPEX"/&gt;
 *     &lt;enumeration value="PEXD"/&gt;
 *     &lt;enumeration value="PEXF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
