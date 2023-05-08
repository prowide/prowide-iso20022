
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PenaltyType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LMFP"/>
 *     <enumeration value="SEFP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PenaltyType1Code")
@XmlEnum
public enum PenaltyType1Code {


    /**
     * Applies from the intended settlement date until the matching date.
     * The penalty is charged to the participant who was last to enter or modify the relevant settlement instruction (for example, "accepted timestamp" is later than the one of the counterparty's instruction) for the periods between the intended settlement date and the day of matching of the instruction.
     * 
     */
    LMFP,

    /**
     * Penalties apply to instructions that fail to settle on the intended settlement date. A settlement instruction that "fails to settle on that business day" must be understood as a settlement instruction that is not cancelled and remaining to be settled, fully or partially, by the time of
     * the end of processing of the relevant cut-off.
     * 
     */
    SEFP;

    public String value() {
        return name();
    }

    public static PenaltyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
