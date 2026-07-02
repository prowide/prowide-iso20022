
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOrderType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundOrderType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BEDB"/&gt;
 *     &lt;enumeration value="INVP"/&gt;
 *     &lt;enumeration value="PREA"/&gt;
 *     &lt;enumeration value="STAF"/&gt;
 *     &lt;enumeration value="RGSV"/&gt;
 *     &lt;enumeration value="RGSU"/&gt;
 *     &lt;enumeration value="RDIV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FundOrderType4Code")
@XmlEnum
public enum FundOrderType4Code {


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
     * Investment fund order is paying extra money into to an existing plan (only applicable to a subscription).
     * 
     */
    RGSU,

    /**
     * Investment fund order is a dividend reinvestment (only applicable to a subscription).
     * 
     */
    RDIV;

    public String value() {
        return name();
    }

    public static FundOrderType4Code fromValue(String v) {
        return valueOf(v);
    }

}
