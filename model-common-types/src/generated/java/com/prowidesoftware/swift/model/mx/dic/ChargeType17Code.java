
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ChargeType17Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="POST"/>
 *     <enumeration value="REGF"/>
 *     <enumeration value="SHIP"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PREM"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="PICK"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="INSU"/>
 *     <enumeration value="MISC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ChargeType17Code")
@XmlEnum
public enum ChargeType17Code {


    /**
     * Charge paid for the postage.
     * 
     */
    POST,

    /**
     * Fee charged by a regulatory authority, eg, Securities and Exchange fees.
     * 
     */
    REGF,

    /**
     * Charge for shipping, including the insurance of securities.
     * 
     */
    SHIP,

    /**
     * Fee paid for the provision of financial services.
     * 
     */
    CHAR,

    /**
     * Another type of charge.
     * 
     */
    OTHR,

    /**
     * In investment funds, pre-arranged addition to the trade amount based on the published net asset value.
     * 
     */
    PREM,

    /**
     * Charge is for packaging of goods.
     * 
     */
    PACK,

    /**
     * Charge is for pick-up of goods.
     * 
     */
    PICK,

    /**
     * Charge is for security.
     * 
     */
    SECU,

    /**
     * Charge is a premium for insurance.
     * 
     */
    INSU,

    /**
     * Miscellaneous fee.
     * 
     */
    MISC;

    public String value() {
        return name();
    }

    public static ChargeType17Code fromValue(String v) {
        return valueOf(v);
    }

}
