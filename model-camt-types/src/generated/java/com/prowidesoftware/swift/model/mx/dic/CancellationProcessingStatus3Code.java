
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationProcessingStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationProcessingStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANP"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="REPR"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="DEND"/>
 *     <enumeration value="CAND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationProcessingStatus3Code")
@XmlEnum
public enum CancellationProcessingStatus3Code {


    /**
     * Cancellation is pending. It is not known at this time whether cancellation can be affected.
     * 
     */
    CANP,

    /**
     * Cancellation has been rejected for further processing.
     * 
     */
    REJT,

    /**
     * Cancellation request is in repair.
     * 
     */
    REPR,

    /**
     * Cancellation request has been acknowledged for further processing by the account servicer.
     * 
     */
    PACK,

    /**
     * Cancellation will not be executed.
     * 
     */
    DEND,

    /**
     * Cancellation has been completed.
     * 
     */
    CAND;

    public String value() {
        return name();
    }

    public static CancellationProcessingStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
