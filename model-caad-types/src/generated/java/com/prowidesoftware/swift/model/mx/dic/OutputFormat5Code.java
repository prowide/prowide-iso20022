
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFormat5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputFormat5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *     &lt;enumeration value="URLI"/&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *     &lt;enumeration value="PLIN"/&gt;
 *     &lt;enumeration value="JSON"/&gt;
 *     &lt;enumeration value="XMLF"/&gt;
 *     &lt;enumeration value="EDIF"/&gt;
 *     &lt;enumeration value="CSVF"/&gt;
 *     &lt;enumeration value="JPEG"/&gt;
 *     &lt;enumeration value="PDFF"/&gt;
 *     &lt;enumeration value="PNGF"/&gt;
 *     &lt;enumeration value="SVGF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
