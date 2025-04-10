
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialPartySectorType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancialPartySectorType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AIFD"/>
 *     <enumeration value="CSDS"/>
 *     <enumeration value="CCPS"/>
 *     <enumeration value="CDTI"/>
 *     <enumeration value="INUN"/>
 *     <enumeration value="ORPI"/>
 *     <enumeration value="INVF"/>
 *     <enumeration value="REIN"/>
 *     <enumeration value="UCIT"/>
 *     <enumeration value="ASSU"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinancialPartySectorType3Code")
@XmlEnum
public enum FinancialPartySectorType3Code {


    /**
     * Alternative investment fund managed by an alternative investment fund manager (AIFM).
     * 
     */
    AIFD,

    /**
     * Central securities depository.
     * 
     */
    CSDS,

    /**
     * Central counterparty.
     * 
     */
    CCPS,

    /**
     * Credit institution that takes deposits or other repayable funds from the public and grants credits for its own account.
     * 
     * 
     */
    CDTI,

    /**
     * Insurance undertaking.
     * 
     */
    INUN,

    /**
     * Institution for occupational retirement provision established for the purpose of providing retirement benefits in the context of an occupational activity.
     * 
     */
    ORPI,

    /**
     * Investment firm.
     * 
     * 
     */
    INVF,

    /**
     * Reinsurance undertaking performing the activity of accepting risks ceded by an insurance undertaking or by another reinsurance undertaking.
     * 
     */
    REIN,

    /**
     * Undertaking for collective investment in transferable securities (UCITS) and its management company.
     * 
     */
    UCIT,

    /**
     * Assurance undertaking.
     * 
     * 
     */
    ASSU,

    /**
     * Other type of financial institution.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static FinancialPartySectorType3Code fromValue(String v) {
        return valueOf(v);
    }

}
