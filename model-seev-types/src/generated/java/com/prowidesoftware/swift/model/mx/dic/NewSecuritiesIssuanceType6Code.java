
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewSecuritiesIssuanceType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NewSecuritiesIssuanceType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEFE"/>
 *     <enumeration value="NDEF"/>
 *     <enumeration value="REFU"/>
 *     <enumeration value="NREF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NewSecuritiesIssuanceType6Code")
@XmlEnum
public enum NewSecuritiesIssuanceType6Code {


    /**
     * Funds have been placed in escrow by a trustee or agent to ensure payment on a portion of the outstanding balance of the original security on maturity date. Applicable only in the frame of a Partial Defeasance PDEF corporate action event.
     * 
     */
    DEFE,

    /**
     * Funds will not be guaranteed at maturity by the issuer or paying agent for this newly issued non-defeased security. Applicable only in the frame of a Partial Defeasance PDEF corporate action event.
     * 
     */
    NDEF,

    /**
     * New security issued that has been refunded to an earlier maturity date. Applicable only in the frame of a partial defeasance PDEF corporate action event.
     * 
     */
    REFU,

    /**
     * New Security issued that has not been refunded and the maturity date of the original underlying security is unchanged. Applicable only in the frame of a Partial Defeasance PDEF corporate action event.
     * 
     */
    NREF;

    public String value() {
        return name();
    }

    public static NewSecuritiesIssuanceType6Code fromValue(String v) {
        return valueOf(v);
    }

}
