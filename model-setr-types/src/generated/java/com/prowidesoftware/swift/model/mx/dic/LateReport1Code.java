
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LateReport1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LateReport1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LAT1"/&gt;
 *     &lt;enumeration value="LAT2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LateReport1Code")
@XmlEnum
public enum LateReport1Code {


    /**
     * The confirmation is late.
     * 
     */
    @XmlEnumValue("LAT1")
    LAT_1("LAT1"),

    /**
     * The confirmation is late because the trade was executed as a number of partials.
     * 
     */
    @XmlEnumValue("LAT2")
    LAT_2("LAT2");
    private final String value;

    LateReport1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LateReport1Code fromValue(String v) {
        for (LateReport1Code c: LateReport1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
