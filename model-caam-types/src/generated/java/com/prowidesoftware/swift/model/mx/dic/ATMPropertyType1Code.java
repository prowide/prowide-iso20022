
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMPropertyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMPropertyType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STRG"/>
 *     <enumeration value="NMBR"/>
 *     <enumeration value="BOOL"/>
 *     <enumeration value="JSON"/>
 *     <enumeration value="CSVF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMPropertyType1Code")
@XmlEnum
public enum ATMPropertyType1Code {


    /**
     * The property is encoded as a String.
     * 
     */
    STRG,

    /**
     * The property is encoded as a Number.
     * 
     */
    NMBR,

    /**
     * The property is encoded as a Boolean.
     * 
     */
    BOOL,

    /**
     * The property is encoded in JSON.
     * 
     */
    JSON,

    /**
     * The property is a CSV string representing a table of data.
     * 
     */
    CSVF;

    public String value() {
        return name();
    }

    public static ATMPropertyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
