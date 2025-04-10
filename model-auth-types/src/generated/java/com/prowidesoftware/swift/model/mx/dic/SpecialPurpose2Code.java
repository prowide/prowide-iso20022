
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialPurpose2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SpecialPurpose2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLNK"/>
 *     <enumeration value="NTAV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SpecialPurpose2Code")
@XmlEnum
public enum SpecialPurpose2Code {


    /**
     * Blank value.
     * 
     */
    BLNK,

    /**
     * Not available (N/A).
     * 
     */
    NTAV;

    public String value() {
        return name();
    }

    public static SpecialPurpose2Code fromValue(String v) {
        return valueOf(v);
    }

}
