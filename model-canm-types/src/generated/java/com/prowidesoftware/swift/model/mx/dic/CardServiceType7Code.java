
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardServiceType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardServiceType7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KYDL"/>
 *     <enumeration value="DEKY"/>
 *     <enumeration value="RQKY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardServiceType7Code")
@XmlEnum
public enum CardServiceType7Code {


    /**
     * Convey the key to the receiver.
     * 
     */
    KYDL,

    /**
     * Deactivate the specified key.
     * 
     */
    DEKY,

    /**
     * Request new key to be generated and conveyed.
     * 
     */
    RQKY;

    public String value() {
        return name();
    }

    public static CardServiceType7Code fromValue(String v) {
        return valueOf(v);
    }

}
