
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="VoteType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADVI"/>
 *     <enumeration value="BNDG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VoteType1Code")
@XmlEnum
public enum VoteType1Code {


    /**
     * Results of a vote on a proposal is for advice only.
     * 
     */
    ADVI,

    /**
     * Results of a vote on a proposal is binding.
     * 
     */
    BNDG;

    public String value() {
        return name();
    }

    public static VoteType1Code fromValue(String v) {
        return valueOf(v);
    }

}
