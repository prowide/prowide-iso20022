
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesEntryType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesEntryType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BLOK"/>
 *     <enumeration value="ELIG"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="NOMI"/>
 *     <enumeration value="SETD"/>
 *     <enumeration value="BORR"/>
 *     <enumeration value="LOAN"/>
 *     <enumeration value="SPOS"/>
 *     <enumeration value="TRAD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesEntryType1Code")
@XmlEnum
public enum SecuritiesEntryType1Code {


    /**
     * Balance of securities that are blocked or frozen. A financial instrument may be unavailable due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy.
     * 
     */
    BLOK,

    /**
     * Total number of securities eligible for this event.
     * 
     */
    ELIG,

    /**
     * Balance of securities that are pending delivery.
     * 
     */
    PEND,

    /**
     * Balance of securities that are pending receipt.
     * 
     */
    PENR,

    /**
     * Balance of securities that are registered (in the name of a nominee or of the beneficial owner).
     * 
     */
    NOMI,

    /**
     * Balance of securities representing only settled transactions.
     * 
     */
    SETD,

    /**
     * Balance of securities that have been borrowed from another party.
     * 
     */
    BORR,

    /**
     * Balance of securities that have been loaned to a third party.
     * 
     */
    LOAN,

    /**
     * Balance of securities that remain registered in the name of the prior beneficial owner of securities.
     * 
     */
    SPOS,

    /**
     * Balance of securities representing traded transactions.
     * 
     */
    TRAD;

    public String value() {
        return name();
    }

    public static SecuritiesEntryType1Code fromValue(String v) {
        return valueOf(v);
    }

}
