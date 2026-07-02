
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINRequestType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PINRequestType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PIAE"/&gt;
 *     &lt;enumeration value="PIAV"/&gt;
 *     &lt;enumeration value="PIVO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
