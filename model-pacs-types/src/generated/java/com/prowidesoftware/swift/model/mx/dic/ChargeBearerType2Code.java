
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeBearerType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeBearerType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SLEV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeBearerType2Code")
@XmlEnum
public enum ChargeBearerType2Code {


    /**
     * Charges are to be applied following the rules agreed in the service level and/or scheme.
     * 
     */
    SLEV;

    public String value() {
        return name();
    }

    public static ChargeBearerType2Code fromValue(String v) {
        return valueOf(v);
    }

}
