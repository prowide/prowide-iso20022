
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConversionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FINL"/>
 *     <enumeration value="INTE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConversionType1Code")
@XmlEnum
public enum ConversionType1Code {


    /**
     * This is a final conversion.
     * 
     */
    FINL,

    /**
     * This is an interim conversion.
     * 
     */
    INTE;

    public String value() {
        return name();
    }

    public static ConversionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
