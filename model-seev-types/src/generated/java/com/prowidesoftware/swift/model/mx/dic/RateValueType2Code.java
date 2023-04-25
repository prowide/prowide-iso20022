
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateValueType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RateValueType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UKWN"/>
 *     <enumeration value="OPEN"/>
 *     <enumeration value="NILP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RateValueType2Code")
@XmlEnum
public enum RateValueType2Code {


    /**
     * Rate is unknown by the sender or has not been established.
     * 
     */
    UKWN,

    /**
     * Rate has not been established.
     * 
     */
    OPEN,

    /**
     * Rate will not be paid.
     * 
     */
    NILP;

    public String value() {
        return name();
    }

    public static RateValueType2Code fromValue(String v) {
        return valueOf(v);
    }

}
