
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IPNW"/&gt;
 *     &lt;enumeration value="PSTN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkType1Code")
@XmlEnum
public enum NetworkType1Code {


    /**
     * Protocol of an IP network.
     * 
     */
    IPNW,

    /**
     * Protocol of a Public Switched Telephone Network (PSTN).
     * 
     */
    PSTN;

    public String value() {
        return name();
    }

    public static NetworkType1Code fromValue(String v) {
        return valueOf(v);
    }

}
