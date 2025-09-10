
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMOperation2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMOperation2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADJU"/>
 *     <enumeration value="INSR"/>
 *     <enumeration value="LOAD"/>
 *     <enumeration value="REMV"/>
 *     <enumeration value="UNLD"/>
 *     <enumeration value="RCUP"/>
 *     <enumeration value="SWAP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMOperation2Code")
@XmlEnum
public enum ATMOperation2Code {


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
    UNLD,

    /**
     * Remotely updating an ATM counter.
     * 
     */
    RCUP,

    /**
     * Unload all cassettes, and load a new set of cassettes to replace these. The Cassette structures determines what was removed and what was added.
     * 
     */
    SWAP;

    public String value() {
        return name();
    }

    public static ATMOperation2Code fromValue(String v) {
        return valueOf(v);
    }

}
