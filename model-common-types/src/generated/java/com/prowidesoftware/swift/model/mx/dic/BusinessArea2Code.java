
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessArea2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BusinessArea2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AIBD"/>
 *     <enumeration value="PPAY"/>
 *     <enumeration value="TKNF"/>
 *     <enumeration value="EOPT"/>
 *     <enumeration value="TOPT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
