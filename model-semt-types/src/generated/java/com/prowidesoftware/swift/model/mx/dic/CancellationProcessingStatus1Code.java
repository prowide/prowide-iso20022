
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationProcessingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationProcessingStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAND"/>
 *     <enumeration value="CANP"/>
 *     <enumeration value="DEND"/>
 *     <enumeration value="EXCH"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="PARF"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="REPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationProcessingStatus1Code")
@XmlEnum
public enum CancellationProcessingStatus1Code {


    /**
     * Cancellation has been completed.
     * 
     */
    CAND,

    /**
     * Cancellation is pending. It is not known at this time whether cancellation can be affected.
     * 
     */
    CANP,

    /**
     * Cancellation will not be executed.
     * 
     */
    DEND,

    /**
     * Cancellation has been received at the stock exchange.
     * 
     */
    EXCH,

    /**
     * Cancellation has been received at the intermediary.
     * 
     */
    INTE,

    /**
     * Cancellation request has been acknowledged for further processing by the account servicer.
     * 
     */
    PACK,

    /**
     * Order is partially filled, cancellation processing accepted for the remainder.
     * 
     */
    PARF,

    /**
     * Cancellation has been rejected for further processing.
     * 
     */
    REJT,

    /**
     * Cancellation request is in repair.
     * 
     */
    REPR;

    public String value() {
        return name();
    }

    public static CancellationProcessingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
