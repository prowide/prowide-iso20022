
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountManagementType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountManagementType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCO"/&gt;
 *     &lt;enumeration value="ACCM"/&gt;
 *     &lt;enumeration value="GACC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
