
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashForecastMessage1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashForecastMessage1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CF40"/&gt;
 *     &lt;enumeration value="CF42"/&gt;
 *     &lt;enumeration value="CF41"/&gt;
 *     &lt;enumeration value="CF43"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashForecastMessage1Code")
@XmlEnum
public enum CashForecastMessage1Code {


    /**
     * Fund estimated cash forecast report (camt.040).
     * 
     */
    @XmlEnumValue("CF40")
    CF_40("CF40"),

    /**
     * Fund detailed estimated cash forecast Report (042).
     * 
     */
    @XmlEnumValue("CF42")
    CF_42("CF42"),

    /**
     * Fund confirmed cash forecast report (camt.041).
     * 
     */
    @XmlEnumValue("CF41")
    CF_41("CF41"),

    /**
     * Fund detailed confirmed cash forecast report (camt.043).
     * 
     */
    @XmlEnumValue("CF43")
    CF_43("CF43");
    private final String value;

    CashForecastMessage1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CashForecastMessage1Code fromValue(String v) {
        for (CashForecastMessage1Code c: CashForecastMessage1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
