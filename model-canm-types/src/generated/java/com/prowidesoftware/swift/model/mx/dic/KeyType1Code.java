
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="KeyType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PTKA"/>
 *     <enumeration value="PTKI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "KeyType1Code")
@XmlEnum
public enum KeyType1Code {


    /**
     * Other national
     * 
     */
    OTHN,

    /**
     * Other private
     * 
     */
    OTHP,

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

    public static KeyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
