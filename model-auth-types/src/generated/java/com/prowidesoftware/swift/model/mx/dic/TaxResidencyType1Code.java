
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxResidencyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxResidencyType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DMST"/>
 *     <enumeration value="FRGN"/>
 *     <enumeration value="MIXD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxResidencyType1Code")
@XmlEnum
public enum TaxResidencyType1Code {


    /**
     * Residency is domestic.
     * 
     */
    DMST,

    /**
     * Residency is foreign.
     * 
     */
    FRGN,

    /**
     * Residency is mixed.
     * 
     */
    MIXD;

    public String value() {
        return name();
    }

    public static TaxResidencyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
