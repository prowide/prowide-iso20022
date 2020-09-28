
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingPeriodType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportingPeriodType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QTR1"/&gt;
 *     &lt;enumeration value="QTR4"/&gt;
 *     &lt;enumeration value="QTR2"/&gt;
 *     &lt;enumeration value="QTR3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportingPeriodType1Code")
@XmlEnum
public enum ReportingPeriodType1Code {


    /**
     * Reporting is related to the first quarter of the period.
     * 
     */
    @XmlEnumValue("QTR1")
    QTR_1("QTR1"),

    /**
     * Reporting is related to the forth quarter of the period.
     * 
     */
    @XmlEnumValue("QTR4")
    QTR_4("QTR4"),

    /**
     * Reporting is related to the second quarter of the period.
     * 
     */
    @XmlEnumValue("QTR2")
    QTR_2("QTR2"),

    /**
     * Reporting is related to the third quarter of the period.
     * 
     */
    @XmlEnumValue("QTR3")
    QTR_3("QTR3");
    private final String value;

    ReportingPeriodType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportingPeriodType1Code fromValue(String v) {
        for (ReportingPeriodType1Code c: ReportingPeriodType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
