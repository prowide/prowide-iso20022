
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessedStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProcessedStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RECE"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="PACK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProcessedStatus3Code")
@XmlEnum
public enum ProcessedStatus3Code {


    /**
     * The instruction/request has been received.
     * 
     */
    RECE,

    /**
     * The processing of the request is pending.
     * 
     */
    PEND,

    /**
     * The request is accepted.
     * 
     */
    PACK;

    public String value() {
        return name();
    }

    public static ProcessedStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
