
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingAccountType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ClearingAccountType4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLIE"/>
 *     <enumeration value="HOUS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClearingAccountType4Code")
@XmlEnum
public enum ClearingAccountType4Code {


    /**
     * Specifies that the account is used to register trades executed for the clearing member's customers.
     * 
     */
    CLIE,

    /**
     * Specifies that the account is used to register trades executed for either the clearing member or its subsidiaries.
     * 
     */
    HOUS;

    public String value() {
        return name();
    }

    public static ClearingAccountType4Code fromValue(String v) {
        return valueOf(v);
    }

}
