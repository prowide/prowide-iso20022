
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCP"/&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="ITAG"/&gt;
 *     &lt;enumeration value="MTMG"/&gt;
 *     &lt;enumeration value="TMGT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType6Code")
@XmlEnum
public enum PartyType6Code {


    /**
     * Card acceptor, party accepting the card and presenting transaction data to the acquirer.
     * 
     */
    ACCP,

    /**
     * Merchant providing goods and service in the card payment transaction.
     * 
     */
    MERC,

    /**
     * Entity acquiring card transactions.
     * 
     */
    ACQR,

    /**
     * Party acting on behalf of other parties to process or forward data to other parties.
     * 
     */
    ITAG,

    /**
     * Responsible for the maintenance of a card payment acceptance terminal.
     * 
     */
    MTMG,

    /**
     * Responsible for one or several maintenance functions of a card payment acceptance terminal.
     * 
     */
    TMGT;

    public String value() {
        return name();
    }

    public static PartyType6Code fromValue(String v) {
        return valueOf(v);
    }

}
