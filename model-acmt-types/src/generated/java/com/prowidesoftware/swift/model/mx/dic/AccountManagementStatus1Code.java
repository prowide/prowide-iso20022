
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountManagementStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountManagementStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RECE"/>
 *     <enumeration value="ACCP"/>
 *     <enumeration value="EXEC"/>
 *     <enumeration value="STNP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountManagementStatus1Code")
@XmlEnum
public enum AccountManagementStatus1Code {


    /**
     * The account management instruction has been received and is acknowledged.
     * 
     */
    RECE,

    /**
     * The account management instruction has been validated and accepted.
     * 
     */
    ACCP,

    /**
     * The account management instruction is being processed and the confirmation will follow.
     * 
     */
    EXEC,

    /**
     * The account management instruction has been sent to the next party, for example, the next intermediary.
     * 
     */
    STNP;

    public String value() {
        return name();
    }

    public static AccountManagementStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
