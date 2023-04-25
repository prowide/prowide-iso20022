
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessedStatus6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProcessedStatus6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RECE"/>
 *     <enumeration value="DEAC"/>
 *     <enumeration value="COMP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProcessedStatus6Code")
@XmlEnum
public enum ProcessedStatus6Code {


    /**
     * The instruction/request has been received.
     * 
     */
    RECE,

    /**
     * Awaiting the deactivation date.
     * 
     */
    DEAC,

    /**
     * The request has been completed.
     * 
     */
    COMP;

    public String value() {
        return name();
    }

    public static ProcessedStatus6Code fromValue(String v) {
        return valueOf(v);
    }

}
