
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationalStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OperationalStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ENAB"/>
 *     <enumeration value="SPEC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OperationalStatus1Code")
@XmlEnum
public enum OperationalStatus1Code {


    /**
     * Enabled.
     * 
     */
    ENAB,

    /**
     * Special circumstances.
     * 
     */
    SPEC;

    public String value() {
        return name();
    }

    public static OperationalStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
