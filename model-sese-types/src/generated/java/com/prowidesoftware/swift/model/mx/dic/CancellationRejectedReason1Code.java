
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationRejectedReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancellationRejectedReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUTO"/&gt;
 *     &lt;enumeration value="COSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
