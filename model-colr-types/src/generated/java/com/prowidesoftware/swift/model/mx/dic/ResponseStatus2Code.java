
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResponseStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONF"/>
 *     <enumeration value="DKNY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResponseStatus2Code")
@XmlEnum
public enum ResponseStatus2Code {


    /**
     * Collateral giver instruction details are confirmed.
     * 
     */
    CONF,

    /**
     * Collateral giver instruction details are not recognised.
     * 
     * 
     */
    DKNY;

    public String value() {
        return name();
    }

    public static ResponseStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
