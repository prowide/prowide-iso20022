
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RetailerService5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SMIP"/>
 *     <enumeration value="SMOP"/>
 *     <enumeration value="SMDP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RetailerService5Code")
@XmlEnum
public enum RetailerService5Code {


    /**
     * The POI System responds to a login request.
     * 
     */
    SMIP,

    /**
     * The POI System responds to a logout request.
     * 
     */
    SMOP,

    /**
     * The POI System responds to a diagnosis request.
     * 
     */
    SMDP;

    public String value() {
        return name();
    }

    public static RetailerService5Code fromValue(String v) {
        return valueOf(v);
    }

}
