
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PenaltyStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTV"/>
 *     <enumeration value="NCOM"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="RLOC"/>
 *     <enumeration value="REIC"/>
 *     <enumeration value="REMO"/>
 *     <enumeration value="SWIC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PenaltyStatus1Code")
@XmlEnum
public enum PenaltyStatus1Code {


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
     * Other status.
     * 
     */
    OTHR,

    /**
     * Re-allocation of a late matching fail penalty  from the instructing party to the delivering/receiving party.
     * 
     */
    RLOC,

    /**
     * Re-inclusion of a previously removed cash penalty, to cater for mistakes in the removal of penalties.
     * 
     */
    REIC,

    /**
     * Removal of a cash penalty where settlement cannot be performed for reasons that are independent from any of the CSD participants or the CSD.
     * 
     */
    REMO,

    /**
     * Switch between the failing and non-failing party of a cash penalty.
     * 
     */
    SWIC;

    public String value() {
        return name();
    }

    public static PenaltyStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
