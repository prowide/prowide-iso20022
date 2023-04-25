
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOrderType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundOrderType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BEDB"/>
 *     <enumeration value="INVP"/>
 *     <enumeration value="PREA"/>
 *     <enumeration value="STAF"/>
 *     <enumeration value="RGSV"/>
 *     <enumeration value="RDIV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundOrderType3Code")
@XmlEnum
public enum FundOrderType3Code {


    /**
     * Investment fund order is part of a bed and breakfast transaction.
     * 
     */
    BEDB,

    /**
     * Investment fund order is related to an investment plan (only applicable to a subscription).
     * 
     */
    INVP,

    /**
     * Investment fund order is executed with specific pre-advice conditions.
     * 
     */
    PREA,

    /**
     * Investment fund order is a staff order.
     * 
     */
    STAF,

    /**
     * Investment fund order is a regular savings plan (only applicable to a subscription).
     * 
     */
    RGSV,

    /**
     * Investment fund order is a dividend reinvestment (only applicable to a subscription).
     * 
     */
    RDIV;

    public String value() {
        return name();
    }

    public static FundOrderType3Code fromValue(String v) {
        return valueOf(v);
    }

}
