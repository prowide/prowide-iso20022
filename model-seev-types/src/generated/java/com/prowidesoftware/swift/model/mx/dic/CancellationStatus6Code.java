
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationStatus6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancellationStatus6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="CAND"/&gt;
 *     &lt;enumeration value="RCIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancellationStatus6Code")
@XmlEnum
public enum CancellationStatus6Code {


    /**
     * Cancellation instruction / request has been received and has been acknowledged / accepted for further processing.
     * 
     */
    PACK,

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

    public static CancellationStatus6Code fromValue(String v) {
        return valueOf(v);
    }

}
