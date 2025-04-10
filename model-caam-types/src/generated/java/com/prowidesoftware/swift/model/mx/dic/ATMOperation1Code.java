
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMOperation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMOperation1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADJU"/>
 *     <enumeration value="INSR"/>
 *     <enumeration value="LOAD"/>
 *     <enumeration value="REMV"/>
 *     <enumeration value="UNLD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMOperation1Code")
@XmlEnum
public enum ATMOperation1Code {


    /**
     * Adjust logical counters of the cassette.
     * 
     */
    ADJU,

    /**
     * Add physically media to cassette.
     * 
     */
    INSR,

    /**
     * Loading cassette.
     * 
     */
    LOAD,

    /**
     * Substract physically media from cassette.
     * 
     */
    REMV,

    /**
     * Unloading cassette.
     * 
     */
    UNLD;

    public String value() {
        return name();
    }

    public static ATMOperation1Code fromValue(String v) {
        return valueOf(v);
    }

}
