
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GDPRDataConsent1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GDPRDataConsent1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DP00"/>
 *     <enumeration value="DP03"/>
 *     <enumeration value="DP01"/>
 *     <enumeration value="DP02"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GDPRDataConsent1Code")
@XmlEnum
public enum GDPRDataConsent1Code {


    /**
     * Consent to authorise the controller of personal data processing to process personal data for marketing purposes.
     * 
     */
    @XmlEnumValue("DP00")
    DP_00("DP00"),

    /**
     * Consent to authorise the controller of personal data processing to process personal data for profiling purposes in order to formulate customised and targeted product and service offers.
     * 
     */
    @XmlEnumValue("DP03")
    DP_03("DP03"),

    /**
     * Consent to authorise the controller of personal data processing to transfer personal data to other companies belonging to the same group for independent processing for marketing purposes.
     * 
     */
    @XmlEnumValue("DP01")
    DP_01("DP01"),

    /**
     * Consent to authorise the controller of personal data processing to transfer personal data to third party companies for independent processing for marketing purposes.
     * 
     */
    @XmlEnumValue("DP02")
    DP_02("DP02");
    private final String value;

    GDPRDataConsent1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GDPRDataConsent1Code fromValue(String v) {
        for (GDPRDataConsent1Code c: GDPRDataConsent1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
