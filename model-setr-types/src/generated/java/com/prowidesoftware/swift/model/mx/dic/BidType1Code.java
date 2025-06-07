
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NDIS"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="NOBI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
