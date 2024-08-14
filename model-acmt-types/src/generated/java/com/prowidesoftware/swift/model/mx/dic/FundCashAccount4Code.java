
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundCashAccount4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundCashAccount4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HEDG"/>
 *     <enumeration value="CPFO"/>
 *     <enumeration value="CPFS"/>
 *     <enumeration value="SRSA"/>
 *     <enumeration value="CSDO"/>
 *     <enumeration value="TOFF"/>
 *     <enumeration value="ICSA"/>
 *     <enumeration value="CSDM"/>
 *     <enumeration value="CSDP"/>
 *     <enumeration value="PPEN"/>
 *     <enumeration value="CPEN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundCashAccount4Code")
@XmlEnum
public enum FundCashAccount4Code {


    /**
     * Hedge fund account.
     * 
     */
    HEDG,

    /**
     * Central Provident Fund (CPF) ordinary account.
     * 
     */
    CPFO,

    /**
     * Central Provident Fund (CPF) special account.
     * 
     */
    CPFS,

    /**
     * Supplementary Retirement Scheme (SRS) account.
     * 
     */
    SRSA,

    /**
     * Account operated by a CSD in cross-CSD settlement context.
     * 
     */
    CSDO,

    /**
     * Account operated by a CSD in a direct holding market context.
     * 
     */
    TOFF,

    /**
     * Account operated by a CSD for settlement of securities legs for instructions involving internal CSDs.
     * 
     */
    ICSA,

    /**
     * Account operated by a CSD for mirroring positions.
     * 
     */
    CSDM,

    /**
     * Account owned by a CSD participant.
     * 
     */
    CSDP,

    /**
     * Private pension account.
     * 
     */
    PPEN,

    /**
     * Workplace or company pension account.
     * 
     */
    CPEN;

    public String value() {
        return name();
    }

    public static FundCashAccount4Code fromValue(String v) {
        return valueOf(v);
    }

}
