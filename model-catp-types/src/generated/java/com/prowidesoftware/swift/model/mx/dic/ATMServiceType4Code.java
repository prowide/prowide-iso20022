
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMServiceType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASTS"/>
 *     <enumeration value="BLCQ"/>
 *     <enumeration value="DPST"/>
 *     <enumeration value="PINC"/>
 *     <enumeration value="STDR"/>
 *     <enumeration value="PRFL"/>
 *     <enumeration value="PATH"/>
 *     <enumeration value="CHSN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMServiceType4Code")
@XmlEnum
public enum ATMServiceType4Code {


    /**
     * Ask for account statement information to a related custumer account.
     * 
     */
    ASTS,

    /**
     * Balance inquiry.
     * 
     */
    BLCQ,

    /**
     * Deposit of items.
     * 
     */
    DPST,

    /**
     * Modification of the card PIN value.
     * 
     */
    PINC,

    /**
     * Standard withdrawal of items.
     * 
     */
    STDR,

    /**
     * Amount and notes Values are pre-defined by the customer profile.
     * 
     */
    PRFL,

    /**
     * Withdrawal transaction was pre-authorised by another channel, for instance a mobile. The amount could be absent from the withdrawal request message.
     * 
     */
    PATH,

    /**
     * Amount and notes values are chosen by the customer.
     * 
     */
    CHSN;

    public String value() {
        return name();
    }

    public static ATMServiceType4Code fromValue(String v) {
        return valueOf(v);
    }

}
