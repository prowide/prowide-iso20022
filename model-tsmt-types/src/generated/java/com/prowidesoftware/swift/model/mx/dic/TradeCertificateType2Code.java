
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeCertificateType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradeCertificateType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BENE"/>
 *     <enumeration value="SHIP"/>
 *     <enumeration value="UND1"/>
 *     <enumeration value="UND2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradeCertificateType2Code")
@XmlEnum
public enum TradeCertificateType2Code {


    /**
     * Beneficiary certificate.
     * 
     */
    BENE("BENE"),

    /**
     * Shipping line certificate.
     * 
     */
    SHIP("SHIP"),

    /**
     * Undefined certificate at this stage.
     * 
     */
    @XmlEnumValue("UND1")
    UND_1("UND1"),

    /**
     * Undefined certificate at this stage.
     * 
     */
    @XmlEnumValue("UND2")
    UND_2("UND2");
    private final String value;

    TradeCertificateType2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TradeCertificateType2Code fromValue(String v) {
        for (TradeCertificateType2Code c: TradeCertificateType2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
