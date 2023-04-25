
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ClearingMethod2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DAYC"/>
 *     <enumeration value="DFRD"/>
 *     <enumeration value="INST"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="RLTM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClearingMethod2Code")
@XmlEnum
public enum ClearingMethod2Code {


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
     * Other type of clearing method defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of clearing method defined at private level.
     * 
     */
    OTHP,

    /**
     * Clearing done in real time.
     * 
     */
    RLTM;

    public String value() {
        return name();
    }

    public static ClearingMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
