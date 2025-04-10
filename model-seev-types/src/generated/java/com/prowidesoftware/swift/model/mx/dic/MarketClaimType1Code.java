
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketClaimType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MarketClaimType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MKTC"/>
 *     <enumeration value="RVMC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MarketClaimType1Code")
@XmlEnum
public enum MarketClaimType1Code {


    /**
     * Market claim that has been created due to a pending/failing settlement transaction, to ensure the event proceeds are delivered from the seller to the buyer.
     * 
     */
    MKTC,

    /**
     * Market claim that has been created due to a settled settlement transaction, to ensure the event proceeds are delivered from the buyer to the seller.
     * 
     */
    RVMC;

    public String value() {
        return name();
    }

    public static MarketClaimType1Code fromValue(String v) {
        return valueOf(v);
    }

}
