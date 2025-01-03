
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HS25"/>
 *     <enumeration value="HS38"/>
 *     <enumeration value="HS51"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm5Code")
@XmlEnum
public enum Algorithm5Code {


    /**
     * Message digest algorithm SHA-256 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha256).
     * 
     */
    @XmlEnumValue("HS25")
    HS_25("HS25"),

    /**
     * Message digest algorithm SHA-384 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha384).
     * 
     */
    @XmlEnumValue("HS38")
    HS_38("HS38"),

    /**
     * Message digest algorithm SHA-512 as defined in FIPS 180-1 and 2 - (ASN.1 Object Identifier: id-sha512).
     * 
     */
    @XmlEnumValue("HS51")
    HS_51("HS51");
    private final String value;

    Algorithm5Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm5Code fromValue(String v) {
        for (Algorithm5Code c: Algorithm5Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
