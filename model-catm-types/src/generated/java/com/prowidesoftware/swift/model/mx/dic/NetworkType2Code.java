
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NetworkType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SCK5"/>
 *     <enumeration value="SCK4"/>
 *     <enumeration value="HTTP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
