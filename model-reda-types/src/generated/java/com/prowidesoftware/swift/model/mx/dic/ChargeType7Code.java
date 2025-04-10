
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ChargeType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MANF"/>
 *     <enumeration value="BEND"/>
 *     <enumeration value="ADVI"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="PUBL"/>
 *     <enumeration value="ACCT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="EQUL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ChargeType7Code")
@XmlEnum
public enum ChargeType7Code {


    /**
     * Fee paid to an investment manager for services. The fee usually includes fund administration costs and investor relationship management. Typically, the amount paid is a percentage of the assets under management.
     * 
     */
    MANF,

    /**
     * Sales charge paid by the investor when redeeming an investment such as an investment fund.
     * 
     */
    BEND,

    /**
     * Fee paid for advisory services rendered.
     * 
     */
    ADVI,

    /**
     * Fee paid to a custodian in respect of custodial services.
     * 
     */
    CUST,

    /**
     * Fee paid in respect of publications made.
     * 
     */
    PUBL,

    /**
     * Fee paid for accounting services rendered.
     * 
     */
    ACCT,

    /**
     * Another type of charge.
     * 
     */
    OTHR,

    /**
     * The part of an investor's subscription amount that is held by the fund in order to pay incentive or performance fees at the end of the fiscal year.
     * 
     */
    EQUL;

    public String value() {
        return name();
    }

    public static ChargeType7Code fromValue(String v) {
        return valueOf(v);
    }

}
