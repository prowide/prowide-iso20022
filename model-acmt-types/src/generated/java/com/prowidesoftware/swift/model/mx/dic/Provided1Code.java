
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Provided1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Provided1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NPRO"/>
 *     <enumeration value="PROV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Provided1Code")
@XmlEnum
public enum Provided1Code {


    /**
     * Not provided.
     * 
     */
    NPRO,

    /**
     * Provided.
     * 
     */
    PROV;

    public String value() {
        return name();
    }

    public static Provided1Code fromValue(String v) {
        return valueOf(v);
    }

}
