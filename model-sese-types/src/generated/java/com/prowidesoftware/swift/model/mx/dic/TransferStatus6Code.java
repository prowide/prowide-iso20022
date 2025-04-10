
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferStatus6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferStatus6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PACK"/>
 *     <enumeration value="COSE"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="DELY"/>
 *     <enumeration value="MACH"/>
 *     <enumeration value="RECE"/>
 *     <enumeration value="STNP"/>
 *     <enumeration value="SETT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferStatus6Code")
@XmlEnum
public enum TransferStatus6Code {


    /**
     * Transfer or settlement instruction has been acknowledged / accepted for further processing.
     * 
     */
    PACK,

    /**
     * Transfer or settlement instruction is fully executed and the confirmation is sent.
     * 
     */
    COSE,

    /**
     * Portfolio transfer is complete.
     * 
     */
    COMP,

    /**
     * Transfer or settlement instruction is delayed.
     * 
     */
    DELY,

    /**
     * Transfer or settlement instruction is matched.
     * 
     */
    MACH,

    /**
     * Instruction has been received, that is, technical validation of the message is ok, and the message is now at the receiving side.
     * 
     */
    RECE,

    /**
     * Transfer or settlement instruction has been sent to the next party, that is, the next intermediary.
     * 
     */
    STNP,

    /**
     * Transfer or settlement instruction is settled.
     * 
     */
    SETT;

    public String value() {
        return name();
    }

    public static TransferStatus6Code fromValue(String v) {
        return valueOf(v);
    }

}
