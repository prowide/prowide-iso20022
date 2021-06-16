
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTCInstructionStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DTCInstructionStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="CCAN"/&gt;
 *     &lt;enumeration value="DROP"/&gt;
 *     &lt;enumeration value="MADE"/&gt;
 *     &lt;enumeration value="PDOC"/&gt;
 *     &lt;enumeration value="PENA"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="REJA"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="REMD"/&gt;
 *     &lt;enumeration value="RESC"/&gt;
 *     &lt;enumeration value="SWUN"/&gt;
 *     &lt;enumeration value="WITH"/&gt;
 *     &lt;enumeration value="RECY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DTCInstructionStatus2Code")
@XmlEnum
public enum DTCInstructionStatus2Code {


    /**
     * Instruction cancelled by client relating to survivor option event.
     * 
     */
    CANC,

    /**
     * Cancellation of conversion instruction upon agent approval only.
     * 
     */
    CCAN,

    /**
     * Instruction dropped due to insufficient position.
     * 
     */
    DROP,

    /**
     * Fully processed instruction.
     * 
     */
    MADE,

    /**
     * Instruction for CD early redemption awaiting paperwork. Instruction will become MADE when DTC releases instruction upon paperwork.
     * 
     */
    PDOC,

    /**
     * Instruction pending release or delete from approval function.
     * 
     */
    PENA,

    /**
     * Instruction waiting for update after submission.
     * 
     */
    PEND,

    /**
     * Instruction or withdrawal rejected by agent relating to survivor option event.
     * 
     */
    REJA,

    /**
     * Instruction did not pass initial validation.
     * 
     */
    REJT,

    /**
     * Previously recycled transactions have been “MADE” and the system is processing the updates.
     * 
     */
    REMD,

    /**
     * Rescinded by Issuer.
     * 
     */
    RESC,

    /**
     * Instruction moved from one client account to another for put events.
     * 
     */
    SWUN,

    /**
     * Client instruction withdrawn for events with withdrawal privilege.
     * 
     */
    WITH,

    /**
     * Instruction waiting for position. Instruction will subsequently either become “Made” or “Dropped” by end of day.
     * 
     */
    RECY;

    public String value() {
        return name();
    }

    public static DTCInstructionStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
