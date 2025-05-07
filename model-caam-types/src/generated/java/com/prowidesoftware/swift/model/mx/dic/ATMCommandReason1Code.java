
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommandReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMCommandReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIAG"/&gt;
 *     &lt;enumeration value="MONI"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="SYNC"/&gt;
 *     &lt;enumeration value="UPDT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMCommandReason1Code")
@XmlEnum
public enum ATMCommandReason1Code {


    /**
     * Request the status of or action from the ATM to perform a diagnostic.
     * 
     */
    DIAG,

    /**
     * Supervise the ATM.
     * 
     */
    MONI,

    /**
     * Security error.
     * 
     */
    SECU,

    /**
     * Desynchronisation of dialogue between entities.
     * 
     */
    SYNC,

    /**
     * Update the ATM.
     * 
     */
    UPDT;

    public String value() {
        return name();
    }

    public static ATMCommandReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
