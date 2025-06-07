
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountManagementType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountManagementType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCM"/&gt;
 *     &lt;enumeration value="ACCO"/&gt;
 *     &lt;enumeration value="GACC"/&gt;
 *     &lt;enumeration value="ACST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountManagementType3Code")
@XmlEnum
public enum AccountManagementType3Code {


    /**
     * Refers to an account modification instruction message.
     * 
     */
    ACCM,

    /**
     * Refers to an account opening instruction message.
     * 
     */
    ACCO,

    /**
     * Refers to a get account details message.
     * 
     */
    GACC,

    /**
     * Refers to the account status.
     * 
     */
    ACST;

    public String value() {
        return name();
    }

    public static AccountManagementType3Code fromValue(String v) {
        return valueOf(v);
    }

}
