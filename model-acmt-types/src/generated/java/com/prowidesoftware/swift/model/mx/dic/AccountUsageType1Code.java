
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountUsageType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountUsageType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *     &lt;enumeration value="SETP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountUsageType1Code")
@XmlEnum
public enum AccountUsageType1Code {


    /**
     * Investor.
     * 
     */
    INVE,

    /**
     * Settlement participant.
     * 
     */
    SETP;

    public String value() {
        return name();
    }

    public static AccountUsageType1Code fromValue(String v) {
        return valueOf(v);
    }

}
