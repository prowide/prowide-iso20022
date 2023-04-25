
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PutType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PutType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MAND"/>
 *     <enumeration value="OPTI"/>
 *     <enumeration value="TWOS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PutType1Code")
@XmlEnum
public enum PutType1Code {


    /**
     * Type of execution of the put feature is mandatory.
     * 
     */
    MAND,

    /**
     * Type of execution of the put feature is optional.
     * 
     */
    OPTI,

    /**
     * Type of execution of the put feature could be optional or mandatory.
     * 
     */
    TWOS;

    public String value() {
        return name();
    }

    public static PutType1Code fromValue(String v) {
        return valueOf(v);
    }

}
