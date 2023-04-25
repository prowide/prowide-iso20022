
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPER"/>
 *     <enumeration value="OUTS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMStatus2Code")
@XmlEnum
public enum ATMStatus2Code {


    /**
     * Component is activated and in operation.
     * 
     */
    OPER,

    /**
     * ATM out of service.
     * 
     */
    OUTS;

    public String value() {
        return name();
    }

    public static ATMStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
