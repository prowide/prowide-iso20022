
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesBalanceType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AVLB"/>
 *     <enumeration value="REST"/>
 *     <enumeration value="TENT"/>
 *     <enumeration value="RDIS"/>
 *     <enumeration value="RREM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType6Code")
@XmlEnum
public enum SecuritiesBalanceType6Code {


    /**
     * Balance of money or securities that is at the disposal of the account owner on the date specified.
     * 
     */
    AVLB,

    /**
     * Balance of cash that may only be used under certain conditions.
     * 
     * Balance type is used to block securities/cash in the client account e.g., in relation to elections relating to certain corporate actions. The holding is under the direct control of the system paying agent, who us the only one who can transfer securities out of this balance type.
     * Also known as the "escrow balance" or "sequestered balance".
     * 
     */
    REST,

    /**
     * Total quantity of financial instruments entitled to the account owner based on the terms of the corporate action event.
     * 
     */
    TENT,

    /**
     * Balance of financial instruments that are reserved for the distribution of the proceeds.
     * 
     */
    RDIS,

    /**
     * Balance of securities which are reserved temporarily in the SPA account before they will effectively be exchanged.
     * 
     */
    RREM;

    public String value() {
        return name();
    }

    public static SecuritiesBalanceType6Code fromValue(String v) {
        return valueOf(v);
    }

}
