
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProxyType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProxyType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CHRM"/>
 *     <enumeration value="DISC"/>
 *     <enumeration value="NEPR"/>
 *     <enumeration value="HLDR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProxyType3Code")
@XmlEnum
public enum ProxyType3Code {


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
     * Neutral proxy nominated by the issuer to execute votes on behalf of investors at the meeting.
     * 
     */
    NEPR,

    /**
     * Proxy can only be a security holder.
     * 
     */
    HLDR;

    public String value() {
        return name();
    }

    public static ProxyType3Code fromValue(String v) {
        return valueOf(v);
    }

}
