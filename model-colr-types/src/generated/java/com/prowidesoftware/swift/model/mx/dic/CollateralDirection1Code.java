
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralDirection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralDirection1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CDPA"/>
 *     <enumeration value="CDPB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralDirection1Code")
@XmlEnum
public enum CollateralDirection1Code {


    /**
     * Collateral is due to party A.
     * 
     * 
     */
    CDPA,

    /**
     * Collateral is due to party B.
     * 
     */
    CDPB;

    public String value() {
        return name();
    }

    public static CollateralDirection1Code fromValue(String v) {
        return valueOf(v);
    }

}
