
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportItemStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReportItemStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPD"/>
 *     <enumeration value="REJT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReportItemStatus1Code")
@XmlEnum
public enum ReportItemStatus1Code {


    /**
     * Entry has been accepted by the receiver of the report.
     * 
     */
    ACPD,

    /**
     * Entry has been rejected by the receiver of the report.
     * 
     */
    REJT;

    public String value() {
        return name();
    }

    public static ReportItemStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
