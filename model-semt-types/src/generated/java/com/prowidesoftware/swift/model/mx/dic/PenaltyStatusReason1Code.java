
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PenaltyStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *     &lt;enumeration value="NEWP"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="RALO"/&gt;
 *     &lt;enumeration value="SEMP"/&gt;
 *     &lt;enumeration value="SWIC"/&gt;
 *     &lt;enumeration value="UPDT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
