
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rank1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Rank1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIM"/>
 *     <enumeration value="SECO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Rank1Code")
@XmlEnum
public enum Rank1Code {


    /**
     * Element is the primary one.
     * 
     */
    PRIM,

    /**
     * Element is the primary one.
     * 
     */
    SECO;

    public String value() {
        return name();
    }

    public static Rank1Code fromValue(String v) {
        return valueOf(v);
    }

}
