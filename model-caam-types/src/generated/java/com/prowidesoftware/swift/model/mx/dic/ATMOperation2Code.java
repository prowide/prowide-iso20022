
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMOperation2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMOperation2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADJU"/&gt;
 *     &lt;enumeration value="INSR"/&gt;
 *     &lt;enumeration value="LOAD"/&gt;
 *     &lt;enumeration value="REMV"/&gt;
 *     &lt;enumeration value="UNLD"/&gt;
 *     &lt;enumeration value="RCUP"/&gt;
 *     &lt;enumeration value="SWAP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
