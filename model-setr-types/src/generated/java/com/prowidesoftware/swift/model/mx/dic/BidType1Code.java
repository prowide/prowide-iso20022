
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BidType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NDIS"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="NOBI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BidType1Code")
@XmlEnum
public enum BidType1Code {


    /**
     * Bid type is non disclosed.
     * 
     */
    NDIS,

    /**
     * Bid type is disclosed.
     * 
     */
    DISC,

    /**
     * List order is not related to a bid.
     * 
     */
    NOBI;

    public String value() {
        return name();
    }

    public static BidType1Code fromValue(String v) {
        return valueOf(v);
    }

}
