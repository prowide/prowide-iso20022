
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxIdentificationNumberType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxIdentificationNumberType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GIIN"/>
 *     <enumeration value="GTIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxIdentificationNumberType1Code")
@XmlEnum
public enum TaxIdentificationNumberType1Code {


    /**
     * Global intermediary tax identification number.
     * 
     */
    GIIN,

    /**
     * Tax identification number.
     * 
     */
    GTIN;

    public String value() {
        return name();
    }

    public static TaxIdentificationNumberType1Code fromValue(String v) {
        return valueOf(v);
    }

}
