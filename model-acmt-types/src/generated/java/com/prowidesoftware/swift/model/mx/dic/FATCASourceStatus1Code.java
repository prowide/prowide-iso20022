
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FATCASourceStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FATCASourceStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CALC"/>
 *     <enumeration value="DECL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FATCASourceStatus1Code")
@XmlEnum
public enum FATCASourceStatus1Code {


    /**
     * Source of the Foreign Account Tax Compliance Act (FATCA) status calculated.
     * 
     */
    CALC,

    /**
     * Source of the Foreign Account Tax Compliance Act (FATCA) status is as declared by the investor.
     * 
     */
    DECL;

    public String value() {
        return name();
    }

    public static FATCASourceStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
