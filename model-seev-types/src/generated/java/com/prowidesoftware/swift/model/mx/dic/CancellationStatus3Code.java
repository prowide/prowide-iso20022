
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancellationStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="CANP"/&gt;
 *     &lt;enumeration value="CAND"/&gt;
 *     &lt;enumeration value="RCIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
