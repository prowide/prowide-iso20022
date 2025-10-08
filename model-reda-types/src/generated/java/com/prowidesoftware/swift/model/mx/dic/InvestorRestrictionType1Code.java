
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorRestrictionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestorRestrictionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LERE"/&gt;
 *     &lt;enumeration value="CITI"/&gt;
 *     &lt;enumeration value="INDV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestorRestrictionType1Code")
@XmlEnum
public enum InvestorRestrictionType1Code {


    /**
     * Restriction applies to a legal resident.
     * 
     */
    LERE,

    /**
     * Restriction applies to a citizen.
     * 
     */
    CITI,

    /**
     * Restriction applies to an individual.
     * 
     */
    INDV;

    public String value() {
        return name();
    }

    public static InvestorRestrictionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
