
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LimitType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EXGT"/>
 *     <enumeration value="UCDT"/>
 *     <enumeration value="ACOL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LimitType4Code")
@XmlEnum
public enum LimitType4Code {


    /**
     * Limit is related to a cap amount granted by a national central bank or a settlement bank.
     * 
     */
    EXGT,

    /**
     * Limit is related to a cap amount granted by a national central bank or a settlement bank, but generally unsecured outside of the market infrastructure.
     * 
     */
    UCDT,

    /**
     * Limit is related to a credit operation that is or can be triggered when a buyer does not have a sufficient amount of money to settle a securities transaction in order to improve its cash position for the next settlement cycle. The credit provided can be secured using securities already held by the buyer (“collateral stocks”) or the securities that are being purchased (“collateral flows”).
     * 
     */
    ACOL;

    public String value() {
        return name();
    }

    public static LimitType4Code fromValue(String v) {
        return valueOf(v);
    }

}
