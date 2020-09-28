
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOrderType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundOrderType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BEDB"/&gt;
 *     &lt;enumeration value="INVP"/&gt;
 *     &lt;enumeration value="PREA"/&gt;
 *     &lt;enumeration value="STAF"/&gt;
 *     &lt;enumeration value="RGSV"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FundOrderType2Code")
@XmlEnum
public enum FundOrderType2Code {


    /**
     * Investment fund order is part of a bed and breakfast transaction.
     * 
     */
    BEDB,

    /**
     * Investment fund order is related to an investment plan.
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
     * Investment fund order is a regular savings plan.
     * 
     */
    RGSV,

    /**
     * Another type of investment fund order.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static FundOrderType2Code fromValue(String v) {
        return valueOf(v);
    }

}
