
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountLevel2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountLevel2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTM"/&gt;
 *     &lt;enumeration value="SMRY"/&gt;
 *     &lt;enumeration value="DETL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
