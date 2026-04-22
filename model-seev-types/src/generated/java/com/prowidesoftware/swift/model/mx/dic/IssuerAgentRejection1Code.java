
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuerAgentRejection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IssuerAgentRejection1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NMOD"/>
 *     <enumeration value="PR1K"/>
 *     <enumeration value="CER0"/>
 *     <enumeration value="NCON"/>
 *     <enumeration value="DEPO"/>
 *     <enumeration value="FAS0"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="PDAY"/>
 *     <enumeration value="FAIL"/>
 *     <enumeration value="LOCK"/>
 *     <enumeration value="GAMN"/>
 *     <enumeration value="UNDI"/>
 *     <enumeration value="DEFE"/>
 *     <enumeration value="IDIS"/>
 *     <enumeration value="SEEQ"/>
 *     <enumeration value="EVNT"/>
 *     <enumeration value="NDEF"/>
 *     <enumeration value="NREF"/>
 *     <enumeration value="REFR"/>
 *     <enumeration value="ISSC"/>
 *     <enumeration value="PRIN"/>
 *     <enumeration value="REDT"/>
 *     <enumeration value="REFU"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="UNDV"/>
 *     <enumeration value="BACK"/>
 *     <enumeration value="BIDI"/>
 *     <enumeration value="CINL"/>
 *     <enumeration value="MCER"/>
 *     <enumeration value="CSRT"/>
 *     <enumeration value="COND"/>
 *     <enumeration value="DFLT"/>
 *     <enumeration value="MDIS"/>
 *     <enumeration value="XRAT"/>
 *     <enumeration value="FIRS"/>
 *     <enumeration value="FRAC"/>
 *     <enumeration value="MFCF"/>
 *     <enumeration value="ISSR"/>
 *     <enumeration value="LAST"/>
 *     <enumeration value="MAXP"/>
 *     <enumeration value="MINP"/>
 *     <enumeration value="ODLT"/>
 *     <enumeration value="SECO"/>
 *     <enumeration value="OVCH"/>
 *     <enumeration value="OVFL"/>
 *     <enumeration value="OVPR"/>
 *     <enumeration value="PTYP"/>
 *     <enumeration value="ENDP"/>
 *     <enumeration value="STAR"/>
 *     <enumeration value="PBAS"/>
 *     <enumeration value="PROR"/>
 *     <enumeration value="MPRI"/>
 *     <enumeration value="PRCH"/>
 *     <enumeration value="RESU"/>
 *     <enumeration value="RITR"/>
 *     <enumeration value="ROUN"/>
 *     <enumeration value="SERT"/>
 *     <enumeration value="SFEE"/>
 *     <enumeration value="SUCH"/>
 *     <enumeration value="SUPR"/>
 *     <enumeration value="UNSP"/>
 *     <enumeration value="NOAC"/>
 *     <enumeration value="NPAT"/>
 *     <enumeration value="ELIG"/>
 *     <enumeration value="BDAY"/>
 *     <enumeration value="AGID"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="ONCV"/>
 *     <enumeration value="PERI"/>
 *     <enumeration value="PUBD"/>
 *     <enumeration value="RDTE"/>
 *     <enumeration value="UNDM"/>
 *     <enumeration value="ACRU"/>
 *     <enumeration value="VALU"/>
 *     <enumeration value="SECT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IssuerAgentRejection1Code")
@XmlEnum
public enum IssuerAgentRejection1Code {


    /**
     * Cancelled event cannot be modified.
     * 
     */
    NMOD("NMOD"),

    /**
     * Zero Coupon Bond, Principal / Cash rate must be less than USD 1,000.00.
     * 
     */
    @XmlEnumValue("PR1K")
    PR_1_K("PR1K"),

    /**
     * Certificate Amount must be greater than zero.
     * 
     */
    @XmlEnumValue("CER0")
    CER_0("CER0"),

    /**
     * Convertible Security Not Supported.
     * 
     */
    NCON("NCON"),

    /**
     * Depository Called Amount must be greater than zero and must be equal to Security Called Amount.
     * 
     */
    DEPO("DEPO"),

    /**
     * Depository Called Amount must be greater than zero.
     * 
     */
    @XmlEnumValue("FAS0")
    FAS_0("FAS0"),

    /**
     * Duplicate event exists.
     * 
     */
    DUPL("DUPL"),

    /**
     * Effective date is after the payment date.
     * 
     */
    PDAY("PDAY"),

    /**
     * Validation of the advice/instruction/request failed.
     * 
     */
    FAIL("FAIL"),

    /**
     * Underlying Security has a global lock.
     * 
     */
    LOCK("LOCK"),

    /**
     * Gross amount is less than net amount.
     * 
     */
    GAMN("GAMN"),

    /**
     * Inactive Underlying Security.
     * 
     */
    UNDI("UNDI"),

    /**
     * Invalid Defeased Security Identifier.
     * 
     */
    DEFE("DEFE"),

    /**
     * Disbursed security identification is missing.
     * 
     */
    IDIS("IDIS"),

    /**
     * Invalid Equity Security Type.
     * 
     */
    SEEQ("SEEQ"),

    /**
     * Invalid Event Type.
     * 
     */
    EVNT("EVNT"),

    /**
     * Invalid Non-Defeased Security Identifier.
     * 
     */
    NDEF("NDEF"),

    /**
     * Invalid Non-Refunded Security Identifier
     * 
     */
    NREF("NREF"),

    /**
     * Invalid Notification Identification.
     * 
     */
    REFR("REFR"),

    /**
     * Issuer agent contact information is invalid or missing.
     * 
     */
    ISSC("ISSC"),

    /**
     * Invalid Principal Cash Rate.
     * 
     */
    PRIN("PRIN"),

    /**
     * Invalid Redemption Date.
     * 
     */
    REDT("REDT"),

    /**
     * Invalid Refunded Security Identifier.
     * 
     */
    REFU("REFU"),

    /**
     * Invalid Amount Total Certificate Amount must be greater than zero and equal to Security Called Amount.
     * 
     */
    CERT("CERT"),

    /**
     * Invalid Underlying Security.
     * 
     */
    UNDV("UNDV"),

    /**
     * Back end odd lot quantity is missing.
     * 
     */
    BACK("BACK"),

    /**
     * Bid interval is missing.
     * 
     */
    BIDI("BIDI"),

    /**
     * Cash in lieu price is missing.
     * 
     */
    CINL("CINL"),

    /**
     * Certification has not been filled in.
     * 
     */
    MCER("MCER"),

    /**
     * Cash rate is missing.
     * 
     */
    CSRT("CSRT"),

    /**
     * Conditional tenders accepted flag is missing.
     * 
     */
    COND("COND"),

    /**
     * One option must be marked as the default.
     * 
     */
    DFLT("DFLT"),

    /**
     * Disbursed security identification is missing.
     * 
     */
    MDIS("MDIS"),

    /**
     * Resulting amount is not allowed without an exchange rate.
     * 
     */
    XRAT("XRAT"),

    /**
     * First bid increment is missing.
     * 
     */
    FIRS("FIRS"),

    /**
     * Fractional Underlying Security cannot be announced.
     * 
     */
    FRAC("FRAC"),

    /**
     * Full conditional flag is missing.
     * 
     */
    MFCF("MFCF"),

    /**
     * Issuer agent is missing.
     * 
     */
    ISSR("ISSR"),

    /**
     * Last bid increment is missing. 
     * 
     */
    LAST("LAST"),

    /**
     * Maximum price is missing.
     * 
     */
    MAXP("MAXP"),

    /**
     * Minimum price is missing.
     * 
     */
    MINP("MINP"),

    /**
     * Odd lot priority flag is missing.
     * 
     */
    ODLT("ODLT"),

    /**
     * Second option is mandatory.
     * 
     */
    SECO("SECO"),

    /**
     * Oversubscription charge flag is missing.
     * 
     */
    OVCH("OVCH"),

    /**
     * Oversubscription flag is missing.
     * 
     */
    OVFL("OVFL"),

    /**
     * Oversubscription price is missing.
     * 
     */
    OVPR("OVPR"),

    /**
     * Payout type is missing.
     * 
     */
    PTYP("PTYP"),

    /**
     * Period ending date or code is missing.
     * 
     */
    ENDP("ENDP"),

    /**
     * Period starting date or code is missing.
     * 
     */
    STAR("STAR"),

    /**
     * Price basis is missing.
     * 
     */
    PBAS("PBAS"),

    /**
     * Proration rate is missing.
     * 
     */
    PROR("PROR"),

    /**
     * Proration rounding indicator is missing.
     * 
     */
    MPRI("MPRI"),

    /**
     * Protect charge indicator is missing.
     * 
     */
    PRCH("PRCH"),

    /**
     * Resulting amount must be filled in as exchange rate is present.
     * 
     */
    RESU("RESU"),

    /**
     * Rights transferrable flag is missing.
     * 
     */
    RITR("RITR"),

    /**
     * Rounding factor is missing.
     * 
     */
    ROUN("ROUN"),

    /**
     * Securities rate is missing.
     * 
     */
    SERT("SERT"),

    /**
     * Solicitation dealer fee flag is missing.
     * 
     */
    SFEE("SFEE"),

    /**
     * Subscription charge flag is missing.
     * 
     */
    SUCH("SUCH"),

    /**
     * Subscription price is missing.
     * 
     */
    SUPR("SUPR"),

    /**
     * Unspecified price allowed is missing.
     * 
     */
    UNSP("UNSP"),

    /**
     * Agent has no access to the service.
     * 
     */
    NOAC("NOAC"),

    /**
     * Party is not active.
     * 
     */
    NPAT("NPAT"),

    /**
     * Security is not eligible.
     * 
     */
    ELIG("ELIG"),

    /**
     * Date is not a business day for the security market.
     * 
     */
    BDAY("BDAY"),

    /**
     * Party is not defined as an agent.
     * 
     */
    AGID("AGID"),

    /**
     * Disperse security is not eligible in the (ICSD) service provider owner.
     * 
     */
    DISP("DISP"),

    /**
     * Ongoing Conversion Event Exists
     * 
     */
    ONCV("ONCV"),

    /**
     * Period ending date is before period starting date.
     * 
     */
    PERI("PERI"),

    /**
     * Publication date must be earlier than payable date.
     * 
     */
    PUBD("PUBD"),

    /**
     * Record date is after payment date.
     * 
     */
    RDTE("RDTE"),

    /**
     * Underlying Security is not eligible at Depository.
     * 
     */
    UNDM("UNDM"),

    /**
     * Accrued interest is not applicable for this type of security.
     * 
     */
    ACRU("ACRU"),

    /**
     * Value date is before payment date.
     * 
     */
    VALU("VALU"),

    /**
     * Security type does not match with the type of corporate action.
     * 
     */
    SECT("SECT");
    private final String value;

    IssuerAgentRejection1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IssuerAgentRejection1Code fromValue(String v) {
        for (IssuerAgentRejection1Code c: IssuerAgentRejection1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
