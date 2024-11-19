
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafekeepingPlace3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SafekeepingPlace3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SHHE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SafekeepingPlace3Code")
@XmlEnum
public enum SafekeepingPlace3Code {


    /**
     * Used for certain financial instruments, for example, US mutual funds, where settlement is internal only, that is, there is no external movement of securities.
     * 
     */
    SHHE;

    public String value() {
        return name();
    }

    public static SafekeepingPlace3Code fromValue(String v) {
        return valueOf(v);
    }

}
