
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMServiceType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MCHG"/>
 *     <enumeration value="DPSN"/>
 *     <enumeration value="DPSV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMServiceType6Code")
@XmlEnum
public enum ATMServiceType6Code {


    /**
     * Making change between media types.
     * 
     */
    MCHG,

    /**
     * Deposit of media items unverified by the ATM, for instance in an envelope.
     * 
     */
    DPSN,

    /**
     * Deposit of media items verified by the ATM.
     * 
     */
    DPSV;

    public String value() {
        return name();
    }

    public static ATMServiceType6Code fromValue(String v) {
        return valueOf(v);
    }

}
