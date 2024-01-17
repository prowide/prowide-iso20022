
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatusUpdateInstruction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountStatusUpdateInstruction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLOS"/>
 *     <enumeration value="REAC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountStatusUpdateInstruction1Code")
@XmlEnum
public enum AccountStatusUpdateInstruction1Code {


    /**
     * Account is to be closed.
     * 
     */
    CLOS,

    /**
     * Account is to be reactivated, any previous instruction to close the account is rescinded.
     * 
     */
    REAC;

    public String value() {
        return name();
    }

    public static AccountStatusUpdateInstruction1Code fromValue(String v) {
        return valueOf(v);
    }

}
