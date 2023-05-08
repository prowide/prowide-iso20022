
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateMode1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DateMode1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BODY"/>
 *     <enumeration value="EODY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DateMode1Code")
@XmlEnum
public enum DateMode1Code {


    /**
     * Beginning of day.
     * 
     */
    BODY,

    /**
     * End of day.
     * 
     */
    EODY;

    public String value() {
        return name();
    }

    public static DateMode1Code fromValue(String v) {
        return valueOf(v);
    }

}
