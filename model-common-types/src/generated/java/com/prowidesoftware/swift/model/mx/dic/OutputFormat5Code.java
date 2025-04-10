
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFormat5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OutputFormat5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="TEXT"/>
 *     <enumeration value="URLI"/>
 *     <enumeration value="HTML"/>
 *     <enumeration value="PLIN"/>
 *     <enumeration value="JSON"/>
 *     <enumeration value="XMLF"/>
 *     <enumeration value="EDIF"/>
 *     <enumeration value="CSVF"/>
 *     <enumeration value="JPEG"/>
 *     <enumeration value="PDFF"/>
 *     <enumeration value="PNGF"/>
 *     <enumeration value="SVGF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OutputFormat5Code")
@XmlEnum
public enum OutputFormat5Code {


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
    HTML,

    /**
     * A formatted print line.
     * 
     */
    PLIN,

    /**
     * Java Syntax Object Notation format.
     * 
     */
    JSON,

    /**
     * eXtensible Markup Language format.
     * 
     */
    XMLF,

    /**
     * Electronic data interchange for administration, commerce and transport.
     * 
     */
    EDIF,

    /**
     * Comma separated value format.
     * 
     */
    CSVF,

    /**
     * Joint Photographic Experts Group format.
     * 
     */
    JPEG,

    /**
     * Portable Document Format.
     * 
     */
    PDFF,

    /**
     * Portable Network Graphics format.
     * 
     */
    PNGF,

    /**
     * Scalable vector graphic format.
     * 
     */
    SVGF;

    public String value() {
        return name();
    }

    public static OutputFormat5Code fromValue(String v) {
        return valueOf(v);
    }

}
