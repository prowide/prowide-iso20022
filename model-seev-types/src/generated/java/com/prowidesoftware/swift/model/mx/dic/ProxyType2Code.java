
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProxyType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProxyType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CHRM"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="HLDR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProxyType2Code")
@XmlEnum
public enum ProxyType2Code {


    /**
     * Chairman of the meeting is the proxy.
     * 
     */
    CHRM,

    /**
     * Any type of proxy is allowed.
     * 
     */
    DISC,

    /**
     * Proxy can only be a security holder.
     * 
     */
    HLDR;

    public String value() {
        return name();
    }

    public static ProxyType2Code fromValue(String v) {
        return valueOf(v);
    }

}
