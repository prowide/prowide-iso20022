
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfPrice16Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MRKT"/>
 *     <enumeration value="INDC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfPrice16Code")
@XmlEnum
public enum TypeOfPrice16Code {


    /**
     * Price is the current market price.
     * 
     */
    MRKT,

    /**
     * Price is the estimated indicative price.
     * 
     */
    INDC;

    public String value() {
        return name();
    }

    public static TypeOfPrice16Code fromValue(String v) {
        return valueOf(v);
    }

}
