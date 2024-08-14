
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResolutionSubStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResolutionSubStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMDR"/>
 *     <enumeration value="NEWR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResolutionSubStatus1Code")
@XmlEnum
public enum ResolutionSubStatus1Code {


    /**
     * Resolution voted at the meeting was amended.
     * 
     */
    AMDR,

    /**
     * Resolution voted at the meeting is new. 
     * 
     */
    NEWR;

    public String value() {
        return name();
    }

    public static ResolutionSubStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
