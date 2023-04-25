
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProxyNotAllowed1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProxyNotAllowed1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NPRO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProxyNotAllowed1Code")
@XmlEnum
public enum ProxyNotAllowed1Code {


    /**
     * Proxy not allowed.
     * 
     */
    NPRO;

    public String value() {
        return name();
    }

    public static ProxyNotAllowed1Code fromValue(String v) {
        return valueOf(v);
    }

}
