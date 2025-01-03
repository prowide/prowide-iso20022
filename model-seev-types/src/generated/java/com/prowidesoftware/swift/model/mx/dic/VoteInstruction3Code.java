
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteInstruction3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="VoteInstruction3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABST"/>
 *     <enumeration value="CAGS"/>
 *     <enumeration value="AMGT"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="CFOR"/>
 *     <enumeration value="NOAC"/>
 *     <enumeration value="WTHH"/>
 *     <enumeration value="WMGT"/>
 *     <enumeration value="ONEY"/>
 *     <enumeration value="THRY"/>
 *     <enumeration value="TWOY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VoteInstruction3Code")
@XmlEnum
public enum VoteInstruction3Code {


    /**
     * Active vote expressed as abstain (no opinion).
     * 
     */
    ABST,

    /**
     * Vote against a meeting resolution.
     * 
     */
    CAGS,

    /**
     * Vote instruction is in against the voting recommendations of the management.
     * 
     */
    AMGT,

    /**
     * Voting party is assigned discretionary right to vote for one resolution.
     * 
     */
    DISC,

    /**
     * Vote in favour of a meeting resolution.
     * 
     */
    CFOR,

    /**
     * Indicates a recommendation to take no action.
     * 
     */
    NOAC,

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
     * Vote in favour for one year for "say on pay" type of resolution.
     * 
     */
    ONEY,

    /**
     * Vote in favour for three years for "say on pay" type of resolution.
     * 
     */
    THRY,

    /**
     * Vote in favour for two years for "say on pay" type of resolution.
     * 
     */
    TWOY;

    public String value() {
        return name();
    }

    public static VoteInstruction3Code fromValue(String v) {
        return valueOf(v);
    }

}
