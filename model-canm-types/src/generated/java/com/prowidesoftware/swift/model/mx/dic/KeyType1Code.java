
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PTKA"/&gt;
 *     &lt;enumeration value="PTKI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KeyType1Code")
@XmlEnum
public enum KeyType1Code {


    /**
     * Other national
     * 
     */
    OTHN,

    /**
     * Other private
     * 
     */
    OTHP,

    /**
     * PIN translation key applicable to the acquirer
     * 
     */
    PTKA,

    /**
     * PIN translation key applicable to the issuer
     * 
     */
    PTKI;

    public String value() {
        return name();
    }

    public static KeyType1Code fromValue(String v) {
        return valueOf(v);
    }

}
