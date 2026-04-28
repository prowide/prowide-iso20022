
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PenaltyStatusReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UPDT"/>
 *     <enumeration value="SUSP"/>
 *     <enumeration value="TECH"/>
 *     <enumeration value="SWIC"/>
 *     <enumeration value="SESU"/>
 *     <enumeration value="SEMP"/>
 *     <enumeration value="RALO"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="NEWP"/>
 *     <enumeration value="INTS"/>
 *     <enumeration value="INSO"/>
 *     <enumeration value="CORP"/>
 *     <enumeration value="NOSU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PenaltyStatusReason2Code")
@XmlEnum
public enum PenaltyStatusReason2Code {


    /**
     * Penalty has been updated.
     * 
     */
    UPDT,

    /**
     * Penalty was removed becuase of ISIN suspension from trading.
     * 
     */
    SUSP,

    /**
     * Penalty was removed becuase there were thecnical imposssibilities at the CSD level that prevent settlement, such as: a failure of the infrastructure components, a cyber-attack, network problems.
     * 
     */
    TECH,

    /**
     * Penalty has been switched between the failing and non-failing party.
     * 
     */
    SWIC,

    /**
     * Penalty was removed becuase of ISIN suspension from settlement due to a reconciliation issue under Article 65 (2) and (6) of the RTS on CSD Requirements.
     * 
     */
    SESU,

    /**
     * Settlement on multiple platforms where one of the platforms is closed for settlement (either cash or securities).
     * 
     */
    SEMP,

    /**
     * Re-allocation of a late matching fail penalty from the instructing party to the delivering/receiving party.
     * 
     */
    RALO,

    /**
     * See narrative.
     * 
     */
    OTHR,

    /**
     * Penalty is new.
     * 
     */
    NEWP,

    /**
     * Penalty is not computed because the settlement has been internalised.
     * 
     */
    INTS,

    /**
     * Penalty was removed becuase insolvency proceedings are opened against the failing participant.
     * 
     */
    INSO,

    /**
     * Specifies that due to a specific corporate action, the security does no longer exists.
     * 
     */
    CORP,

    /**
     * Penalty is not computed or removed because the security is not subject to penalties.
     * 
     */
    NOSU;

    public String value() {
        return name();
    }

    public static PenaltyStatusReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
