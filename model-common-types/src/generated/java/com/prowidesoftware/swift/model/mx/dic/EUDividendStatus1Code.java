
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EUDividendStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EUDividendStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIVI"/&gt;
 *     &lt;enumeration value="DIVO"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EUDividendStatus1Code")
@XmlEnum
public enum EUDividendStatus1Code {


    /**
     * Dividend is in the scope of the directive.
     * 
     */
    DIVI,

    /**
     * Dividend is out of the scope of the directive.
     * 
     */
    DIVO,

    /**
     * Unknown whether the dividend is in or out of the scope of the directive.
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static EUDividendStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
