
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenounceableStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RenounceableStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NREN"/>
 *     <enumeration value="RENO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RenounceableStatus1Code")
@XmlEnum
public enum RenounceableStatus1Code {


    /**
     * Intermediate securities cannot be sold.
     * 
     */
    NREN,

    /**
     * Intermediate securities can be sold.
     * 
     */
    RENO;

    public String value() {
        return name();
    }

    public static RenounceableStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
