
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountOwnerType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountOwnerType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="POWN"/>
 *     <enumeration value="TRUS"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="NOMI"/>
 *     <enumeration value="SECO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountOwnerType1Code")
@XmlEnum
public enum AccountOwnerType1Code {


    /**
     * Owner of the property. The ownership can be split among several owners, and the primary owner is the one giving its address and account details for the registration.
     * 
     */
    POWN,

    /**
     * Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership.
     * 
     */
    TRUS,

    /**
     * Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.
     * 
     */
    CUST,

    /**
     * Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary.
     * 
     */
    NOMI,

    /**
     * One of the owners of the property. The ownership can be split among several owners, and only the primary owner gives its address and account details for the registration.
     * 
     */
    SECO;

    public String value() {
        return name();
    }

    public static AccountOwnerType1Code fromValue(String v) {
        return valueOf(v);
    }

}
