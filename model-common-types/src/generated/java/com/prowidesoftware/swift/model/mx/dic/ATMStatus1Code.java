
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INSV"/>
 *     <enumeration value="OUTS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMStatus1Code")
@XmlEnum
public enum ATMStatus1Code {


    /**
     * Component is in service.
     * 
     */
    INSV,

    /**
     * ATM out of service.
     * 
     */
    OUTS;

    public String value() {
        return name();
    }

    public static ATMStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
