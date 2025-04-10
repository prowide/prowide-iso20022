
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatisticalReportingStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StatisticalReportingStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPT"/>
 *     <enumeration value="RJCT"/>
 *     <enumeration value="WARN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StatisticalReportingStatus2Code")
@XmlEnum
public enum StatisticalReportingStatus2Code {


    /**
     * Transaction or report has been accepted.
     * 
     */
    ACPT,

    /**
     * Transaction or report has been rejected.
     * 
     */
    RJCT,

    /**
     * Transaction has been accepted with warnings.
     * 
     */
    WARN;

    public String value() {
        return name();
    }

    public static StatisticalReportingStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
