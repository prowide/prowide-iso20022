
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="CHLG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
