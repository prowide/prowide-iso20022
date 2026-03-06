
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationProcessingStatus3Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationProcessingStatus3Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANP"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="DEND"/>
 *     <enumeration value="CAND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationProcessingStatus3Code__1")
@XmlEnum
public enum CancellationProcessingStatus3Code1 {


    /**
     * Cancellation is pending. It is not known at this time whether cancellation can be affected.
     * 
     */
    CANP,

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

    public static CancellationProcessingStatus3Code1 fromValue(String v) {
        return valueOf(v);
    }

}
