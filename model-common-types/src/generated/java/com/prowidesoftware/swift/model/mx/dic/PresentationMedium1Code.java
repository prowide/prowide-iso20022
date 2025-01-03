
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentationMedium1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PresentationMedium1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOTH"/>
 *     <enumeration value="ELEC"/>
 *     <enumeration value="PAPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PresentationMedium1Code")
@XmlEnum
public enum PresentationMedium1Code {


    /**
     * Presentation is made on paper and/or electronically.
     * 
     */
    BOTH,

    /**
     * Presentation is made electronically.
     * 
     */
    ELEC,

    /**
     * Presentation is made on paper.
     * 
     */
    PAPR;

    public String value() {
        return name();
    }

    public static PresentationMedium1Code fromValue(String v) {
        return valueOf(v);
    }

}
