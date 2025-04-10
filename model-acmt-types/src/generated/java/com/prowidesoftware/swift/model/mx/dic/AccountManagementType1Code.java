
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountManagementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountManagementType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCO"/>
 *     <enumeration value="ACCM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountManagementType1Code")
@XmlEnum
public enum AccountManagementType1Code {


    /**
     * Refers to an account opening instruction message.
     * 
     */
    ACCO,

    /**
     * Refers to an account modification instruction message.
     * 
     */
    ACCM;

    public String value() {
        return name();
    }

    public static AccountManagementType1Code fromValue(String v) {
        return valueOf(v);
    }

}
