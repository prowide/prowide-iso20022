
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteInstruction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="VoteInstruction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CFOR"/>
 *     <enumeration value="CAGS"/>
 *     <enumeration value="ABST"/>
 *     <enumeration value="WTHH"/>
 *     <enumeration value="NOAC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VoteInstruction1Code")
@XmlEnum
public enum VoteInstruction1Code {


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
     * Indicates a recommendation to take no action.
     * 
     */
    NOAC;

    public String value() {
        return name();
    }

    public static VoteInstruction1Code fromValue(String v) {
        return valueOf(v);
    }

}
