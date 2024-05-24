
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAIL"/>
 *     <enumeration value="SECO"/>
 *     <enumeration value="AGID"/>
 *     <enumeration value="ENDP"/>
 *     <enumeration value="STAR"/>
 *     <enumeration value="RESU"/>
 *     <enumeration value="SECT"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="ELIG"/>
 *     <enumeration value="XRAT"/>
 *     <enumeration value="VALU"/>
 *     <enumeration value="ACRU"/>
 *     <enumeration value="NOAC"/>
 *     <enumeration value="MCER"/>
 *     <enumeration value="BDAY"/>
 *     <enumeration value="PDAY"/>
 *     <enumeration value="GAMN"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="NPAT"/>
 *     <enumeration value="PERI"/>
 *     <enumeration value="RDTE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
