
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferStatus4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferStatus4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="COSE"/&gt;
 *     &lt;enumeration value="MACH"/&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="STNP"/&gt;
 *     &lt;enumeration value="SETT"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
