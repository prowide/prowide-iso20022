
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutingType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RoutingType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALLO"/>
 *     <enumeration value="BLOC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RoutingType1Code")
@XmlEnum
public enum RoutingType1Code {


    /**
     * Indicates that routing is allowed.
     * 
     */
    ALLO,

    /**
     * Indicates that routing is blocked.
     * 
     */
    BLOC;

    public String value() {
        return name();
    }

    public static RoutingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
