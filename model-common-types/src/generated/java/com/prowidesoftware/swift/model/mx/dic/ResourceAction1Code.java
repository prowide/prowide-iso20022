
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceAction1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAUS"/&gt;
 *     &lt;enumeration value="STAS"/&gt;
 *     &lt;enumeration value="LOOP"/&gt;
 *     &lt;enumeration value="RESU"/&gt;
 *     &lt;enumeration value="DVOL"/&gt;
 *     &lt;enumeration value="STOS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResourceAction1Code")
@XmlEnum
public enum ResourceAction1Code {


    /**
     * Pause the media resource in progress as specified in the message.
     * 
     */
    PAUS,

    /**
     * Start the media resource as specified in the message.
     * 
     */
    STAS,

    /**
     * Play in a loop the media resource as specified in the message.
     * 
     */
    LOOP,

    /**
     * Resume the progress of the media resource as specified in the message.
     * 
     */
    RESU,

    /**
     * Set the default volume of sounds.
     * 
     */
    DVOL,

    /**
     * Stop the media resource in progress.
     * 
     */
    STOS;

    public String value() {
        return name();
    }

    public static ResourceAction1Code fromValue(String v) {
        return valueOf(v);
    }

}
