
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommandReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMCommandReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DIAG"/>
 *     <enumeration value="MONI"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="SYNC"/>
 *     <enumeration value="UPDT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
