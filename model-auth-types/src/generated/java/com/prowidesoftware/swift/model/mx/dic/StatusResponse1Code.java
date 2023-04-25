
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusResponse1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StatusResponse1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NRES"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="COMP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StatusResponse1Code")
@XmlEnum
public enum StatusResponse1Code {


    /**
     * Response not provided yet.
     * 
     */
    NRES,

    /**
     * Response is partially provided.
     * 
     */
    PART,

    /**
     * Response is complete.
     * 
     */
    COMP;

    public String value() {
        return name();
    }

    public static StatusResponse1Code fromValue(String v) {
        return valueOf(v);
    }

}
