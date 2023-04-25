
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackFormat1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TrackFormat1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AAMV"/>
 *     <enumeration value="CMC7"/>
 *     <enumeration value="E13B"/>
 *     <enumeration value="ISOF"/>
 *     <enumeration value="JIS1"/>
 *     <enumeration value="JIS2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TrackFormat1Code")
@XmlEnum
public enum TrackFormat1Code {


    /**
     * American driver license.
     * 
     */
    AAMV("AAMV"),

    /**
     * Magnetic Ink Character Recognition, using the CMC-7 font - ISO 1004 Line at the bottom of a check containing the bank account and the check number.
     * 
     */
    @XmlEnumValue("CMC7")
    CMC_7("CMC7"),

    /**
     * Magnetic Ink Character Recognition, using the E-13B font) Line at the bottom of a check containing the bank account and the check number.
     * 
     */
    @XmlEnumValue("E13B")
    E_13_B("E13B"),

    /**
     * ISO card track format - ISO 7813 - ISO 4909.
     * 
     */
    ISOF("ISOF"),

    /**
     * Japanese track format I.
     * 
     */
    @XmlEnumValue("JIS1")
    JIS_1("JIS1"),

    /**
     * Japanese track format II.
     * 
     */
    @XmlEnumValue("JIS2")
    JIS_2("JIS2");
    private final String value;

    TrackFormat1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackFormat1Code fromValue(String v) {
        for (TrackFormat1Code c: TrackFormat1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
