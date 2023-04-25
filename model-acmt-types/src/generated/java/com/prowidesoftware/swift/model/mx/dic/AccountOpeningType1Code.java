
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountOpeningType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountOpeningType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NEWA"/>
 *     <enumeration value="SUPA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountOpeningType1Code")
@XmlEnum
public enum AccountOpeningType1Code {


    /**
     * Account request is to open a new account.
     * 
     */
    NEWA,

    /**
     * Account request is to open a supplementary account, that is, based on an existing account.
     * 
     */
    SUPA;

    public String value() {
        return name();
    }

    public static AccountOpeningType1Code fromValue(String v) {
        return valueOf(v);
    }

}
