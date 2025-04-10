
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfRequest1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfRequest1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INFO"/>
 *     <enumeration value="STAT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfRequest1Code")
@XmlEnum
public enum TypeOfRequest1Code {


    /**
     * Request for information.
     * 
     */
    INFO,

    /**
     * Request for status.
     * 
     */
    STAT;

    public String value() {
        return name();
    }

    public static TypeOfRequest1Code fromValue(String v) {
        return valueOf(v);
    }

}
