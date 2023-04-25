
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DateType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DateType2Code")
@XmlEnum
public enum DateType2Code {


    /**
     * Open-dated, which indicates that the date has not been established.
     * 
     */
    OPEN;

    public String value() {
        return name();
    }

    public static DateType2Code fromValue(String v) {
        return valueOf(v);
    }

}
