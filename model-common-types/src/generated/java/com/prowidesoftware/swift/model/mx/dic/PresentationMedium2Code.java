
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentationMedium2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PresentationMedium2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BIOM"/>
 *     <enumeration value="ELEC"/>
 *     <enumeration value="PAPR"/>
 *     <enumeration value="BOTH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PresentationMedium2Code")
@XmlEnum
public enum PresentationMedium2Code {


    /**
     * Biometric medium.
     * 
     */
    BIOM,

    /**
     * Presentation is made electronically.
     * 
     */
    ELEC,

    /**
     * Presentation is made on paper.
     * 
     */
    PAPR,

    /**
     * Presentation is made on paper and/or electronically.
     * 
     */
    BOTH;

    public String value() {
        return name();
    }

    public static PresentationMedium2Code fromValue(String v) {
        return valueOf(v);
    }

}
