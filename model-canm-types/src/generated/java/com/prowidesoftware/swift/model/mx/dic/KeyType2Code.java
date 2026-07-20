
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="KeyType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PTKA"/>
 *     <enumeration value="PTKI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "KeyType2Code")
@XmlEnum
public enum KeyType2Code {


    /**
     * PIN translation key applicable to the acquirer
     * 
     */
    PTKA,

    /**
     * PIN translation key applicable to the issuer
     * 
     */
    PTKI;

    public String value() {
        return name();
    }

    public static KeyType2Code fromValue(String v) {
        return valueOf(v);
    }

}
