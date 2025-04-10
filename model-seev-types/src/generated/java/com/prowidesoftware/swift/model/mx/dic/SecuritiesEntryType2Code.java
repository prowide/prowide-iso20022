
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesEntryType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesEntryType2Code">
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
 *     <enumeration value="COLI"/>
 *     <enumeration value="COLO"/>
 *     <enumeration value="UNBA"/>
 *     <enumeration value="INBA"/>
 *     <enumeration value="REGO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesEntryType2Code")
@XmlEnum
public enum SecuritiesEntryType2Code {


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
    TRAD,

    /**
     * Balance of securities that belong to a third party and that are held for the purpose of collateralisation.
     * 
     */
    COLI,

    /**
     * Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.
     * 
     */
    COLO,

    /**
     * Balance of uninstructed position.
     * 
     */
    UNBA,

    /**
     * Balance of instructed position.
     * 
     */
    INBA,

    /**
     * Balance of securities currently being processed by the institution responsible for registering the new beneficial owner (or nominee) of securities after a transaction has settled.
     * 
     */
    REGO;

    public String value() {
        return name();
    }

    public static SecuritiesEntryType2Code fromValue(String v) {
        return valueOf(v);
    }

}
