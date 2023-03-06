
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancellationStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STNP"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancellationStatus2Code")
@XmlEnum
public enum CancellationStatus2Code {


    /**
     * Cancellation instruction/request has been sent to the next party, that is, the next intermediary.
     * 
     */
    STNP,

    /**
     * Cancellation instruction / request has been received and has been acknowledged / accepted for further processing.
     * 
     */
    PACK;

    public String value() {
        return name();
    }

    public static CancellationStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
