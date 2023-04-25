
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaivingInstruction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="WaivingInstruction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WICA"/>
 *     <enumeration value="WIUN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WaivingInstruction1Code")
@XmlEnum
public enum WaivingInstruction1Code {


    /**
     * Form of commission waived is cash.
     * 
     */
    WICA,

    /**
     * Form of commission waived is additional units of a financial instrument.
     * 
     */
    WIUN;

    public String value() {
        return name();
    }

    public static WaivingInstruction1Code fromValue(String v) {
        return valueOf(v);
    }

}
