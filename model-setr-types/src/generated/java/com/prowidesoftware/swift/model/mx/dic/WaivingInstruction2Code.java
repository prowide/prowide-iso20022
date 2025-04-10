
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaivingInstruction2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="WaivingInstruction2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WICA"/>
 *     <enumeration value="WIUN"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WaivingInstruction2Code")
@XmlEnum
public enum WaivingInstruction2Code {


    /**
     * Form of commission waived is cash.
     * 
     */
    WICA,

    /**
     * Form of commission waived is additional units of a financial instrument.
     * 
     */
    WIUN,

    /**
     * Another type of commission waiving.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static WaivingInstruction2Code fromValue(String v) {
        return valueOf(v);
    }

}
