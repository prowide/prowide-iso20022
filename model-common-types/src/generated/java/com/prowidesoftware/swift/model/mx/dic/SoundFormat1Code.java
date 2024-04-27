
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoundFormat1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SoundFormat1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MSGR"/&gt;
 *     &lt;enumeration value="SNDR"/&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
