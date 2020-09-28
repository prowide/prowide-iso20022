
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportPeriodActivity3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportPeriodActivity3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOTX"/&gt;
 *     &lt;enumeration value="NORA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportPeriodActivity3Code")
@XmlEnum
public enum ReportPeriodActivity3Code {


    /**
     * No transaction has been identified during the period.
     * 
     */
    NOTX,

    /**
     * No report has been received from reporting agent.
     * 
     */
    NORA;

    public String value() {
        return name();
    }

    public static ReportPeriodActivity3Code fromValue(String v) {
        return valueOf(v);
    }

}
