
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOrderType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundOrderType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALLL"/&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="SUBS"/&gt;
 *     &lt;enumeration value="SWII"/&gt;
 *     &lt;enumeration value="SWIO"/&gt;
 *     &lt;enumeration value="TRAI"/&gt;
 *     &lt;enumeration value="TRAO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
