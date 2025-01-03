
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RetailerService4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SMIQ"/>
 *     <enumeration value="SMOQ"/>
 *     <enumeration value="SMDQ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RetailerService4Code")
@XmlEnum
public enum RetailerService4Code {


    /**
     * The Sale System requests a login to the POI System.
     * 
     */
    SMIQ,

    /**
     * The Sale System requests a logout to the POI System.
     * 
     */
    SMOQ,

    /**
     * The Sale System requests a session diagnosis to the POI System.
     * 
     */
    SMDQ;

    public String value() {
        return name();
    }

    public static RetailerService4Code fromValue(String v) {
        return valueOf(v);
    }

}
