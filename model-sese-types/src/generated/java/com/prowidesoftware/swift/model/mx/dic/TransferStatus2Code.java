
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="STNP"/&gt;
 *     &lt;enumeration value="MACH"/&gt;
 *     &lt;enumeration value="COSE"/&gt;
 *     &lt;enumeration value="SETT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferStatus2Code")
@XmlEnum
public enum TransferStatus2Code {


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
     * Transfer or settlement instruction is settled.
     * 
     */
    SETT;

    public String value() {
        return name();
    }

    public static TransferStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
