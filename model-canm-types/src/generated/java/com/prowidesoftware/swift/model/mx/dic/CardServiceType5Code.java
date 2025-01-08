
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardServiceType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardServiceType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KYDL"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="DEKY"/>
 *     <enumeration value="RQKY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardServiceType5Code")
@XmlEnum
public enum CardServiceType5Code {


    /**
     * Convey the key to the receiver.
     * 
     */
    KYDL,

    /**
     * National defined code.
     * 
     */
    OTHN,

    /**
     * Private defined code.
     * 
     */
    OTHP,

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

    public static CardServiceType5Code fromValue(String v) {
        return valueOf(v);
    }

}
