
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalStructure1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LegalStructure1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STAE"/>
 *     <enumeration value="PVIN"/>
 *     <enumeration value="MUNI"/>
 *     <enumeration value="CNTY"/>
 *     <enumeration value="NATI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LegalStructure1Code")
@XmlEnum
public enum LegalStructure1Code {


    /**
     * Legal structure is a state.
     * 
     */
    STAE,

    /**
     * Legal structure is a province.
     * 
     */
    PVIN,

    /**
     * Legal structure is a municipal.
     * 
     */
    MUNI,

    /**
     * Legal structure is a county.
     * 
     */
    CNTY,

    /**
     * Legal structure is a state.
     * 
     */
    NATI;

    public String value() {
        return name();
    }

    public static LegalStructure1Code fromValue(String v) {
        return valueOf(v);
    }

}
