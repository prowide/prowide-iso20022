
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialPartySectorType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinancialPartySectorType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AIFD"/&gt;
 *     &lt;enumeration value="CSDS"/&gt;
 *     &lt;enumeration value="CCPS"/&gt;
 *     &lt;enumeration value="CDTI"/&gt;
 *     &lt;enumeration value="INUN"/&gt;
 *     &lt;enumeration value="ORPI"/&gt;
 *     &lt;enumeration value="INVF"/&gt;
 *     &lt;enumeration value="REIN"/&gt;
 *     &lt;enumeration value="UCIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
