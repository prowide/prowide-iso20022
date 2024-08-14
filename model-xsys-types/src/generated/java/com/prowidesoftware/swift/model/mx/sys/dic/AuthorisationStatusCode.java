
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorisationStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AuthorisationStatusCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Authorised"/>
 *     <enumeration value="Refused"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AuthorisationStatusCode")
@XmlEnum
public enum AuthorisationStatusCode {

    @XmlEnumValue("Authorised")
    AUTHORISED("Authorised"),
    @XmlEnumValue("Refused")
    REFUSED("Refused");
    private final String value;

    AuthorisationStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorisationStatusCode fromValue(String v) {
        for (AuthorisationStatusCode c: AuthorisationStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
