
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationStatus5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationStatus5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RECE"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="STNP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationStatus5Code")
@XmlEnum
public enum CancellationStatus5Code {


    /**
     * Cancellation instruction/request has been received, that is, technical validation of the message is ok, and the message is now at the receiving side.
     * 
     */
    RECE,

    /**
     * Cancellation instruction / request has been received and has been acknowledged / accepted for further processing.
     * 
     */
    PACK,

    /**
     * Cancellation instruction/request has been sent to the next party, that is, the next intermediary.
     * 
     */
    STNP;

    public String value() {
        return name();
    }

    public static CancellationStatus5Code fromValue(String v) {
        return valueOf(v);
    }

}
