
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Eligibility1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Eligibility1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ELIG"/&gt;
 *     &lt;enumeration value="RETL"/&gt;
 *     &lt;enumeration value="PROF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Eligibility1Code")
@XmlEnum
public enum Eligibility1Code {


    /**
     * Eligible customers are the most sophisticated level of investor, able to opt out of some the protections afforded by conduct of business rules.
     * 
     */
    ELIG,

    /**
     * Retail customers are the least sophisticated level of investor.
     * 
     */
    RETL,

    /**
     * Professional customers are, for example, investment firms, credit institutions, insurance companies.
     * 
     */
    PROF;

    public String value() {
        return name();
    }

    public static Eligibility1Code fromValue(String v) {
        return valueOf(v);
    }

}
