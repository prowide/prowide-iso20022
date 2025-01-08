
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quantity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Quantity1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="QALL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Quantity1Code")
@XmlEnum
public enum Quantity1Code {


    /**
     * Instruction applies to the entire eligible balance of underlying securities.
     * 
     */
    QALL;

    public String value() {
        return name();
    }

    public static Quantity1Code fromValue(String v) {
        return valueOf(v);
    }

}
