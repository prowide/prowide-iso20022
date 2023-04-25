
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Eligible1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Eligible1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ELIG"/>
 *     <enumeration value="NELI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Eligible1Code")
@XmlEnum
public enum Eligible1Code {


    /**
     * Item is eligible.
     * 
     */
    ELIG,

    /**
     * Item is not eligible.
     * 
     */
    NELI;

    public String value() {
        return name();
    }

    public static Eligible1Code fromValue(String v) {
        return valueOf(v);
    }

}
