
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReasonV021Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReasonV021Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="EVNM"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="ICOL"/&gt;
 *     &lt;enumeration value="CONL"/&gt;
 *     &lt;enumeration value="ELIG"/&gt;
 *     &lt;enumeration value="INID"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReasonV021Code")
@XmlEnum
public enum RejectionReasonV021Code {


    /**
     * Unrecognised or invalid financial instrument identification.
     * 
     */
    DSEC,

    /**
     * Unrecognised event number.
     * 
     */
    EVNM,

    /**
     * Financial instrument's symbol has not been recognized.
     * 
     */
    UKWN,

    /**
     * Insufficient collateral proposed.
     * 
     */
    ICOL,

    /**
     * Concentration limit was exceeded.
     * 
     */
    CONL,

    /**
     * Security is not eligible.
     * 
     */
    ELIG,

    /**
     * Instruction contains an invalid message identification, identification is unknown.
     * 
     */
    INID,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static RejectionReasonV021Code fromValue(String v) {
        return valueOf(v);
    }

}
