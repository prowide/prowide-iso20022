
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINFormat2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PINFormat2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ISO0"/&gt;
 *     &lt;enumeration value="ISO1"/&gt;
 *     &lt;enumeration value="ISO2"/&gt;
 *     &lt;enumeration value="ISO3"/&gt;
 *     &lt;enumeration value="ISO4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PINFormat2Code")
@XmlEnum
public enum PINFormat2Code {


    /**
     * PIN diversified with the card account number, conforming to the standard ISO 9564-2.
     * 
     */
    @XmlEnumValue("ISO0")
    ISO_0("ISO0"),

    /**
     * PIN completed with random padding characters, conforming to the standard ISO 9564-2.
     * 
     */
    @XmlEnumValue("ISO1")
    ISO_1("ISO1"),

    /**
     * PIN without diversification characters, conforming to the standard ISO 9564-2.
     * 
     */
    @XmlEnumValue("ISO2")
    ISO_2("ISO2"),

    /**
     * PIN diversified with the card account number and random characters, conforming to the standard ISO 9564-2.
     * 
     */
    @XmlEnumValue("ISO3")
    ISO_3("ISO3"),

    /**
     * PIN format used with AES encryption, conforming to the new ISO SC2 format.
     * 
     */
    @XmlEnumValue("ISO4")
    ISO_4("ISO4");
    private final String value;

    PINFormat2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PINFormat2Code fromValue(String v) {
        for (PINFormat2Code c: PINFormat2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
