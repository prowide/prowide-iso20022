
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesAccountPurposeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesAccountPurposeType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MARG"/>
 *     <enumeration value="SHOR"/>
 *     <enumeration value="ABRD"/>
 *     <enumeration value="CEND"/>
 *     <enumeration value="DVPA"/>
 *     <enumeration value="PHYS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesAccountPurposeType1Code")
@XmlEnum
public enum SecuritiesAccountPurposeType1Code {


    /**
     * Account is used when financing is done by the broker.
     * 
     */
    MARG,

    /**
     * Account is used for short sale orders.
     * 
     */
    SHOR,

    /**
     * Account is located in a financial institution outside the country where the transaction is taking place.
     * 
     */
    ABRD,

    /**
     * Account and all its related positions are held in one location.
     * 
     */
    CEND,

    /**
     * Account is used for settlement upon delivery, or a collection on a delivery basis.
     * 
     */
    DVPA,

    /**
     * Account is used for physical domestic safekeeping.
     * 
     */
    PHYS;

    public String value() {
        return name();
    }

    public static SecuritiesAccountPurposeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
