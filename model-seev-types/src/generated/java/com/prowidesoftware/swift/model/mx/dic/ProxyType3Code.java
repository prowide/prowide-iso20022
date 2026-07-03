
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProxyType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProxyType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHRM"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="NEPR"/&gt;
 *     &lt;enumeration value="HLDR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
