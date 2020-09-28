
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INIT"/&gt;
 *     &lt;enumeration value="COUN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProposalType1Code")
@XmlEnum
public enum ProposalType1Code {


    /**
     * Specifies this is an initial proposal.
     * 
     */
    INIT,

    /**
     * Specifies this is a counter proposal.
     * 
     */
    COUN;

    public String value() {
        return name();
    }

    public static ProposalType1Code fromValue(String v) {
        return valueOf(v);
    }

}
