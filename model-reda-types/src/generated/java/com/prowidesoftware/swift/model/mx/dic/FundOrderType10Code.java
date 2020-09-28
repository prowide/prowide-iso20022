
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOrderType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundOrderType10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUBS"/&gt;
 *     &lt;enumeration value="RDIV"/&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="RGSV"/&gt;
 *     &lt;enumeration value="WIDP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
