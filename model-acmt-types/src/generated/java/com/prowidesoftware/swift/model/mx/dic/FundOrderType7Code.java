
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOrderType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundOrderType7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALLL"/&gt;
 *     &lt;enumeration value="BUYI"/&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *     &lt;enumeration value="SWII"/&gt;
 *     &lt;enumeration value="SWIO"/&gt;
 *     &lt;enumeration value="TRAI"/&gt;
 *     &lt;enumeration value="TRAO"/&gt;
 *     &lt;enumeration value="SUBS"/&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
