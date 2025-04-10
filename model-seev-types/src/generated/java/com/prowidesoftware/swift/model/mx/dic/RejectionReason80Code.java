
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason80Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason80Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PDAY"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="GAMN"/&gt;
 *     &lt;enumeration value="MCER"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="XRAT"/&gt;
 *     &lt;enumeration value="SECO"/&gt;
 *     &lt;enumeration value="ENDP"/&gt;
 *     &lt;enumeration value="STAR"/&gt;
 *     &lt;enumeration value="RESU"/&gt;
 *     &lt;enumeration value="NOAC"/&gt;
 *     &lt;enumeration value="NPAT"/&gt;
 *     &lt;enumeration value="ELIG"/&gt;
 *     &lt;enumeration value="BDAY"/&gt;
 *     &lt;enumeration value="AGID"/&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="PERI"/&gt;
 *     &lt;enumeration value="RDTE"/&gt;
 *     &lt;enumeration value="ACRU"/&gt;
 *     &lt;enumeration value="VALU"/&gt;
 *     &lt;enumeration value="SECT"/&gt;
 *     &lt;enumeration value="PROR"/&gt;
 *     &lt;enumeration value="BIDI"/&gt;
 *     &lt;enumeration value="MINP"/&gt;
 *     &lt;enumeration value="MAXP"/&gt;
 *     &lt;enumeration value="FIRS"/&gt;
 *     &lt;enumeration value="LAST"/&gt;
 *     &lt;enumeration value="OVPR"/&gt;
 *     &lt;enumeration value="OVCH"/&gt;
 *     &lt;enumeration value="OVFL"/&gt;
 *     &lt;enumeration value="RITR"/&gt;
 *     &lt;enumeration value="SFEE"/&gt;
 *     &lt;enumeration value="BACK"/&gt;
 *     &lt;enumeration value="COND"/&gt;
 *     &lt;enumeration value="MFCF"/&gt;
 *     &lt;enumeration value="ODLT"/&gt;
 *     &lt;enumeration value="MPRI"/&gt;
 *     &lt;enumeration value="PRCH"/&gt;
 *     &lt;enumeration value="SUPR"/&gt;
 *     &lt;enumeration value="SUCH"/&gt;
 *     &lt;enumeration value="UNSP"/&gt;
 *     &lt;enumeration value="CSRT"/&gt;
 *     &lt;enumeration value="SERT"/&gt;
 *     &lt;enumeration value="PTYP"/&gt;
 *     &lt;enumeration value="CINL"/&gt;
 *     &lt;enumeration value="MDIS"/&gt;
 *     &lt;enumeration value="IDIS"/&gt;
 *     &lt;enumeration value="FRAC"/&gt;
 *     &lt;enumeration value="PBAS"/&gt;
 *     &lt;enumeration value="ROUN"/&gt;
 *     &lt;enumeration value="ISSR"/&gt;
 *     &lt;enumeration value="ISSC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
