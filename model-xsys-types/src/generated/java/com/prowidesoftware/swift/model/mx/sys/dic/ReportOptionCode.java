
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportOptionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportOptionCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Full"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReportOptionCode")
@XmlEnum
public enum ReportOptionCode {

    @XmlEnumValue("Full")
    FULL("Full");
    private final String value;

    ReportOptionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportOptionCode fromValue(String v) {
        for (ReportOptionCode c: ReportOptionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
