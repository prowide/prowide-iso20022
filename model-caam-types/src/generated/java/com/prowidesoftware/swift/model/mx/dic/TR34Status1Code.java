
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TR34Status1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TR34Status1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUND"/>
 *     <enumeration value="UBND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TR34Status1Code")
@XmlEnum
public enum TR34Status1Code {


    /**
     * The device is bound.
     * 
     */
    BUND,

    /**
     * The device is unbound.
     * 
     */
    UBND;

    public String value() {
        return name();
    }

    public static TR34Status1Code fromValue(String v) {
        return valueOf(v);
    }

}
