
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountManagementStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountManagementStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="ACCP"/&gt;
 *     &lt;enumeration value="EXEC"/&gt;
 *     &lt;enumeration value="STNP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * The account management instruction has been sent to the next party, eg, the next intermediary.
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
