
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementReportType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SettlementReportType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIPO"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="INPO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementReportType1Code")
@XmlEnum
public enum SettlementReportType1Code {


    /**
     * Final settlement position.
     * 
     */
    FIPO,

    /**
     * Other type of settlement report defined at national level.
     * 
     */
    OTHN,

    /**
     * Other settlement report defined at private level.
     * 
     */
    OTHP,

    /**
     * Interim settlement position.
     * 
     */
    INPO;

    public String value() {
        return name();
    }

    public static SettlementReportType1Code fromValue(String v) {
        return valueOf(v);
    }

}
