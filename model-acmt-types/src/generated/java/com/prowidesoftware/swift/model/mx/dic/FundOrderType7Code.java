
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOrderType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundOrderType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALLL"/>
 *     <enumeration value="BUYI"/>
 *     <enumeration value="SELL"/>
 *     <enumeration value="SWII"/>
 *     <enumeration value="SWIO"/>
 *     <enumeration value="TRAI"/>
 *     <enumeration value="TRAO"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="REDM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundOrderType7Code")
@XmlEnum
public enum FundOrderType7Code {


    /**
     * All type of orders.
     * 
     */
    ALLL,

    /**
     * Purchase of securities.
     * 
     */
    BUYI,

    /**
     * Sale of securities.
     * 
     */
    SELL,

    /**
     * Switch out or switch from.
     * 
     */
    SWII,

    /**
     * Switch in or switch to.
     * 
     */
    SWIO,

    /**
     * Transfer in.
     * 
     */
    TRAI,

    /**
     * Transfer out.
     * 
     */
    TRAO,

    /**
     * Investment fund order is a subscription.
     * 
     */
    SUBS,

    /**
     * Investment fund order is a redemption.
     * 
     */
    REDM;

    public String value() {
        return name();
    }

    public static FundOrderType7Code fromValue(String v) {
        return valueOf(v);
    }

}
