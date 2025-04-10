
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyType13Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACQR"/>
 *     <enumeration value="CISS"/>
 *     <enumeration value="DLIS"/>
 *     <enumeration value="ITAG"/>
 *     <enumeration value="OTRM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyType13Code")
@XmlEnum
public enum PartyType13Code {


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
    OTRM;

    public String value() {
        return name();
    }

    public static PartyType13Code fromValue(String v) {
        return valueOf(v);
    }

}
