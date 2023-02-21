
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountLevel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountLevel1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTM"/&gt;
 *     &lt;enumeration value="SMRY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountLevel1Code")
@XmlEnum
public enum AccountLevel1Code {


    /**
     * Intermediate level within an account hierarchy.
     * 
     */
    INTM,

    /**
     * Highest level within an account hierarchy.
     * 
     */
    SMRY;

    public String value() {
        return name();
    }

    public static AccountLevel1Code fromValue(String v) {
        return valueOf(v);
    }

}
