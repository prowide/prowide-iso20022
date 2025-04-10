
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteInstruction6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VoteInstruction6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABST"/&gt;
 *     &lt;enumeration value="CAGS"/&gt;
 *     &lt;enumeration value="AMGT"/&gt;
 *     &lt;enumeration value="BLNK"/&gt;
 *     &lt;enumeration value="CHRM"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="CFOR"/&gt;
 *     &lt;enumeration value="NOAC"/&gt;
 *     &lt;enumeration value="ONEY"/&gt;
 *     &lt;enumeration value="THRY"/&gt;
 *     &lt;enumeration value="TWOY"/&gt;
 *     &lt;enumeration value="WTHH"/&gt;
 *     &lt;enumeration value="WMGT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VoteInstruction6Code")
@XmlEnum
public enum VoteInstruction6Code {


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
     * Vote is cast as empty but the vote is counted.
     * 
     */
    BLNK,

    /**
     * Rights holder gives authority to the chairman to vote on his behalf.
     * 
     */
    CHRM,

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
     * Do not vote.
     * 
     */
    NOAC,

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
    TWOY,

    /**
     * Participant to a meeting withholds its vote for a meeting resolution. This action is usually taken in order to indicate a strong disagreement with a resolution (US market).
     * 
     */
    WTHH,

    /**
     * Vote instruction is in line with the voting recommendations of the management.
     * 
     */
    WMGT;

    public String value() {
        return name();
    }

    public static VoteInstruction6Code fromValue(String v) {
        return valueOf(v);
    }

}
