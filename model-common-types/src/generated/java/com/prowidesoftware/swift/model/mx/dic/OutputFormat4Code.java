
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFormat4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputFormat4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FLNM"/&gt;
 *     &lt;enumeration value="MREF"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SMSI"/&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *     &lt;enumeration value="URLI"/&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
