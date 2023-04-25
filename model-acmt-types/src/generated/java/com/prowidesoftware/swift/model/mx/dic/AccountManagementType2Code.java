
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountManagementType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountManagementType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCO"/>
 *     <enumeration value="ACCM"/>
 *     <enumeration value="GACC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountManagementType2Code")
@XmlEnum
public enum AccountManagementType2Code {


    /**
     * Refers to an account opening instruction message.
     * 
     */
    ACCO,

    /**
     * Refers to an account modification instruction message.
     * 
     */
    ACCM,

    /**
     * Refers to a get account details message.
     * 
     */
    GACC;

    public String value() {
        return name();
    }

    public static AccountManagementType2Code fromValue(String v) {
        return valueOf(v);
    }

}
