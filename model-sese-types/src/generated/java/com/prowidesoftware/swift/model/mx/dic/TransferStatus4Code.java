
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferStatus4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferStatus4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PACK"/>
 *     <enumeration value="COSE"/>
 *     <enumeration value="MACH"/>
 *     <enumeration value="RECE"/>
 *     <enumeration value="STNP"/>
 *     <enumeration value="SETT"/>
 *     <enumeration value="COMP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferStatus4Code")
@XmlEnum
public enum TransferStatus4Code {


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
    SETT,

    /**
     * Portfolio transfer is complete.
     * 
     */
    COMP;

    public String value() {
        return name();
    }

    public static TransferStatus4Code fromValue(String v) {
        return valueOf(v);
    }

}
