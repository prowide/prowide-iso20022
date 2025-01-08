
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResourceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TEXT"/>
 *     <enumeration value="URLI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResourceType1Code")
@XmlEnum
public enum ResourceType1Code {


    /**
     * Voice synthesis.
     * 
     */
    TEXT,

    /**
     * String of characters that unambiguously identifies a particular resource.
     * 
     */
    URLI;

    public String value() {
        return name();
    }

    public static ResourceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
