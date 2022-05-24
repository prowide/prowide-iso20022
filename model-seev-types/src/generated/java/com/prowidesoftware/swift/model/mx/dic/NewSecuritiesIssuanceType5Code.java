
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewSecuritiesIssuanceType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NewSecuritiesIssuanceType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEFE"/&gt;
 *     &lt;enumeration value="EXIS"/&gt;
 *     &lt;enumeration value="NEIS"/&gt;
 *     &lt;enumeration value="NDEF"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="NREF"/&gt;
 *     &lt;enumeration value="REFU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NewSecuritiesIssuanceType5Code")
@XmlEnum
public enum NewSecuritiesIssuanceType5Code {


    /**
     * Funds have been placed in escrow by a trustee or agent to ensure payment on a portion of the outstanding balance of the original security on maturity date.  Applicable only in the frame of a Partial Defeasance PDEF corporate action event. 
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
     * Funds will not be guaranteed at maturity by the issuer or paying agent for this newly issued non-defeased security.  Applicable only in the frame of a Partial Defeasance PDEF corporate action event. 
     * 
     */
    NDEF,

    /**
     * Not known whether the securities proceeds are newly issued or not.
     * 
     */
    UKWN,

    /**
     * New Security issued that has not been refunded and the maturity date of the original underlying security is unchanged. Applicable only in the frame of a Partial Defeasance PDEF corporate action event. 
     * 
     */
    NREF,

    /**
     * New security issued that has been refunded to an earlier maturity date. Applicable only in the frame of a partial defeasance PDEF corporate action event.
     * 
     */
    REFU;

    public String value() {
        return name();
    }

    public static NewSecuritiesIssuanceType5Code fromValue(String v) {
        return valueOf(v);
    }

}
