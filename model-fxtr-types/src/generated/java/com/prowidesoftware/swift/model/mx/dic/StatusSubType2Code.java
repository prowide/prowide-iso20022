
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusSubType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusSubType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SMDY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusSubType2Code")
@XmlEnum
public enum StatusSubType2Code {


    /**
     * Same day flag has been set to true for the sub status of the trade notification.
     * 
     */
    SMDY;

    public String value() {
        return name();
    }

    public static StatusSubType2Code fromValue(String v) {
        return valueOf(v);
    }

}
