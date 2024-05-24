
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProxyNotAllowedCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProxyNotAllowedCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NPRO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProxyNotAllowedCode")
@XmlEnum
public enum ProxyNotAllowedCode {


    /**
     * Proxy not allowed.
     * 
     */
    NPRO;

    public String value() {
        return name();
    }

    public static ProxyNotAllowedCode fromValue(String v) {
        return valueOf(v);
    }

}
