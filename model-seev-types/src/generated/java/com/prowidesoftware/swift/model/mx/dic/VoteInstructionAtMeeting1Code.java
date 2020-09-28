
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteInstructionAtMeeting1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VoteInstructionAtMeeting1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHRM"/&gt;
 *     &lt;enumeration value="CAGS"/&gt;
 *     &lt;enumeration value="CFOR"/&gt;
 *     &lt;enumeration value="ABST"/&gt;
 *     &lt;enumeration value="WTHH"/&gt;
 *     &lt;enumeration value="WMGT"/&gt;
 *     &lt;enumeration value="AMGT"/&gt;
 *     &lt;enumeration value="NOAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VoteInstructionAtMeeting1Code")
@XmlEnum
public enum VoteInstructionAtMeeting1Code {


    /**
     * Specifies that the rights holder gives authority to the chairman to vote on his behalf.
     * 
     */
    CHRM,

    /**
     * Vote against a meeting resolution.
     * 
     */
    CAGS,

    /**
     * Vote in favour of a meeting resolution.
     * 
     */
    CFOR,

    /**
     * Active vote expressed as abstain (no opinion).
     * 
     */
    ABST,

    /**
     * Participant to a meeting withholds its vote for a meeting resolution . This action is usually taken in order to indicate a strong disagreement with a resolution (US market).
     * 
     */
    WTHH,

    /**
     * Vote instruction is in line with the voting recommendations of the management.
     * 
     */
    WMGT,

    /**
     * Vote instruction is in against the voting recommendations of the management.
     * 
     */
    AMGT,

    /**
     * Indicates a recommendation to take no action
     * 
     */
    NOAC;

    public String value() {
        return name();
    }

    public static VoteInstructionAtMeeting1Code fromValue(String v) {
        return valueOf(v);
    }

}
