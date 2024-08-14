
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnLineCapability2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OnLineCapability2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OFLN"/>
 *     <enumeration value="ONLN"/>
 *     <enumeration value="BOTH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OnLineCapability2Code")
@XmlEnum
public enum OnLineCapability2Code {


    /**
     * Off-line only capable.
     * 
     */
    OFLN,

    /**
     * On-line only capable.
     * 
     */
    ONLN,

    /**
     * Both online and offline
     * 
     */
    BOTH;

    public String value() {
        return name();
    }

    public static OnLineCapability2Code fromValue(String v) {
        return valueOf(v);
    }

}
