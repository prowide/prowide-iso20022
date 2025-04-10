
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackFormat1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackFormat1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AAMV"/&gt;
 *     &lt;enumeration value="CMC7"/&gt;
 *     &lt;enumeration value="E13B"/&gt;
 *     &lt;enumeration value="ISOF"/&gt;
 *     &lt;enumeration value="JIS1"/&gt;
 *     &lt;enumeration value="JIS2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
