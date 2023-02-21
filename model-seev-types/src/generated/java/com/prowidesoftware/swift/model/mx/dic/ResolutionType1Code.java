
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResolutionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResolutionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXTR"/&gt;
 *     &lt;enumeration value="ORDI"/&gt;
 *     &lt;enumeration value="SPCL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResolutionType1Code")
@XmlEnum
public enum ResolutionType1Code {


    /**
     * Meeting resolution is extraordinary and may be subject to specific voting requirements.
     * 
     */
    EXTR,

    /**
     * Meeting resolution is ordinary and is not subject to any specific voting requirements.
     * 
     */
    ORDI,

    /**
     * Resolution that is neither ordinary nor extraordinary (eg. decision on an investment strategy).
     * 
     */
    SPCL;

    public String value() {
        return name();
    }

    public static ResolutionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
