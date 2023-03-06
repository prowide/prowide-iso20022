
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingInstructionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandingInstructionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="PAYM"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandingInstructionType1Code")
@XmlEnum
public enum StandingInstructionType1Code {


    /**
     * Standing instruction for a cash distribution.
     * 
     */
    CASH,

    /**
     * Standing instruction for the payment modality, gross or net.
     * 
     */
    PAYM,

    /**
     * Standing instruction for a securities distribution.
     * 
     */
    SECU;

    public String value() {
        return name();
    }

    public static StandingInstructionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
