
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Input"/&gt;
 *     &lt;enumeration value="Output"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
