
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VoteType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADVI"/&gt;
 *     &lt;enumeration value="BNDG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
