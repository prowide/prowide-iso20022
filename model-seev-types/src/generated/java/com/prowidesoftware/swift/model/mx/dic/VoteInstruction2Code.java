
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteInstruction2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="VoteInstruction2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CFOR"/>
 *     <enumeration value="CAGS"/>
 *     <enumeration value="ABST"/>
 *     <enumeration value="WTHH"/>
 *     <enumeration value="WMGT"/>
 *     <enumeration value="AMGT"/>
 *     <enumeration value="NOAC"/>
 *     <enumeration value="DISC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VoteInstruction2Code")
@XmlEnum
public enum VoteInstruction2Code {


    /**
     * Vote in favour of a meeting resolution.
     * 
     */
    CFOR,

    /**
     * Vote against a meeting resolution.
     * 
     */
    CAGS,

    /**
     * Active vote expressed as abstain (no opinion).
     * 
     */
    ABST,

    /**
     * Participant to a meeting withholds its vote for a meeting resolution. This action is usually taken in order to indicate a strong disagreement with a resolution (US market).
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
     * Indicates a recommendation to take no action.
     * 
     */
    NOAC,

    /**
     * Voting party is assigned discretionary right to vote for one resolution.
     * 
     */
    DISC;

    public String value() {
        return name();
    }

    public static VoteInstruction2Code fromValue(String v) {
        return valueOf(v);
    }

}
