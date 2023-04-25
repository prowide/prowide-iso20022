
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountInformationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountInformationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IBND"/>
 *     <enumeration value="IBCC"/>
 *     <enumeration value="IBDC"/>
 *     <enumeration value="BIBC"/>
 *     <enumeration value="BIBD"/>
 *     <enumeration value="BINC"/>
 *     <enumeration value="BIND"/>
 *     <enumeration value="BICC"/>
 *     <enumeration value="BIDC"/>
 *     <enumeration value="CMSA"/>
 *     <enumeration value="CBBC"/>
 *     <enumeration value="CBBD"/>
 *     <enumeration value="CBNC"/>
 *     <enumeration value="CBND"/>
 *     <enumeration value="CBCC"/>
 *     <enumeration value="CBDC"/>
 *     <enumeration value="CUAC"/>
 *     <enumeration value="DEAC"/>
 *     <enumeration value="FCAA"/>
 *     <enumeration value="FCAN"/>
 *     <enumeration value="FCBN"/>
 *     <enumeration value="IBBC"/>
 *     <enumeration value="IBBD"/>
 *     <enumeration value="IBNC"/>
 *     <enumeration value="MCAA"/>
 *     <enumeration value="MCAN"/>
 *     <enumeration value="MCIC"/>
 *     <enumeration value="MCIN"/>
 *     <enumeration value="MSAA"/>
 *     <enumeration value="MSBN"/>
 *     <enumeration value="MCAD"/>
 *     <enumeration value="NODC"/>
 *     <enumeration value="SCAC"/>
 *     <enumeration value="SCAA"/>
 *     <enumeration value="OMSA"/>
 *     <enumeration value="NOCC"/>
 *     <enumeration value="MSBS"/>
 *     <enumeration value="MSAN"/>
 *     <enumeration value="SCAN"/>
 *     <enumeration value="SCIC"/>
 *     <enumeration value="SCIN"/>
 *     <enumeration value="SOCA"/>
 *     <enumeration value="SSCA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
