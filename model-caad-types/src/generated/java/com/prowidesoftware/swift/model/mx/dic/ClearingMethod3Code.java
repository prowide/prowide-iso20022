
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingMethod3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ClearingMethod3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DAYC"/>
 *     <enumeration value="DFRD"/>
 *     <enumeration value="INST"/>
 *     <enumeration value="RLTM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClearingMethod3Code")
@XmlEnum
public enum ClearingMethod3Code {


    /**
     * Day clearing.
     * 
     */
    DAYC,

    /**
     * Clearing to be deferred in time.
     * 
     */
    DFRD,

    /**
     * Clearing for instant payments and transfers.
     * 
     */
    INST,

    /**
     * Clearing done in real time.
     * 
     */
    RLTM;

    public String value() {
        return name();
    }

    public static ClearingMethod3Code fromValue(String v) {
        return valueOf(v);
    }

}
