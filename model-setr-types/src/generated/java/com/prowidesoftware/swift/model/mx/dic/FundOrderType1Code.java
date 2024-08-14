
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOrderType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundOrderType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SUBS"/>
 *     <enumeration value="REDM"/>
 *     <enumeration value="SWIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundOrderType1Code")
@XmlEnum
public enum FundOrderType1Code {


    /**
     * Investment fund order is a subscription.
     * 
     */
    SUBS,

    /**
     * Investment fund order is a redemption.
     * 
     */
    REDM,

    /**
     * Investment fund order is a switch.
     * 
     */
    SWIT;

    public String value() {
        return name();
    }

    public static FundOrderType1Code fromValue(String v) {
        return valueOf(v);
    }

}
