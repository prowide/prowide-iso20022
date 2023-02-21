
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeType14Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADRF"/&gt;
 *     &lt;enumeration value="ISSC"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="MISC"/&gt;
 *     &lt;enumeration value="ISSU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeType14Code")
@XmlEnum
public enum ChargeType14Code {


    /**
     * Charge linked to an ADR (American Depositary Receipt).
     * 
     */
    ADRF,

    /**
     * Fee linked to the cancellation of an issuance.
     * 
     */
    ISSC,

    /**
     * Fee paid to a custodian in respect of custodial services.
     * 
     */
    CUST,

    /**
     * Fee paid for the provision of financial services.
     * 
     */
    CHAR,

    /**
     * Miscellaneous fee.
     * 
     */
    MISC,

    /**
     * Charge linked to the issuance of security.
     * 
     */
    ISSU;

    public String value() {
        return name();
    }

    public static ChargeType14Code fromValue(String v) {
        return valueOf(v);
    }

}
