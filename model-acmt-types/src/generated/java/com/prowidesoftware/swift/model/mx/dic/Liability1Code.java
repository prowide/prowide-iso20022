
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Liability1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Liability1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INVE"/>
 *     <enumeration value="BROK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Liability1Code")
@XmlEnum
public enum Liability1Code {


    /**
     * Investor is responsible.
     * 
     */
    INVE,

    /**
     * Broker is responsible.
     * 
     */
    BROK;

    public String value() {
        return name();
    }

    public static Liability1Code fromValue(String v) {
        return valueOf(v);
    }

}
