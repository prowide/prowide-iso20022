
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesBalanceType10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AVLB"/>
 *     <enumeration value="REST"/>
 *     <enumeration value="RDIS"/>
 *     <enumeration value="RREM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType10Code")
@XmlEnum
public enum SecuritiesBalanceType10Code {


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

    public static SecuritiesBalanceType10Code fromValue(String v) {
        return valueOf(v);
    }

}
