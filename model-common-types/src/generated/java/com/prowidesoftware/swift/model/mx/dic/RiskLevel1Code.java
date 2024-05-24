
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskLevel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RiskLevel1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HIGH"/>
 *     <enumeration value="LOWW"/>
 *     <enumeration value="MEDM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RiskLevel1Code")
@XmlEnum
public enum RiskLevel1Code {


    /**
     * High.
     * 
     */
    HIGH,

    /**
     * Low.
     * 
     */
    LOWW,

    /**
     * Medium.
     * 
     */
    MEDM;

    public String value() {
        return name();
    }

    public static RiskLevel1Code fromValue(String v) {
        return valueOf(v);
    }

}
