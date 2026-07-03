
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesAccountPurposeType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesAccountPurposeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MARG"/&gt;
 *     &lt;enumeration value="SHOR"/&gt;
 *     &lt;enumeration value="ABRD"/&gt;
 *     &lt;enumeration value="CEND"/&gt;
 *     &lt;enumeration value="DVPA"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
