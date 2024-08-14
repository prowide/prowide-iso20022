
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RateType9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ANYA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RateType9Code")
@XmlEnum
public enum RateType9Code {


    /**
     * Any and all rate is sought.
     * 
     */
    ANYA;

    public String value() {
        return name();
    }

    public static RateType9Code fromValue(String v) {
        return valueOf(v);
    }

}
