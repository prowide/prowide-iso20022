
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFormat3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputFormat3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BARC"/&gt;
 *     &lt;enumeration value="MENT"/&gt;
 *     &lt;enumeration value="MREF"/&gt;
 *     &lt;enumeration value="SREF"/&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OutputFormat3Code")
@XmlEnum
public enum OutputFormat3Code {


    /**
     * Barcode to output in several possible format.
     * 
     */
    BARC,

    /**
     * A text to display as a menu before requesting an input.
     * 
     */
    MENT,

    /**
     * Predefined configured messages, identified by a reference.
     * 
     */
    MREF,

    /**
     * Screen to display identified by a reference.
     * 
     */
    SREF,

    /**
     * Text without format attributes.
     * 
     */
    TEXT,

    /**
     * XHTML document which includes a subset of the XHTML output tag.
     * 
     */
    HTML;

    public String value() {
        return name();
    }

    public static OutputFormat3Code fromValue(String v) {
        return valueOf(v);
    }

}
