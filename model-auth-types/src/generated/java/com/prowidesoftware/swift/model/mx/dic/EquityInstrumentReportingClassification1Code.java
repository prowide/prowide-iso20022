
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquityInstrumentReportingClassification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EquityInstrumentReportingClassification1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SHRS"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="ETFS"/>
 *     <enumeration value="DPRS"/>
 *     <enumeration value="CRFT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EquityInstrumentReportingClassification1Code")
@XmlEnum
public enum EquityInstrumentReportingClassification1Code {


    /**
     * Contract is of type shares.
     * 
     */
    SHRS,

    /**
     * Contract is of type other equity-like financial instrument.
     * 
     */
    OTHR,

    /**
     * Contract is of type electronic traded funds.
     * 
     */
    ETFS,

    /**
     * Contract is of type depositary receipt.
     * 
     */
    DPRS,

    /**
     * Contract is of type certificates.
     * 
     */
    CRFT;

    public String value() {
        return name();
    }

    public static EquityInstrumentReportingClassification1Code fromValue(String v) {
        return valueOf(v);
    }

}
