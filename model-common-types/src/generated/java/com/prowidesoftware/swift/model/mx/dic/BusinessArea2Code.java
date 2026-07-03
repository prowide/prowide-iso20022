
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessArea2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessArea2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AIBD"/&gt;
 *     &lt;enumeration value="PPAY"/&gt;
 *     &lt;enumeration value="TKNF"/&gt;
 *     &lt;enumeration value="EOPT"/&gt;
 *     &lt;enumeration value="TOPT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessArea2Code")
@XmlEnum
public enum BusinessArea2Code {


    /**
     * The payment is initiated by an artificial intelligence based decision.
     * 
     */
    AIBD,

    /**
     * The card is used to perform a plain payment.
     * 
     */
    PPAY,

    /**
     * The card is used in a Transit business case where the fare amount is known when the transaction is initiated.
     * 
     */
    TKNF,

    /**
     * Indicates when the card is used in an energy business case where the amount could not be assessed when the transaction is initiated.
     * 
     */
    EOPT,

    /**
     * Indicates when the card is used in a transit business case where the fare amount is not known when the transaction is initiated.
     * 
     */
    TOPT;

    public String value() {
        return name();
    }

    public static BusinessArea2Code fromValue(String v) {
        return valueOf(v);
    }

}
