
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountPermissionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountPermissionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NORI"/>
 *     <enumeration value="RIAL"/>
 *     <enumeration value="RIWI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountPermissionType1Code")
@XmlEnum
public enum AccountPermissionType1Code {


    /**
     * No right to use the account.
     * 
     */
    NORI,

    /**
     * Right to use the account alone.
     * 
     */
    RIAL,

    /**
     * Right to use the account together with another person.
     * 
     */
    RIWI;

    public String value() {
        return name();
    }

    public static AccountPermissionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
