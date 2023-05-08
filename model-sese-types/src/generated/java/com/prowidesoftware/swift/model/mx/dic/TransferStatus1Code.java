
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PACK"/>
 *     <enumeration value="STNP"/>
 *     <enumeration value="MACH"/>
 *     <enumeration value="COSE"/>
 *     <enumeration value="CANP"/>
 *     <enumeration value="RVSD"/>
 *     <enumeration value="CAND"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferStatus1Code")
@XmlEnum
public enum TransferStatus1Code {


    /**
     * Transfer or settlement instruction has been acknowledged / accepted for further processing.
     * 
     */
    PACK,

    /**
     * Transfer or settlement instruction has been sent to the next party, that is, the next intermediary.
     * 
     */
    STNP,

    /**
     * Transfer or settlement instruction is matched.
     * 
     */
    MACH,

    /**
     * Transfer or settlement instruction is fully executed and the confirmation is sent.
     * 
     */
    COSE,

    /**
     * Transfer cancellation instruction or settlement cancellation instruction is pending.
     * 
     */
    CANP,

    /**
     * Transfer or settlement instruction has been executed, confirmed and then the confirmation has been reversed.
     * 
     */
    RVSD,

    /**
     * Transfer or settlement instruction has been cancelled.
     * 
     */
    CAND;

    public String value() {
        return name();
    }

    public static TransferStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
