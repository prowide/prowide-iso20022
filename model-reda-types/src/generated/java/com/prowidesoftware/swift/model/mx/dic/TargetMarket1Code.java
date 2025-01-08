
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetMarket1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TargetMarket1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YSCO"/>
 *     <enumeration value="NEUT"/>
 *     <enumeration value="NSCO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TargetMarket1Code")
@XmlEnum
public enum TargetMarket1Code {


    /**
     * Yes, is applicable.
     * 
     */
    YSCO,

    /**
     * Neutral or has no impact.
     * 
     */
    NEUT,

    /**
     * No, is not applicable.
     * 
     */
    NSCO;

    public String value() {
        return name();
    }

    public static TargetMarket1Code fromValue(String v) {
        return valueOf(v);
    }

}
