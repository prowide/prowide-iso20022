
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDayConvention1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BusinessDayConvention1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FWNG"/>
 *     <enumeration value="PREC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BusinessDayConvention1Code")
@XmlEnum
public enum BusinessDayConvention1Code {


    /**
     * The date will be the first following day that is a business day.
     * 
     */
    FWNG,

    /**
     * The date will be the first preceding day that is a business day.
     * 
     */
    PREC;

    public String value() {
        return name();
    }

    public static BusinessDayConvention1Code fromValue(String v) {
        return valueOf(v);
    }

}
