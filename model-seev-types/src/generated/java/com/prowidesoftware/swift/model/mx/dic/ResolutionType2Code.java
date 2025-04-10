
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResolutionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResolutionType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXTR"/>
 *     <enumeration value="SPCL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResolutionType2Code")
@XmlEnum
public enum ResolutionType2Code {


    /**
     * Meeting resolution is extraordinary and may be subject to specific voting requirements.
     * 
     */
    EXTR,

    /**
     * Resolution that is neither ordinary nor extraordinary (eg. decision on an investment strategy).
     * 
     */
    SPCL;

    public String value() {
        return name();
    }

    public static ResolutionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
