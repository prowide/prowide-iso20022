
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NCAN"/&gt;
 *     &lt;enumeration value="LATT"/&gt;
 *     &lt;enumeration value="ELEC"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason9Code")
@XmlEnum
public enum RejectionReason9Code {


    /**
     * Cancellation is not allowed.
     * 
     */
    NCAN,

    /**
     * Instruction/Request arrives too late.
     * 
     */
    LATT,

    /**
     * The election advice is already cancelled.
     * 
     */
    ELEC,

    /**
     * The validation of the advice/instruction/request failed.
     * 
     */
    FAIL;

    public String value() {
        return name();
    }

    public static RejectionReason9Code fromValue(String v) {
        return valueOf(v);
    }

}
