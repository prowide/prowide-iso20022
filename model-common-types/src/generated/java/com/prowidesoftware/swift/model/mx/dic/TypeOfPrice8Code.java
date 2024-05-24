
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TypeOfPrice8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeOfPrice8Code")
@XmlEnum
public enum TypeOfPrice8Code {


    /**
     * True offer price.
     * 
     */
    ACTU;

    public String value() {
        return name();
    }

    public static TypeOfPrice8Code fromValue(String v) {
        return valueOf(v);
    }

}
