
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultDetail3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResultDetail3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRTU"/>
 *     <enumeration value="SVSU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResultDetail3Code")
@XmlEnum
public enum ResultDetail3Code {


    /**
     * The certificate is unknown.
     * 
     */
    CRTU,

    /**
     * Requested service not supported.
     * 
     */
    SVSU;

    public String value() {
        return name();
    }

    public static ResultDetail3Code fromValue(String v) {
        return valueOf(v);
    }

}
