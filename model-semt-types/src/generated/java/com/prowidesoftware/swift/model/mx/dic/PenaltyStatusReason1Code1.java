
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyStatusReason1Code__1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PenaltyStatusReason1Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NEWP"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="RALO"/>
 *     <enumeration value="SEMP"/>
 *     <enumeration value="SWIC"/>
 *     <enumeration value="UPDT"/>
 *     <enumeration value="INSO"/>
 *     <enumeration value="SESU"/>
 *     <enumeration value="TECH"/>
 *     <enumeration value="SUSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PenaltyStatusReason1Code__1")
@XmlEnum
public enum PenaltyStatusReason1Code1 {


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
    UPDT,

    /**
     * Penalty was removed becuase insolvency proceedings are opened against the failing participant.
     * 
     */
    INSO,

    /**
     * Penalty was removed becuase of ISIN suspension from settlement due to a reconciliation issue under Article 65 (2) and (6) of the RTS on CSD Requirements.
     * 
     */
    SESU,

    /**
     * Penalty was removed becuase there were thecnical imposssibilities at the CSD level that prevent settlement, such as: a failure of the infrastructure components, a cyber-attack, network problems.
     * 
     */
    TECH,

    /**
     * Penalty was removed becuase of ISIN suspension from trading.
     * 
     */
    SUSP;

    public String value() {
        return name();
    }

    public static PenaltyStatusReason1Code1 fromValue(String v) {
        return valueOf(v);
    }

}
