
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyType16Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACQR"/>
 *     <enumeration value="CISS"/>
 *     <enumeration value="DLIS"/>
 *     <enumeration value="ITAG"/>
 *     <enumeration value="OTRM"/>
 *     <enumeration value="BKAF"/>
 *     <enumeration value="BKAT"/>
 *     <enumeration value="ATMG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
