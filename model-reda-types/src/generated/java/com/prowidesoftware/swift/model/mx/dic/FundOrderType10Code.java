
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOrderType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundOrderType10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SUBS"/>
 *     <enumeration value="RDIV"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="RGSV"/>
 *     <enumeration value="WIDP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundOrderType10Code")
@XmlEnum
public enum FundOrderType10Code {


    /**
     * Investment fund order is a subscription.
     * 
     */
    SUBS,

    /**
     * Investment fund order is a dividend reinvestment (only applicable to a subscription).
     * 
     */
    RDIV,

    /**
     * Investment fund order is a redemption.
     * 
     */
    REDM,

    /**
     * Investment fund order is a regular savings plan (only applicable to a subscription).
     * 
     */
    RGSV,

    /**
     * Investment fund order is for a withdrawal investment plan (only applicable to a redemption).
     * 
     */
    WIDP;

    public String value() {
        return name();
    }

    public static FundOrderType10Code fromValue(String v) {
        return valueOf(v);
    }

}
