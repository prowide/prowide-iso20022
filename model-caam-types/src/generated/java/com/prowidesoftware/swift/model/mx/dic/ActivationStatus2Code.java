
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivationStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActivationStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WACT"/>
 *     <enumeration value="FAIL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActivationStatus2Code")
@XmlEnum
public enum ActivationStatus2Code {


    /**
     * The configuration download was successful and is now awaiting a future activation date.
     * 
     */
    WACT,

    /**
     * The configuration update has failed.
     * 
     */
    FAIL;

    public String value() {
        return name();
    }

    public static ActivationStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
