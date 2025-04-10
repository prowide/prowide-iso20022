
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSCResult1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CSCResult1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CMCH"/>
 *     <enumeration value="CNMH"/>
 *     <enumeration value="CNMT"/>
 *     <enumeration value="CNMO"/>
 *     <enumeration value="CMSS"/>
 *     <enumeration value="CNUS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CSCResult1Code")
@XmlEnum
public enum CSCResult1Code {


    /**
     * Card security code match.
     * 
     */
    CMCH,

    /**
     * No card security code match.
     * 
     */
    CNMH,

    /**
     * Card security code not processed for technical reason.
     * 
     */
    CNMT,

    /**
     * Card security code not processed for non-technical reason.
     * 
     */
    CNMO,

    /**
     * Card security code missing in request.
     * 
     */
    CMSS,

    /**
     * Card security code not used by issuer.
     * 
     */
    CNUS;

    public String value() {
        return name();
    }

    public static CSCResult1Code fromValue(String v) {
        return valueOf(v);
    }

}
