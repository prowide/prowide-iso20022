
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPER"/>
 *     <enumeration value="STOP"/>
 *     <enumeration value="WACT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMStatus3Code")
@XmlEnum
public enum ATMStatus3Code {


    /**
     * Component is activated and in operation.
     * 
     */
    OPER,

    /**
     * Component has been stopped.
     * 
     */
    STOP,

    /**
     * Component has been loaded, but not yet activated.
     * 
     */
    WACT;

    public String value() {
        return name();
    }

    public static ATMStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
