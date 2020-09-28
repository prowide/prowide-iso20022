
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaivingInstruction2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WaivingInstruction2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WICA"/&gt;
 *     &lt;enumeration value="WIUN"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
