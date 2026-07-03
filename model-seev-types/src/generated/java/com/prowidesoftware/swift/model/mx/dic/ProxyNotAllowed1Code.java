
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProxyNotAllowed1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProxyNotAllowed1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NPRO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
