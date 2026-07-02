
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatusUpdateInstruction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountStatusUpdateInstruction1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLOS"/&gt;
 *     &lt;enumeration value="REAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
