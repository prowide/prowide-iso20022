
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportPeriodActivity3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportPeriodActivity3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOTX"/>
 *     <enumeration value="NORA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
