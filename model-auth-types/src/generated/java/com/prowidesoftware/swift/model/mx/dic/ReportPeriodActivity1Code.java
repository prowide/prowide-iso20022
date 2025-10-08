
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportPeriodActivity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportPeriodActivity1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOTX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportPeriodActivity1Code")
@XmlEnum
public enum ReportPeriodActivity1Code {


    /**
     * No transaction has been identified during the period.
     * 
     */
    NOTX;

    public String value() {
        return name();
    }

    public static ReportPeriodActivity1Code fromValue(String v) {
        return valueOf(v);
    }

}
