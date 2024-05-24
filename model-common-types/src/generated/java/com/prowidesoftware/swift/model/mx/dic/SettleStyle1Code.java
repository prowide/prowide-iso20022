
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettleStyle1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettleStyle1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SETC"/>
 *     <enumeration value="SETO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettleStyle1Code")
@XmlEnum
public enum SettleStyle1Code {


    /**
     * Settlement is only allowed on the closing of the future contract.
     * 
     */
    SETC,

    /**
     * Settlement is only allowed on the opening of the future contract.
     * 
     */
    SETO;

    public String value() {
        return name();
    }

    public static SettleStyle1Code fromValue(String v) {
        return valueOf(v);
    }

}
