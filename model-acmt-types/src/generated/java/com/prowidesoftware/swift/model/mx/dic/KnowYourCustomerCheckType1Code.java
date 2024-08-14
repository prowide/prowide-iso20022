
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KnowYourCustomerCheckType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="KnowYourCustomerCheckType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ENHA"/>
 *     <enumeration value="ORDN"/>
 *     <enumeration value="SIMP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "KnowYourCustomerCheckType1Code")
@XmlEnum
public enum KnowYourCustomerCheckType1Code {


    /**
     * Enhanced check, typically carried out on accounts that are considered high risk.
     * 
     */
    ENHA,

    /**
     * Ordinary check, typically carried out on standard accounts.
     * 
     */
    ORDN,

    /**
     * Simple check, typically carried out on accounts that have a low risk of anti-money laundering, such as an account owned by a financial institution.
     * 
     */
    SIMP;

    public String value() {
        return name();
    }

    public static KnowYourCustomerCheckType1Code fromValue(String v) {
        return valueOf(v);
    }

}
