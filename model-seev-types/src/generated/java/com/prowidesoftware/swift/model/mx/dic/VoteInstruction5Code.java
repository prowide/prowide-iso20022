
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteInstruction5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="VoteInstruction5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABST"/>
 *     <enumeration value="CAGS"/>
 *     <enumeration value="CHRM"/>
 *     <enumeration value="CFOR"/>
 *     <enumeration value="NOAC"/>
 *     <enumeration value="WTHH"/>
 *     <enumeration value="ONEY"/>
 *     <enumeration value="THRY"/>
 *     <enumeration value="TWOY"/>
 *     <enumeration value="BLNK"/>
 *     <enumeration value="NREC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VoteInstruction5Code")
@XmlEnum
public enum VoteInstruction5Code {


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
     * Rights holder gives authority to the chairman to vote on his behalf.
     * 
     */
    CHRM,

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
     * Participant to a meeting withholds its vote for a meeting resolution. This action is usually taken in order to indicate a strong disagreement with a resolution (US market).
     * 
     */
    WTHH,

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
     * Vote is cast as empty but the vote is counted.
     * 
     */
    BLNK,

    /**
     * No recommendation provided for the vote instruction type.
     * 
     */
    NREC;

    public String value() {
        return name();
    }

    public static VoteInstruction5Code fromValue(String v) {
        return valueOf(v);
    }

}
