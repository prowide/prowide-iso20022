
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetMarket3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TargetMarket3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YSCO"/>
 *     <enumeration value="NSCO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TargetMarket3Code")
@XmlEnum
public enum TargetMarket3Code {


    /**
     * Yes, is applicable.
     * 
     */
    YSCO,

    /**
     * No, is not applicable.
     * 
     */
    NSCO;

    public String value() {
        return name();
    }

    public static TargetMarket3Code fromValue(String v) {
        return valueOf(v);
    }

}
