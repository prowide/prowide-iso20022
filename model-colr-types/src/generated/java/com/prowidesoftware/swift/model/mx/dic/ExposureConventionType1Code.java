
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureConventionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureConventionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GROS"/&gt;
 *     &lt;enumeration value="NET1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExposureConventionType1Code")
@XmlEnum
public enum ExposureConventionType1Code {


    /**
     * Indicates that the exposed amount to party A and B will be netted together for the variation margin calculation, and then two separate variation margin requirements will be determined.
     * 
     */
    GROS("GROS"),

    /**
     * Indicates that the exposed amount to party A and B will be netted together for the variation margin calculation.
     * 
     */
    @XmlEnumValue("NET1")
    NET_1("NET1");
    private final String value;

    ExposureConventionType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExposureConventionType1Code fromValue(String v) {
        for (ExposureConventionType1Code c: ExposureConventionType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
