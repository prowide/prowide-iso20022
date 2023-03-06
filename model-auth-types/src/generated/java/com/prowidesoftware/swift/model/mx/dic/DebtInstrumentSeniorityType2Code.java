
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebtInstrumentSeniorityType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DebtInstrumentSeniorityType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SBOD"/&gt;
 *     &lt;enumeration value="SNDB"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DebtInstrumentSeniorityType2Code")
@XmlEnum
public enum DebtInstrumentSeniorityType2Code {


    /**
     * Debt owed to an unsecured creditor that can only be paid, in the event of a liquidation, after the claims of secured creditors have been met.
     * 
     */
    SBOD,

    /**
     * Debt that takes priority over other unsecured or otherwise more junior debt owed by the issuer.
     * 
     */
    SNDB,

    /**
     * Other type of debts.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static DebtInstrumentSeniorityType2Code fromValue(String v) {
        return valueOf(v);
    }

}
