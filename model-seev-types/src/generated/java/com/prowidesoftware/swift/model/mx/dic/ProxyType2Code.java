
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProxyType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProxyType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHRM"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="HLDR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Any type of proxy is allowed
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
