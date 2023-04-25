
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FWIS"/>
 *     <enumeration value="FWRE"/>
 *     <enumeration value="FWAM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReportType1Code")
@XmlEnum
public enum ReportType1Code {


    /**
     * The report contains a baseline submitted for the first time.
     * 
     */
    FWIS,

    /**
     * The report contains a baseline that is resubmitted.
     * 
     */
    FWRE,

    /**
     * The report contains a baseline that is amended.
     * 
     */
    FWAM;

    public String value() {
        return name();
    }

    public static ReportType1Code fromValue(String v) {
        return valueOf(v);
    }

}
