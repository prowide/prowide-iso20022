
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingAccountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ClearingAccountType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HOUS"/>
 *     <enumeration value="CLIE"/>
 *     <enumeration value="LIPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClearingAccountType1Code")
@XmlEnum
public enum ClearingAccountType1Code {


    /**
     * Specifies that the account is used to register trades executed for either the clearing member or its subsidiaries.
     * 
     */
    HOUS,

    /**
     * Specifies that the account is used to register trades executed for the clearing member's customers.
     * 
     */
    CLIE,

    /**
     * Specifies that the account is used to register trades executed for liquidity providers (also known as market maker) activities.
     * 
     */
    LIPR;

    public String value() {
        return name();
    }

    public static ClearingAccountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
