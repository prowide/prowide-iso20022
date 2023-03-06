
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyType10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCP"/&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="ATMG"/&gt;
 *     &lt;enumeration value="CISS"/&gt;
 *     &lt;enumeration value="DLIS"/&gt;
 *     &lt;enumeration value="HSTG"/&gt;
 *     &lt;enumeration value="ITAG"/&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="OATM"/&gt;
 *     &lt;enumeration value="OPOI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType10Code")
@XmlEnum
public enum PartyType10Code {


    /**
     * Card acceptor, party accepting the card and presenting transaction data to the acquirer.
     * 
     */
    ACCP,

    /**
     * Entity acquiring card transactions.
     * 
     */
    ACQR,

    /**
     * Entity managing the ATM.
     * 
     */
    ATMG,

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
     * Entity hosting the ATM.
     * 
     */
    HSTG,

    /**
     * Party acting on behalf of other parties to process or forward data to other parties.
     * 
     */
    ITAG,

    /**
     * Merchant providing goods and service in the card payment transaction.
     * 
     */
    MERC,

    /**
     * ATM initiating the transaction.
     * 
     */
    OATM,

    /**
     * Point Of Interaction initiating the card payment transaction.
     * 
     */
    OPOI;

    public String value() {
        return name();
    }

    public static PartyType10Code fromValue(String v) {
        return valueOf(v);
    }

}
