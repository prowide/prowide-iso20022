
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderOriginatorEligibility1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OrderOriginatorEligibility1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ELIG"/>
 *     <enumeration value="RETL"/>
 *     <enumeration value="PROF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
