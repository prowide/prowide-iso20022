
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquityInstrumentReportingClassification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EquityInstrumentReportingClassification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SHRS"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="ETFS"/&gt;
 *     &lt;enumeration value="DPRS"/&gt;
 *     &lt;enumeration value="CRFT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
