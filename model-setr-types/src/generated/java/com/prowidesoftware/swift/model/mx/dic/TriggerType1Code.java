
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TriggerType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PAEX"/>
 *     <enumeration value="SPTS"/>
 *     <enumeration value="NEAU"/>
 *     <enumeration value="PRMO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TriggerType1Code")
@XmlEnum
public enum TriggerType1Code {


    /**
     * Trigger Instructions come into effect in case of partial execution.
     * 
     */
    PAEX,

    /**
     * Trigger Instructions come into effect at specified trading session.
     * 
     */
    SPTS,

    /**
     * Trigger Instructions come into effect at next auction.
     * 
     */
    NEAU,

    /**
     * Trigger Instructions come into effect in case of price movement.
     * 
     */
    PRMO;

    public String value() {
        return name();
    }

    public static TriggerType1Code fromValue(String v) {
        return valueOf(v);
    }

}
