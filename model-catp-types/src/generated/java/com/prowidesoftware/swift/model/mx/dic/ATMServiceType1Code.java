
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMServiceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CHSN"/>
 *     <enumeration value="PATH"/>
 *     <enumeration value="PRFL"/>
 *     <enumeration value="STDR"/>
 *     <enumeration value="SPRV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMServiceType1Code")
@XmlEnum
public enum ATMServiceType1Code {


    /**
     * Amount and notes values are chosen by the customer.
     * 
     */
    CHSN,

    /**
     * Withdrawal transaction was pre-authorised by another channel, for instance a mobile. The amount could be absent from the withdrawal request message.
     * 
     */
    PATH,

    /**
     * Amount and notes Values are pre-defined by the customer profile.
     * 
     */
    PRFL,

    /**
     * Standard withdrawal of items.
     * 
     */
    STDR,

    /**
     * Withdrawal authorised by a supervisor.
     * 
     */
    SPRV;

    public String value() {
        return name();
    }

    public static ATMServiceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
