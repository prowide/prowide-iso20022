
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFormat4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OutputFormat4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FLNM"/>
 *     <enumeration value="MREF"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="SMSI"/>
 *     <enumeration value="TEXT"/>
 *     <enumeration value="URLI"/>
 *     <enumeration value="HTML"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OutputFormat4Code")
@XmlEnum
public enum OutputFormat4Code {


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
     * Other type of output of message defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of output format defined at private level.
     * 
     */
    OTHP,

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

    public static OutputFormat4Code fromValue(String v) {
        return valueOf(v);
    }

}
