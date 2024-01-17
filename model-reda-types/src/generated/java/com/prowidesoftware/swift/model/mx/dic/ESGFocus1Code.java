
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESGFocus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ESGFocus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ENVR"/>
 *     <enumeration value="GOVR"/>
 *     <enumeration value="SOCL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ESGFocus1Code")
@XmlEnum
public enum ESGFocus1Code {


    /**
     * Main focus will be environmental.
     * 
     */
    ENVR,

    /**
     * Main focus will be governance.
     * 
     */
    GOVR,

    /**
     * Main focus will be social.
     * 
     */
    SOCL;

    public String value() {
        return name();
    }

    public static ESGFocus1Code fromValue(String v) {
        return valueOf(v);
    }

}
