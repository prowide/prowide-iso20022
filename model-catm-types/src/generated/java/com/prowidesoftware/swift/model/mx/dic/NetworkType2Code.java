
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SCK5"/&gt;
 *     &lt;enumeration value="SCK4"/&gt;
 *     &lt;enumeration value="HTTP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkType2Code")
@XmlEnum
public enum NetworkType2Code {


    /**
     * Sock5 proxy.
     * 
     */
    @XmlEnumValue("SCK5")
    SCK_5("SCK5"),

    /**
     * Sock4 proxy.
     * 
     */
    @XmlEnumValue("SCK4")
    SCK_4("SCK4"),

    /**
     * HTTP proxy.
     * 
     */
    HTTP("HTTP");
    private final String value;

    NetworkType2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkType2Code fromValue(String v) {
        for (NetworkType2Code c: NetworkType2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
