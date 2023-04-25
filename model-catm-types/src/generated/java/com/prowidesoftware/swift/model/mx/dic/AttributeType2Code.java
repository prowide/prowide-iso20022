
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AttributeType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EMAL"/>
 *     <enumeration value="CHLG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AttributeType2Code")
@XmlEnum
public enum AttributeType2Code {


    /**
     * Email address of the certificate subject.
     * 
     */
    EMAL,

    /**
     * Password by which an entity may request certificate revocation.
     * 
     */
    CHLG;

    public String value() {
        return name();
    }

    public static AttributeType2Code fromValue(String v) {
        return valueOf(v);
    }

}
