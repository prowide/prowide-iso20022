
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyType16Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="CISS"/&gt;
 *     &lt;enumeration value="DLIS"/&gt;
 *     &lt;enumeration value="ITAG"/&gt;
 *     &lt;enumeration value="OTRM"/&gt;
 *     &lt;enumeration value="BKAF"/&gt;
 *     &lt;enumeration value="BKAT"/&gt;
 *     &lt;enumeration value="ATMG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType16Code")
@XmlEnum
public enum PartyType16Code {


    /**
     * Entity acquiring card transactions.
     * 
     */
    ACQR,

    /**
     * Party that issues cards.
     * 
     */
    CISS,

    /**
     * Party to whom the card issuer delegates to authorise card payment transactions.
     * 
     */
    DLIS,

    /**
     * Party acting on behalf of other parties to process or forward data to other parties.
     * 
     */
    ITAG,

    /**
     * Application on the terminal which has initiated the transaction.
     * 
     */
    OTRM,

    /**
     * The bank of the source account.
     * 
     */
    BKAF,

    /**
     * The bank of the destination account.
     * 
     */
    BKAT,

    /**
     * Entity managing the ATM.
     * 
     */
    ATMG;

    public String value() {
        return name();
    }

    public static PartyType16Code fromValue(String v) {
        return valueOf(v);
    }

}
