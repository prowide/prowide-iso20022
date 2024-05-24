
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationRejectedReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CancellationRejectedReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CUTO"/>
 *     <enumeration value="COSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CancellationRejectedReason1Code")
@XmlEnum
public enum CancellationRejectedReason1Code {


    /**
     * Instruction has been received after the cut-off time.
     * 
     */
    CUTO,

    /**
     * Order or transfer has already been executed and confirmation has been sent.
     * 
     */
    COSE;

    public String value() {
        return name();
    }

    public static CancellationRejectedReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
