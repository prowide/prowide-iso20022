
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PenaltyStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="NCOM"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="RLOC"/&gt;
 *     &lt;enumeration value="REIC"/&gt;
 *     &lt;enumeration value="REMO"/&gt;
 *     &lt;enumeration value="SWIC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
