
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingPosition5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProcessingPosition5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INFO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProcessingPosition5Code")
@XmlEnum
public enum ProcessingPosition5Code {


    /**
     * Specifies that the transactions/instructions are linked for information purposes only.
     * 
     */
    INFO;

    public String value() {
        return name();
    }

    public static ProcessingPosition5Code fromValue(String v) {
        return valueOf(v);
    }

}
