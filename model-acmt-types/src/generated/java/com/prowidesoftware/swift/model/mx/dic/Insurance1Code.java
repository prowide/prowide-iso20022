
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Insurance1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Insurance1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LIFE"/>
 *     <enumeration value="PDIS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Insurance1Code")
@XmlEnum
public enum Insurance1Code {


    /**
     * Life insurance.
     * 
     */
    LIFE,

    /**
     * Permanent disability insurance.
     * 
     */
    PDIS;

    public String value() {
        return name();
    }

    public static Insurance1Code fromValue(String v) {
        return valueOf(v);
    }

}
