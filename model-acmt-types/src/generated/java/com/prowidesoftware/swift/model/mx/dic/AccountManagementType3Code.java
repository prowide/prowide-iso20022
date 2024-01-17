
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountManagementType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountManagementType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCM"/>
 *     <enumeration value="ACCO"/>
 *     <enumeration value="GACC"/>
 *     <enumeration value="ACST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
