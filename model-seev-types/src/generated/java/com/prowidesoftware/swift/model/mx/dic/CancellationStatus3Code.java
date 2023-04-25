
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PACK"/>
 *     <enumeration value="CANP"/>
 *     <enumeration value="CAND"/>
 *     <enumeration value="RCIS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationStatus3Code")
@XmlEnum
public enum CancellationStatus3Code {


    /**
     * Cancellation instruction / request has been received and has been acknowledged / accepted for further processing.
     * 
     */
    PACK,

    /**
     * Cancellation instruction / request is pending. It is not known at this time whether cancellation can be effected.
     * 
     */
    CANP,

    /**
     * Cancellation instruction / request has been accepted and processed, the cancellation is complete.
     * 
     */
    CAND,

    /**
     * Cancellation instruction / request has been received by issuer or registrar.
     * 
     */
    RCIS;

    public String value() {
        return name();
    }

    public static CancellationStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
