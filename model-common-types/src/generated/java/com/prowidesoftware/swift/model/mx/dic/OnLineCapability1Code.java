
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnLineCapability1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OnLineCapability1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OFLN"/>
 *     <enumeration value="ONLN"/>
 *     <enumeration value="SMON"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OnLineCapability1Code")
@XmlEnum
public enum OnLineCapability1Code {


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
     * Off-line capable with possible on-line requests to the acquirer.
     * 
     */
    SMON;

    public String value() {
        return name();
    }

    public static OnLineCapability1Code fromValue(String v) {
        return valueOf(v);
    }

}
