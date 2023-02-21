
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINFormat1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PINFormat1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ISO0"/&gt;
 *     &lt;enumeration value="ISO1"/&gt;
 *     &lt;enumeration value="ISO2"/&gt;
 *     &lt;enumeration value="ISO3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PINFormat1Code")
@XmlEnum
public enum PINFormat1Code {


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
    ISO_3("ISO3");
    private final String value;

    PINFormat1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PINFormat1Code fromValue(String v) {
        for (PINFormat1Code c: PINFormat1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
