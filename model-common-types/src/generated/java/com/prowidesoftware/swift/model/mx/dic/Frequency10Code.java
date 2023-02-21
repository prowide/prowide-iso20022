
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Frequency10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEVR"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="RATE"/&gt;
 *     &lt;enumeration value="MIAN"/&gt;
 *     &lt;enumeration value="QURT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Frequency10Code")
@XmlEnum
public enum Frequency10Code {


    /**
     * Event does never take place.
     * 
     */
    NEVR,

    /**
     * Event takes place every year or once a year.
     * 
     */
    YEAR,

    /**
     * Event takes place based on a change of a rate.
     * 
     */
    RATE,

    /**
     * Event takes place every six months or two times a year.
     * 
     */
    MIAN,

    /**
     * Event takes place every three months or four times a year.
     * 
     */
    QURT;

    public String value() {
        return name();
    }

    public static Frequency10Code fromValue(String v) {
        return valueOf(v);
    }

}
