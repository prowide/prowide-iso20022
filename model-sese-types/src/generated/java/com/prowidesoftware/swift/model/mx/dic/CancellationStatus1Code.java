
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancellationStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STNP"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="CANP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancellationStatus1Code")
@XmlEnum
public enum CancellationStatus1Code {


    /**
     * Cancellation instruction/request has been sent to the next party, that is, the next intermediary.
     * 
     */
    STNP,

    /**
     * Cancellation instruction / request has been received and has been acknowledged / accepted for further processing.
     * 
     */
    PACK,

    /**
     * Cancellation instruction / request is pending. It is not known at this time whether cancellation can be effected.
     * 
     */
    CANP;

    public String value() {
        return name();
    }

    public static CancellationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
