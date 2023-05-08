
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialPartySectorType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancialPartySectorType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AIFD"/>
 *     <enumeration value="ASSU"/>
 *     <enumeration value="CDTI"/>
 *     <enumeration value="INUN"/>
 *     <enumeration value="INVF"/>
 *     <enumeration value="ORPI"/>
 *     <enumeration value="REIN"/>
 *     <enumeration value="UCIT"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinancialPartySectorType1Code")
@XmlEnum
public enum FinancialPartySectorType1Code {


    /**
     * Alternative investment fund managed by an alternative investment fund manager (AIFM).
     * 
     */
    AIFD,

    /**
     * Assurance undertaking.
     * 
     * 
     */
    ASSU,

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
     * Investment firm.
     * 
     * 
     */
    INVF,

    /**
     * Institution for occupational retirement provision established for the purpose of providing retirement benefits in the context of an occupational activity.
     * 
     */
    ORPI,

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
     * Other type of financial institution.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static FinancialPartySectorType1Code fromValue(String v) {
        return valueOf(v);
    }

}
