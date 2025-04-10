
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferStatus3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COSE"/>
 *     <enumeration value="MACH"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="SETT"/>
 *     <enumeration value="STNP"/>
 *     <enumeration value="RECE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferStatus3Code")
@XmlEnum
public enum TransferStatus3Code {


    /**
     * Transfer or settlement instruction is fully executed and the confirmation is sent.
     * 
     */
    COSE,

    /**
     * Transfer or settlement instruction is matched.
     * 
     */
    MACH,

    /**
     * Transfer or settlement instruction has been acknowledged / accepted for further processing.
     * 
     */
    PACK,

    /**
     * Transfer or settlement instruction is settled.
     * 
     */
    SETT,

    /**
     * Transfer or settlement instruction has been sent to the next party, that is, the next intermediary.
     * 
     */
    STNP,

    /**
     * Instruction has been received, that is, technical validation of the message is ok, and the message is now at the receiving side.
     * 
     */
    RECE;

    public String value() {
        return name();
    }

    public static TransferStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
