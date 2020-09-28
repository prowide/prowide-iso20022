
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesEntryType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesEntryType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BLOK"/&gt;
 *     &lt;enumeration value="ELIG"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="PENR"/&gt;
 *     &lt;enumeration value="NOMI"/&gt;
 *     &lt;enumeration value="SETD"/&gt;
 *     &lt;enumeration value="BORR"/&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="SPOS"/&gt;
 *     &lt;enumeration value="TRAD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Balance of securities representing only settled transactions
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
     * Balance of securities representing traded transactions
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
