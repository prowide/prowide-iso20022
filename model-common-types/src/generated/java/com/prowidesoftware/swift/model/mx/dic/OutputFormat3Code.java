
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFormat3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OutputFormat3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BARC"/>
 *     <enumeration value="MENT"/>
 *     <enumeration value="MREF"/>
 *     <enumeration value="SREF"/>
 *     <enumeration value="TEXT"/>
 *     <enumeration value="HTML"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
