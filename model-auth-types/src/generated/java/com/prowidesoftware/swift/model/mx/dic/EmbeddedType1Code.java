
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmbeddedType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EmbeddedType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANC"/>
 *     <enumeration value="EXTD"/>
 *     <enumeration value="OPET"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="MDET"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EmbeddedType1Code")
@XmlEnum
public enum EmbeddedType1Code {


    /**
     * Option can be cancelled.
     * 
     */
    CANC,

    /**
     * Option can be extended.
     * 
     */
    EXTD,

    /**
     * Option can be early terminated.
     * 
     */
    OPET,

    /**
     * Option type is other.
     * 
     */
    OTHR,

    /**
     * Option must be early terminated.
     * 
     */
    MDET;

    public String value() {
        return name();
    }

    public static EmbeddedType1Code fromValue(String v) {
        return valueOf(v);
    }

}
