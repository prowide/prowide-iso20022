
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CustomerType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSMR"/>
 *     <enumeration value="CPNY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CustomerType2Code")
@XmlEnum
public enum CustomerType2Code {


    /**
     * Consumer
     * 
     */
    CSMR,

    /**
     * Company
     * 
     */
    CPNY;

    public String value() {
        return name();
    }

    public static CustomerType2Code fromValue(String v) {
        return valueOf(v);
    }

}
