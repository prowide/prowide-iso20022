
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountInformationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountInformationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IBND"/&gt;
 *     &lt;enumeration value="IBCC"/&gt;
 *     &lt;enumeration value="IBDC"/&gt;
 *     &lt;enumeration value="BIBC"/&gt;
 *     &lt;enumeration value="BIBD"/&gt;
 *     &lt;enumeration value="BINC"/&gt;
 *     &lt;enumeration value="BIND"/&gt;
 *     &lt;enumeration value="BICC"/&gt;
 *     &lt;enumeration value="BIDC"/&gt;
 *     &lt;enumeration value="CMSA"/&gt;
 *     &lt;enumeration value="CBBC"/&gt;
 *     &lt;enumeration value="CBBD"/&gt;
 *     &lt;enumeration value="CBNC"/&gt;
 *     &lt;enumeration value="CBND"/&gt;
 *     &lt;enumeration value="CBCC"/&gt;
 *     &lt;enumeration value="CBDC"/&gt;
 *     &lt;enumeration value="CUAC"/&gt;
 *     &lt;enumeration value="DEAC"/&gt;
 *     &lt;enumeration value="FCAA"/&gt;
 *     &lt;enumeration value="FCAN"/&gt;
 *     &lt;enumeration value="FCBN"/&gt;
 *     &lt;enumeration value="IBBC"/&gt;
 *     &lt;enumeration value="IBBD"/&gt;
 *     &lt;enumeration value="IBNC"/&gt;
 *     &lt;enumeration value="MCAA"/&gt;
 *     &lt;enumeration value="MCAN"/&gt;
 *     &lt;enumeration value="MCIC"/&gt;
 *     &lt;enumeration value="MCIN"/&gt;
 *     &lt;enumeration value="MSAA"/&gt;
 *     &lt;enumeration value="MSBN"/&gt;
 *     &lt;enumeration value="MCAD"/&gt;
 *     &lt;enumeration value="NODC"/&gt;
 *     &lt;enumeration value="SCAC"/&gt;
 *     &lt;enumeration value="SCAA"/&gt;
 *     &lt;enumeration value="OMSA"/&gt;
 *     &lt;enumeration value="NOCC"/&gt;
 *     &lt;enumeration value="MSBS"/&gt;
 *     &lt;enumeration value="MSAN"/&gt;
 *     &lt;enumeration value="SCAN"/&gt;
 *     &lt;enumeration value="SCIC"/&gt;
 *     &lt;enumeration value="SCIN"/&gt;
 *     &lt;enumeration value="SOCA"/&gt;
 *     &lt;enumeration value="SSCA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountInformationType1Code")
@XmlEnum
public enum AccountInformationType1Code {


    /**
     * Name of intermediary bank for dealt currency.
     * 
     */
    IBND,

    /**
     * Number of intermediary bank for contra currency.
     * 
     */
    IBCC,

    /**
     * Number of intermediary bank for dealt currency.
     * 
     */
    IBDC,

    /**
     * BIC code of beneficiary institution for contra currency.
     * 
     */
    BIBC,

    /**
     * BIC code of beneficiary institution for dealt currency.
     * 
     */
    BIBD,

    /**
     * Name of beneficiary institution for contra currency.
     * 
     */
    BINC,

    /**
     * Name of beneficiary institution for dealt currency.
     * 
     */
    BIND,

    /**
     * Number of beneficiary institution for contra currency.
     * 
     */
    BICC,

    /**
     * Number of beneficiary institution for dealt currency.
     * 
     */
    BIDC,

    /**
     * Margin settlement account number of CFETS.
     * 
     */
    CMSA,

    /**
     * BIC code of correspondent bank for contra currency.
     * 
     */
    CBBC,

    /**
     * BIC code of correspondent bank for dealt currency.
     * 
     */
    CBBD,

    /**
     * Name of correspondent bank for contra currency.
     * 
     */
    CBNC,

    /**
     * Name of correspondent bank for dealt currency.
     * 
     */
    CBND,

    /**
     * Number of correspondent bank for contra currency.
     * 
     */
    CBCC,

    /**
     * Number of correspondent bank for dealt currency.
     * 
     */
    CBDC,

    /**
     * Specifies the current account.
     * 
     */
    CUAC,

    /**
     * Specifies the deposit account.
     * 
     */
    DEAC,

    /**
     * Account name of fund custodian.
     * 
     */
    FCAA,

    /**
     * Account number of fund custodian.
     * 
     */
    FCAN,

    /**
     * Name of fund custodian bank.
     * 
     */
    FCBN,

    /**
     * BIC code of intermediary bank for contra currency.
     * 
     */
    IBBC,

    /**
     * BIC code of intermediary bank for dealt currency.
     * 
     */
    IBBD,

    /**
     * Name of intermediary bank for contra currency.
     * 
     */
    IBNC,

    /**
     * Custodian account name of margin.
     * 
     */
    MCAA,

    /**
     * Custodian account number of margin.
     * 
     */
    MCAN,

    /**
     * Code of margin custodian institution.
     * 
     */
    MCIC,

    /**
     * Name of margin custodian institution.
     * 
     */
    MCIN,

    /**
     * Settlement account name of margin.
     * 
     */
    MSAA,

    /**
     * Settlement bank name of margin.
     * 
     */
    MSBN,

    /**
     * Description of multi currency account.
     * 
     */
    MCAD,

    /**
     * Note for dealt currency.
     * 
     */
    NODC,

    /**
     * Account chinese name of securities custodians.
     * 
     */
    SCAC,

    /**
     * Account name of securities custodians.
     * 
     */
    SCAA,

    /**
     * Margin settlement account number of other institutions.
     * 
     */
    OMSA,

    /**
     * Note for contra currency.
     * 
     */
    NOCC,

    /**
     * Settlement bank sort code of margin.
     * 
     */
    MSBS,

    /**
     * Margin settlement account number of CDC.
     * 
     */
    MSAN,

    /**
     * Account number of securities custodians.
     * 
     */
    SCAN,

    /**
     * Code of securities custodian institution.
     * 
     */
    SCIC,

    /**
     * Name of securities custodian institution.
     * 
     */
    SCIN,

    /**
     * Status of cash account.
     * 
     */
    SOCA,

    /**
     * Status of securities custodian account.
     * 
     */
    SSCA;

    public String value() {
        return name();
    }

    public static AccountInformationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
