
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralProposalResponse1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralProposalResponse1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INPR"/&gt;
 *     &lt;enumeration value="COPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollateralProposalResponse1Code")
@XmlEnum
public enum CollateralProposalResponse1Code {


    /**
     * Indicates that the collateral proposal response is an initial proposal.
     * 
     */
    INPR,

    /**
     * Indicates that the collateral proposal response is a counter proposal.
     * 
     */
    COPR;

    public String value() {
        return name();
    }

    public static CollateralProposalResponse1Code fromValue(String v) {
        return valueOf(v);
    }

}
