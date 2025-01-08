
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewSecuritiesIssuanceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NewSecuritiesIssuanceType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEFE"/>
 *     <enumeration value="EXIS"/>
 *     <enumeration value="NEIS"/>
 *     <enumeration value="NDEF"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NewSecuritiesIssuanceType2Code")
@XmlEnum
public enum NewSecuritiesIssuanceType2Code {


    /**
     * Funds have been placed in escrow by a trustee or agent to ensure payment on a portion of the outstanding balance of the original security on maturity date. Applicable only in the frame of a Partial Defeasance PDEF corporate action event.
     * 
     */
    DEFE,

    /**
     * Securities proceeds are not new issues.
     * 
     */
    EXIS,

    /**
     * Securities proceeds are newly issued.
     * 
     */
    NEIS,

    /**
     * Funds will not be guaranteed at maturity by the issuer or paying agent for this newly issued non-defeased security. Applicable only in the frame of a Partial Defeasance PDEF corporate action event.
     * 
     */
    NDEF,

    /**
     * Not known whether the securities proceeds are newly issued or not.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static NewSecuritiesIssuanceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
