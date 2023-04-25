
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountLevel2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountLevel2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INTM"/>
 *     <enumeration value="SMRY"/>
 *     <enumeration value="DETL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountLevel2Code")
@XmlEnum
public enum AccountLevel2Code {


    /**
     * Intermediate level within an account hierarchy.
     * 
     */
    INTM,

    /**
     * Highest level within an account hierarchy.
     * 
     */
    SMRY,

    /**
     * Account is a real deposit/current account.
     * 
     */
    DETL;

    public String value() {
        return name();
    }

    public static AccountLevel2Code fromValue(String v) {
        return valueOf(v);
    }

}
