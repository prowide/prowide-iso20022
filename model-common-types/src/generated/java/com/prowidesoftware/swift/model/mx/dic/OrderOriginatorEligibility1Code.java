
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderOriginatorEligibility1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderOriginatorEligibility1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ELIG"/&gt;
 *     &lt;enumeration value="RETL"/&gt;
 *     &lt;enumeration value="PROF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderOriginatorEligibility1Code")
@XmlEnum
public enum OrderOriginatorEligibility1Code {


    /**
     * Eligible counterparty - MiFID classification of counterparty. Eligible customers are the most sophisticated level of investor, able to opt out of some the protections afforded by conduct of business rules defined under MiFID.
     * 
     */
    ELIG,

    /**
     * Retail client - MiFID classification of counterparty. Retail customers are the least sophisticated level of investor.
     * 
     */
    RETL,

    /**
     * Professional client - MiFID classification of counterparty. Professional customers are, for example, investment firms, credit institutions, insurance companies.
     * 
     */
    PROF;

    public String value() {
        return name();
    }

    public static OrderOriginatorEligibility1Code fromValue(String v) {
        return valueOf(v);
    }

}
