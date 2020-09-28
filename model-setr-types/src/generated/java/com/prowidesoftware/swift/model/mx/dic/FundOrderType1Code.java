
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOrderType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundOrderType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUBS"/&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="SWIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
