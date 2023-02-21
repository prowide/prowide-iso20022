
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ERISAEligibility1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ERISAEligibility1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ELIG"/&gt;
 *     &lt;enumeration value="NELI"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ERISAEligibility1Code")
@XmlEnum
public enum ERISAEligibility1Code {


    /**
     * Investor is subject to an ERISA declaration.
     * 
     */
    ELIG,

    /**
     * Investment is not subject to an ERISA declaration.
     * 
     */
    NELI,

    /**
     * Eligibility is unknown at the time the order is sent, and the instructing party will confirm later.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static ERISAEligibility1Code fromValue(String v) {
        return valueOf(v);
    }

}
