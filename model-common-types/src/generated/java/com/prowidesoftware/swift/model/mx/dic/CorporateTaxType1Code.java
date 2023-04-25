
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateTaxType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateTaxType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SMBS"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="CORP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateTaxType1Code")
@XmlEnum
public enum CorporateTaxType1Code {


    /**
     * Small Business
     * 
     */
    SMBS,

    /**
     * Other
     * 
     */
    OTHR,

    /**
     * Corporate
     * 
     */
    CORP;

    public String value() {
        return name();
    }

    public static CorporateTaxType1Code fromValue(String v) {
        return valueOf(v);
    }

}
