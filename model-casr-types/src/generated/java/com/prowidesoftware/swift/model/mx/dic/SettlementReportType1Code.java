
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementReportType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementReportType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIPO"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="INPO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
