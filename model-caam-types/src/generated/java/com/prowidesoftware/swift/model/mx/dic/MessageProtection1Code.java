
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageProtection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageProtection1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EVLP"/>
 *     <enumeration value="MACB"/>
 *     <enumeration value="MACM"/>
 *     <enumeration value="UNPR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageProtection1Code")
@XmlEnum
public enum MessageProtection1Code {


    /**
     * Messages contain an encrypted body and a MAC or a digital signature computed on the complete message (header plus body after encryption).
     * 
     */
    EVLP,

    /**
     * Messages contain a MAC or a digital signature computed on the body only.
     * 
     */
    MACB,

    /**
     * Messages contain a MAC or a digital signature computed on the complete message (header plus body).
     * 
     */
    MACM,

    /**
     * Messages are not protected, no encryption and no MAC or digital signature.
     * 
     */
    UNPR;

    public String value() {
        return name();
    }

    public static MessageProtection1Code fromValue(String v) {
        return valueOf(v);
    }

}
