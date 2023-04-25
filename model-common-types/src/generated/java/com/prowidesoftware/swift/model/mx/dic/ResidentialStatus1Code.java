
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResidentialStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResidentialStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RESI"/>
 *     <enumeration value="PRES"/>
 *     <enumeration value="NRES"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResidentialStatus1Code")
@XmlEnum
public enum ResidentialStatus1Code {


    /**
     * Resident.
     * 
     */
    RESI,

    /**
     * Permanent resident.
     * 
     */
    PRES,

    /**
     * Non-resident.
     * 
     */
    NRES;

    public String value() {
        return name();
    }

    public static ResidentialStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
