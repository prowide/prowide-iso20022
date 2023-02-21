
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionParty1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionParty1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SLLR"/&gt;
 *     &lt;enumeration value="BYER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptionParty1Code")
@XmlEnum
public enum OptionParty1Code {


    /**
     * Seller in a trade.
     * 
     */
    SLLR,

    /**
     * Buyer in a trade.
     * 
     */
    BYER;

    public String value() {
        return name();
    }

    public static OptionParty1Code fromValue(String v) {
        return valueOf(v);
    }

}
