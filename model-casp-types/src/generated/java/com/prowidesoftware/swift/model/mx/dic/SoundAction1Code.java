
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoundAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SoundAction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DVOL"/>
 *     <enumeration value="STAS"/>
 *     <enumeration value="STOS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SoundAction1Code")
@XmlEnum
public enum SoundAction1Code {


    /**
     * Set the default volume of sounds.
     * 
     */
    DVOL,

    /**
     * Start the sound as specified in the message.
     * 
     */
    STAS,

    /**
     * Stop the sound in progress.
     * 
     */
    STOS;

    public String value() {
        return name();
    }

    public static SoundAction1Code fromValue(String v) {
        return valueOf(v);
    }

}
