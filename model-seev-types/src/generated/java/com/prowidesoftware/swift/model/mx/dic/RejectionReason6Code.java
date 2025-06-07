
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="SECO"/&gt;
 *     &lt;enumeration value="AGID"/&gt;
 *     &lt;enumeration value="ENDP"/&gt;
 *     &lt;enumeration value="STAR"/&gt;
 *     &lt;enumeration value="RESU"/&gt;
 *     &lt;enumeration value="SECT"/&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="ELIG"/&gt;
 *     &lt;enumeration value="XRAT"/&gt;
 *     &lt;enumeration value="VALU"/&gt;
 *     &lt;enumeration value="ACRU"/&gt;
 *     &lt;enumeration value="NOAC"/&gt;
 *     &lt;enumeration value="MCER"/&gt;
 *     &lt;enumeration value="BDAY"/&gt;
 *     &lt;enumeration value="PDAY"/&gt;
 *     &lt;enumeration value="GAMN"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="NPAT"/&gt;
 *     &lt;enumeration value="PERI"/&gt;
 *     &lt;enumeration value="RDTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason6Code")
@XmlEnum
public enum RejectionReason6Code {


    /**
     * The validation of the advice/instruction/request failed.
     * 
     */
    FAIL,

    /**
     * A second option is mandatory.
     * 
     */
    SECO,

    /**
     * Party is not defined as an agent.
     * 
     */
    AGID,

    /**
     * Period Ending Date or Code is missing.
     * 
     */
    ENDP,

    /**
     * Period Starting Date or Code is missing.
     * 
     */
    STAR,

    /**
     * Resulting amount must be filled in as Exchange rate is present.
     * 
     */
    RESU,

    /**
     * Security type does not match with the type of corporate action.
     * 
     */
    SECT,

    /**
     * The disperse security is not eligible in the I(CSD) Service Provider Owner.
     * 
     */
    DISP,

    /**
     * The security is not eligible.
     * 
     */
    ELIG,

    /**
     * There cannot be a resulting amount without an exchange rate.
     * 
     */
    XRAT,

    /**
     * Value date is before payment date.
     * 
     */
    VALU,

    /**
     * Accrued interest is not applicable for this type of security.
     * 
     */
    ACRU,

    /**
     * Agent has no access to the service.
     * 
     */
    NOAC,

    /**
     * Certification Indicator is not filled in.
     * 
     */
    MCER,

    /**
     * Date is not a business day for the security market.
     * 
     */
    BDAY,

    /**
     * Effective date is after the payment date.
     * 
     */
    PDAY,

    /**
     * Gross amount is less than net amount.
     * 
     */
    GAMN,

    /**
     * One option must be marked as the default.
     * 
     */
    DFLT,

    /**
     * Party is not active.
     * 
     */
    NPAT,

    /**
     * Period Ending date is before Period Starting date.
     * 
     */
    PERI,

    /**
     * Record date is after payment date.
     * 
     */
    RDTE;

    public String value() {
        return name();
    }

    public static RejectionReason6Code fromValue(String v) {
        return valueOf(v);
    }

}
