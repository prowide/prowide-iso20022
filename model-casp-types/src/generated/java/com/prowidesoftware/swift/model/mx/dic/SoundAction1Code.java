
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoundAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SoundAction1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DVOL"/&gt;
 *     &lt;enumeration value="STAS"/&gt;
 *     &lt;enumeration value="STOS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
