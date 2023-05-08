
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesBalanceType9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AVLB"/>
 *     <enumeration value="ELEC"/>
 *     <enumeration value="UNEL"/>
 *     <enumeration value="RDIS"/>
 *     <enumeration value="RREM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType9Code")
@XmlEnum
public enum SecuritiesBalanceType9Code {


    /**
     * Balance of money or securities that is at the disposal of the account owner on the date specified.
     * 
     */
    AVLB,

    /**
     * Balance of instructed position.
     * 
     */
    ELEC,

    /**
     * Balance of uninstructed position.
     * 
     */
    UNEL,

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

    public static SecuritiesBalanceType9Code fromValue(String v) {
        return valueOf(v);
    }

}
