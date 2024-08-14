
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnyMIC1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AnyMIC1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ANYM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AnyMIC1Code")
@XmlEnum
public enum AnyMIC1Code {


    /**
     * Any MIC code.
     * 
     */
    ANYM;

    public String value() {
        return name();
    }

    public static AnyMIC1Code fromValue(String v) {
        return valueOf(v);
    }

}
