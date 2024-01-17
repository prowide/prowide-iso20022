
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINFormat3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PINFormat3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ISO0"/>
 *     <enumeration value="ISO1"/>
 *     <enumeration value="ISO2"/>
 *     <enumeration value="ISO3"/>
 *     <enumeration value="ISO4"/>
 *     <enumeration value="ISO5"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PINFormat3Code")
@XmlEnum
public enum PINFormat3Code {


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
    ISO_4("ISO4"),

    /**
     * Alternative PIN format used with AES encryption, conforming to the new ISO SC2 format.
     * 
     */
    @XmlEnumValue("ISO5")
    ISO_5("ISO5");
    private final String value;

    PINFormat3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PINFormat3Code fromValue(String v) {
        for (PINFormat3Code c: PINFormat3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
