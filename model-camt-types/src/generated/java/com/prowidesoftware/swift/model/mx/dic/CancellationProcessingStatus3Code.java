
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationProcessingStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancellationProcessingStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANP"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="REPR"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="DEND"/&gt;
 *     &lt;enumeration value="CAND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
