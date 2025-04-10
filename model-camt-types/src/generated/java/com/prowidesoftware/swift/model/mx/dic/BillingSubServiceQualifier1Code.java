
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingSubServiceQualifier1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BillingSubServiceQualifier1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LBOX"/>
 *     <enumeration value="STOR"/>
 *     <enumeration value="BILA"/>
 *     <enumeration value="SEQN"/>
 *     <enumeration value="MACT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BillingSubServiceQualifier1Code")
@XmlEnum
public enum BillingSubServiceQualifier1Code {


    /**
     * Subservice code contains a lockbox number which identifies the lockbox using the service.
     * 
     */
    LBOX,

    /**
     * Subservice code contains a store number which identifies the store using the service.
     * 
     */
    STOR,

    /**
     * Meaning of the subservice code is established by the trading partners.
     * 
     */
    BILA,

    /**
     * Subservice code is an arbitrary sequence number used to uniquely identify this Service and prevent duplicate services within this statement.
     * 
     */
    SEQN,

    /**
     * Subservice code is the account number of a member of a relationship structure. This allows a parent statement to include the same service as rolled up from its member accounts and still avoid duplicate service identification within the statement.
     * 
     */
    MACT;

    public String value() {
        return name();
    }

    public static BillingSubServiceQualifier1Code fromValue(String v) {
        return valueOf(v);
    }

}
