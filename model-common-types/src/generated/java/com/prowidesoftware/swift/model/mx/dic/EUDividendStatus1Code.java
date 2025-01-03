
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EUDividendStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EUDividendStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DIVI"/>
 *     <enumeration value="DIVO"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
