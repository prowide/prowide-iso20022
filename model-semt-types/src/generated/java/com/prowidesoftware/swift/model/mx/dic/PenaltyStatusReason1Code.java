
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PenaltyStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CORP"/>
 *     <enumeration value="NEWP"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="RALO"/>
 *     <enumeration value="SEMP"/>
 *     <enumeration value="SWIC"/>
 *     <enumeration value="UPDT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PenaltyStatusReason1Code")
@XmlEnum
public enum PenaltyStatusReason1Code {


    /**
     * Specifies that due to a specific corporate action, the security does no longer exists.
     * 
     */
    CORP,

    /**
     * Penalty is new.
     * 
     */
    NEWP,

    /**
     * See narrative.
     * 
     */
    OTHR,

    /**
     * Re-allocation of a late matching fail penalty from the instructing party to the delivering/receiving party.
     * 
     */
    RALO,

    /**
     * Settlement on multiple platforms where one of the platforms is closed for settlement (either cash or securities).
     * 
     */
    SEMP,

    /**
     * Switch between the failing and non-failing party of a cash penalty.
     * 
     */
    SWIC,

    /**
     * Updated of previously calculated penalty.
     * 
     */
    UPDT;

    public String value() {
        return name();
    }

    public static PenaltyStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
