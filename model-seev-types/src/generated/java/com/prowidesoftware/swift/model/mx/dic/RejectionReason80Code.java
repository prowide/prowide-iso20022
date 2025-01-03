
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason80Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectionReason80Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PDAY"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="GAMN"/>
 *     <enumeration value="MCER"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="XRAT"/>
 *     <enumeration value="SECO"/>
 *     <enumeration value="ENDP"/>
 *     <enumeration value="STAR"/>
 *     <enumeration value="RESU"/>
 *     <enumeration value="NOAC"/>
 *     <enumeration value="NPAT"/>
 *     <enumeration value="ELIG"/>
 *     <enumeration value="BDAY"/>
 *     <enumeration value="AGID"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="PERI"/>
 *     <enumeration value="RDTE"/>
 *     <enumeration value="ACRU"/>
 *     <enumeration value="VALU"/>
 *     <enumeration value="SECT"/>
 *     <enumeration value="PROR"/>
 *     <enumeration value="BIDI"/>
 *     <enumeration value="MINP"/>
 *     <enumeration value="MAXP"/>
 *     <enumeration value="FIRS"/>
 *     <enumeration value="LAST"/>
 *     <enumeration value="OVPR"/>
 *     <enumeration value="OVCH"/>
 *     <enumeration value="OVFL"/>
 *     <enumeration value="RITR"/>
 *     <enumeration value="SFEE"/>
 *     <enumeration value="BACK"/>
 *     <enumeration value="COND"/>
 *     <enumeration value="MFCF"/>
 *     <enumeration value="ODLT"/>
 *     <enumeration value="MPRI"/>
 *     <enumeration value="PRCH"/>
 *     <enumeration value="SUPR"/>
 *     <enumeration value="SUCH"/>
 *     <enumeration value="UNSP"/>
 *     <enumeration value="CSRT"/>
 *     <enumeration value="SERT"/>
 *     <enumeration value="PTYP"/>
 *     <enumeration value="CINL"/>
 *     <enumeration value="MDIS"/>
 *     <enumeration value="IDIS"/>
 *     <enumeration value="FRAC"/>
 *     <enumeration value="PBAS"/>
 *     <enumeration value="ROUN"/>
 *     <enumeration value="ISSR"/>
 *     <enumeration value="ISSC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectionReason80Code")
@XmlEnum
public enum RejectionReason80Code {


    /**
     * Effective date is after the payment date.
     * 
     */
    PDAY,

    /**
     * Validation of the advice/instruction/request failed.
     * 
     */
    FAIL,

    /**
     * Gross amount is less than net amount.
     * 
     */
    GAMN,

    /**
     * Certification has not been filled in.
     * 
     */
    MCER,

    /**
     * One option must be marked as the default.
     * 
     */
    DFLT,

    /**
     * Resulting amount is not allowed without an exchange rate.
     * 
     */
    XRAT,

    /**
     * Second option is mandatory.
     * 
     */
    SECO,

    /**
     * Period ending date or code is missing.
     * 
     */
    ENDP,

    /**
     * Period starting date or code is missing.
     * 
     */
    STAR,

    /**
     * Resulting amount must be filled in as exchange rate is present.
     * 
     */
    RESU,

    /**
     * Agent has no access to the service.
     * 
     */
    NOAC,

    /**
     * Party is not active.
     * 
     */
    NPAT,

    /**
     * Security is not eligible.
     * 
     */
    ELIG,

    /**
     * Date is not a business day for the security market.
     * 
     */
    BDAY,

    /**
     * Party is not defined as an agent.
     * 
     */
    AGID,

    /**
     * Disperse security is not eligible in the (ICSD) service provider owner.
     * 
     */
    DISP,

    /**
     * Period ending date is before period starting date.
     * 
     */
    PERI,

    /**
     * Record date is after payment date.
     * 
     */
    RDTE,

    /**
     * Accrued interest is not applicable for this type of security.
     * 
     */
    ACRU,

    /**
     * Value date is before payment date.
     * 
     */
    VALU,

    /**
     * Security type does not match with the type of corporate action.
     * 
     */
    SECT,

    /**
     * Proration rate is missing.
     * 
     */
    PROR,

    /**
     * Bid interval is missing.
     * 
     */
    BIDI,

    /**
     * Minimum price is missing.
     * 
     */
    MINP,

    /**
     * Maximum price is missing.
     * 
     */
    MAXP,

    /**
     * First bid increment is missing.
     * 
     */
    FIRS,

    /**
     * Last bid increment is missing. 
     * 
     */
    LAST,

    /**
     * Oversubscription price is missing.
     * 
     */
    OVPR,

    /**
     * Oversubscription charge flag is missing.
     * 
     */
    OVCH,

    /**
     * Oversubscription flag is missing.
     * 
     */
    OVFL,

    /**
     * Rights transferrable flag is missing.
     * 
     */
    RITR,

    /**
     * Solicitation dealer fee flag is missing.
     * 
     */
    SFEE,

    /**
     * Back end odd lot quantity is missing.
     * 
     */
    BACK,

    /**
     * Conditional tenders accepted flag is missing.
     * 
     */
    COND,

    /**
     * Full conditional flag is missing.
     * 
     */
    MFCF,

    /**
     * Odd lot priority flag is missing.
     * 
     */
    ODLT,

    /**
     * Proration rounding indicator is missing.
     * 
     */
    MPRI,

    /**
     * Protect charge indicator is missing.
     * 
     */
    PRCH,

    /**
     * Subscription price is missing.
     * 
     */
    SUPR,

    /**
     * Subscription charge flag is missing.
     * 
     */
    SUCH,

    /**
     * Unspecified price allowed is missing.
     * 
     */
    UNSP,

    /**
     * Cash rate is missing.
     * 
     */
    CSRT,

    /**
     * Securities rate is missing.
     * 
     */
    SERT,

    /**
     * Payout type is missing.
     * 
     */
    PTYP,

    /**
     * Cash in lieu price is missing.
     * 
     */
    CINL,

    /**
     * Disbursed security identification is missing.
     * 
     */
    MDIS,

    /**
     * Disbursed security identification is missing.
     * 
     */
    IDIS,

    /**
     * Fractional disposition is missing.
     * 
     */
    FRAC,

    /**
     * Price basis is missing.
     * 
     */
    PBAS,

    /**
     * Rounding factor is missing.
     * 
     */
    ROUN,

    /**
     * Issuer agent is missing.
     * 
     */
    ISSR,

    /**
     * Issuer agent contact information is invalid or missing.
     * 
     */
    ISSC;

    public String value() {
        return name();
    }

    public static RejectionReason80Code fromValue(String v) {
        return valueOf(v);
    }

}
