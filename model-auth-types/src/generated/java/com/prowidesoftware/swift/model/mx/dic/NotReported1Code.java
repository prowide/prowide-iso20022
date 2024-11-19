
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotReported1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NotReported1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NORP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NotReported1Code")
@XmlEnum
public enum NotReported1Code {


    /**
     * Value not reported by the party.
     * 
     */
    NORP;

    public String value() {
        return name();
    }

    public static NotReported1Code fromValue(String v) {
        return valueOf(v);
    }

}
