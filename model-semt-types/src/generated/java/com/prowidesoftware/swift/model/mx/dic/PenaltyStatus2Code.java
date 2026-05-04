
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PenaltyStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="NCOM"/>
 *     <enumeration value="REMO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PenaltyStatus2Code")
@XmlEnum
public enum PenaltyStatus2Code {


    /**
     * Penalty is active for the party.
     * 
     */
    ACTV,

    /**
     * Penalty could not be computed.
     * 
     */
    NCOM,

    /**
     * Removal of a cash penalty where settlement cannot be performed for reasons that are independent from any of the CSD participants or the CSD.
     * 
     */
    REMO;

    public String value() {
        return name();
    }

    public static PenaltyStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
