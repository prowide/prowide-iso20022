
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InformationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INST"/>
 *     <enumeration value="RELY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InformationType1Code")
@XmlEnum
public enum InformationType1Code {


    /**
     * Instructions used to ease automatic request processing.
     * 
     */
    INST,

    /**
     * Instructions used to ease automatic request relay.
     * 
     */
    RELY;

    public String value() {
        return name();
    }

    public static InformationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
