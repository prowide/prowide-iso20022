
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResourceAction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PAUS"/>
 *     <enumeration value="STAS"/>
 *     <enumeration value="LOOP"/>
 *     <enumeration value="RESU"/>
 *     <enumeration value="DVOL"/>
 *     <enumeration value="STOS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
