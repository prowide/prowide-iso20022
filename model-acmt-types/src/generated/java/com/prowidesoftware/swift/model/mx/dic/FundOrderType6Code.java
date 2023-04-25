
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOrderType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundOrderType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALLL"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="SWII"/>
 *     <enumeration value="SWIO"/>
 *     <enumeration value="TRAI"/>
 *     <enumeration value="TRAO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundOrderType6Code")
@XmlEnum
public enum FundOrderType6Code {


    /**
     * All type of orders.
     * 
     */
    ALLL,

    /**
     * Investment fund order is a redemption.
     * 
     */
    REDM,

    /**
     * Investment fund order is a subscription.
     * 
     */
    SUBS,

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
    TRAO;

    public String value() {
        return name();
    }

    public static FundOrderType6Code fromValue(String v) {
        return valueOf(v);
    }

}
