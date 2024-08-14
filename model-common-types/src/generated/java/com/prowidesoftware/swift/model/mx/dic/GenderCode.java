
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenderCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GenderCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MALE"/>
 *     <enumeration value="FEMA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GenderCode")
@XmlEnum
public enum GenderCode {


    /**
     * Individual is a male.
     * 
     */
    MALE,

    /**
     * Individual is a female.
     * 
     */
    FEMA;

    public String value() {
        return name();
    }

    public static GenderCode fromValue(String v) {
        return valueOf(v);
    }

}
