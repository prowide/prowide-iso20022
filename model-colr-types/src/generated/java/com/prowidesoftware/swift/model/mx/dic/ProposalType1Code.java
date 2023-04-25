
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProposalType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INIT"/>
 *     <enumeration value="COUN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
