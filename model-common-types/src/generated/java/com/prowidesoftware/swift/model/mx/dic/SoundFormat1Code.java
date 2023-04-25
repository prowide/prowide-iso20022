
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoundFormat1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SoundFormat1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MSGR"/>
 *     <enumeration value="SNDR"/>
 *     <enumeration value="TEXT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SoundFormat1Code")
@XmlEnum
public enum SoundFormat1Code {


    /**
     * Reference of a preloaded text to play.
     * 
     */
    MSGR,

    /**
     * Preloaded sound File.
     * 
     */
    SNDR,

    /**
     * Text to play.
     * 
     */
    TEXT;

    public String value() {
        return name();
    }

    public static SoundFormat1Code fromValue(String v) {
        return valueOf(v);
    }

}
