
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyType12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="ATMG"/&gt;
 *     &lt;enumeration value="CISP"/&gt;
 *     &lt;enumeration value="DLIS"/&gt;
 *     &lt;enumeration value="HSTG"/&gt;
 *     &lt;enumeration value="ITAG"/&gt;
 *     &lt;enumeration value="OATM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType12Code")
@XmlEnum
public enum PartyType12Code {


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
     * Entity providing issuing card payment processing services on behalf on an issuer.
     * 
     */
    CISP,

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
     * ATM initiating the transaction.
     * 
     */
    OATM;

    public String value() {
        return name();
    }

    public static PartyType12Code fromValue(String v) {
        return valueOf(v);
    }

}
