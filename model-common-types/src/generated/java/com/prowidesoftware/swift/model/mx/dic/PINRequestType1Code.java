
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINRequestType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PINRequestType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PIAE"/>
 *     <enumeration value="PIAV"/>
 *     <enumeration value="PIVO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PINRequestType1Code")
@XmlEnum
public enum PINRequestType1Code {


    /**
     * The cardholder enters the PIN, the POI enciphers the PIN Block and provides it as a result to the Sale System.
     * 
     */
    PIAE,

    /**
     * The Cardholder enters the PIN and the POI verifies it.
     * 
     */
    PIAV,

    /**
     * The Sale System send a previous keyed PIN and the POI verifies it.
     * 
     */
    PIVO;

    public String value() {
        return name();
    }

    public static PINRequestType1Code fromValue(String v) {
        return valueOf(v);
    }

}
