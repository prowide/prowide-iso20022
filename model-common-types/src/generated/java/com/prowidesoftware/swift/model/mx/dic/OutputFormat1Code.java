
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFormat1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OutputFormat1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MREF"/>
 *     <enumeration value="TEXT"/>
 *     <enumeration value="HTML"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OutputFormat1Code")
@XmlEnum
public enum OutputFormat1Code {


    /**
     * Predefined configured messages, identified by a reference.
     * 
     */
    MREF,

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

    public static OutputFormat1Code fromValue(String v) {
        return valueOf(v);
    }

}
