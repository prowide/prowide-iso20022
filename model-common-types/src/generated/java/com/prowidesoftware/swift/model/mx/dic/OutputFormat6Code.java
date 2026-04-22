
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFormat6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OutputFormat6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FLNM"/>
 *     <enumeration value="MREF"/>
 *     <enumeration value="SMSI"/>
 *     <enumeration value="TEXT"/>
 *     <enumeration value="URLI"/>
 *     <enumeration value="HTML"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OutputFormat6Code")
@XmlEnum
public enum OutputFormat6Code {


    /**
     * File name and location identification for stored messages or data.
     * 
     */
    FLNM,

    /**
     * Predefined configured messages, identified by a reference.
     * 
     */
    MREF,

    /**
     * Short message service
     * 
     */
    SMSI,

    /**
     * Text without format attributes.
     * 
     */
    TEXT,

    /**
     * Uniform Resource Locator (URL) reference for the message.
     * 
     */
    URLI,

    /**
     * XHTML document which includes a subset of the XHTML output tag.
     * 
     */
    HTML;

    public String value() {
        return name();
    }

    public static OutputFormat6Code fromValue(String v) {
        return valueOf(v);
    }

}
