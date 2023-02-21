
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingInstructionGrossNet1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandingInstructionGrossNet1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GROS"/&gt;
 *     &lt;enumeration value="NETT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandingInstructionGrossNet1Code")
@XmlEnum
public enum StandingInstructionGrossNet1Code {


    /**
     * Gross payment.
     * 
     */
    GROS,

    /**
     * Net payment.
     * 
     */
    NETT;

    public String value() {
        return name();
    }

    public static StandingInstructionGrossNet1Code fromValue(String v) {
        return valueOf(v);
    }

}
