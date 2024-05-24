
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerAction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TriggerAction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTI"/>
 *     <enumeration value="MODI"/>
 *     <enumeration value="CANC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TriggerAction1Code")
@XmlEnum
public enum TriggerAction1Code {


    /**
     * Trigger action is activate.
     * 
     */
    ACTI,

    /**
     * Trigger action is modify.
     * 
     */
    MODI,

    /**
     * Trigger action is cancel.
     * 
     */
    CANC;

    public String value() {
        return name();
    }

    public static TriggerAction1Code fromValue(String v) {
        return valueOf(v);
    }

}
