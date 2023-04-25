
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionAvailabilityStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OptionAvailabilityStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INTV"/>
 *     <enumeration value="CANC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionAvailabilityStatus1Code")
@XmlEnum
public enum OptionAvailabilityStatus1Code {


    /**
     * Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, for example, expired option.
     * 
     */
    INTV,

    /**
     * Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required.
     * 
     */
    CANC;

    public String value() {
        return name();
    }

    public static OptionAvailabilityStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
