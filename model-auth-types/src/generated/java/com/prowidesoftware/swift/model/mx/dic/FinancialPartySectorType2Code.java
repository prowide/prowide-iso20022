
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialPartySectorType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancialPartySectorType2Code">
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
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinancialPartySectorType2Code")
@XmlEnum
public enum FinancialPartySectorType2Code {


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
    UCIT;

    public String value() {
        return name();
    }

    public static FinancialPartySectorType2Code fromValue(String v) {
        return valueOf(v);
    }

}
