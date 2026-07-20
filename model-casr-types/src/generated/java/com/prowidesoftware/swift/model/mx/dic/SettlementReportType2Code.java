
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementReportType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementReportType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIPO"/>
 *     <enumeration value="INPO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementReportType2Code")
@XmlEnum
public enum SettlementReportType2Code {


    /**
     * Final settlement position.
     * 
     */
    FIPO,

    /**
     * Interim settlement position.
     * 
     */
    INPO;

    public String value() {
        return name();
    }

    public static SettlementReportType2Code fromValue(String v) {
        return valueOf(v);
    }

}
