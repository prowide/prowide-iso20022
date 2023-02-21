
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateMode1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateMode1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BODY"/&gt;
 *     &lt;enumeration value="EODY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateMode1Code")
@XmlEnum
public enum DateMode1Code {


    /**
     * Beginning of day.
     * 
     */
    BODY,

    /**
     * End of day.
     * 
     */
    EODY;

    public String value() {
        return name();
    }

    public static DateMode1Code fromValue(String v) {
        return valueOf(v);
    }

}
