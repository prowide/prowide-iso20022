
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportOption">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Input"/>
 *     <enumeration value="Output"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReportOption")
@XmlEnum
public enum ReportOption {

    @XmlEnumValue("Input")
    INPUT("Input"),
    @XmlEnumValue("Output")
    OUTPUT("Output");
    private final String value;

    ReportOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportOption fromValue(String v) {
        for (ReportOption c: ReportOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
