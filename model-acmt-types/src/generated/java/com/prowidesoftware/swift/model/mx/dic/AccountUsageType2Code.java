
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountUsageType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountUsageType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *     &lt;enumeration value="ISSP"/&gt;
 *     &lt;enumeration value="SETP"/&gt;
 *     &lt;enumeration value="TRDP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountUsageType2Code")
@XmlEnum
public enum AccountUsageType2Code {


    /**
     * Investor.
     * 
     */
    INVE,

    /**
     * Issuing participant.
     * 
     */
    ISSP,

    /**
     * Settlement participant.
     * 
     */
    SETP,

    /**
     * Trading participant.
     * 
     */
    TRDP;

    public String value() {
        return name();
    }

    public static AccountUsageType2Code fromValue(String v) {
        return valueOf(v);
    }

}
