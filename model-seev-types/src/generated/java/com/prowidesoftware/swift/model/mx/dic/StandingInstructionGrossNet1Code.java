
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingInstructionGrossNet1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StandingInstructionGrossNet1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GROS"/>
 *     <enumeration value="NETT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
