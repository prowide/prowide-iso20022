
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEquityInstrumentReportingClassification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NonEquityInstrumentReportingClassification1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SFPS"/>
 *     <enumeration value="SDRV"/>
 *     <enumeration value="DERV"/>
 *     <enumeration value="EMAL"/>
 *     <enumeration value="BOND"/>
 *     <enumeration value="ETCS"/>
 *     <enumeration value="ETNS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NonEquityInstrumentReportingClassification1Code")
@XmlEnum
public enum NonEquityInstrumentReportingClassification1Code {


    /**
     * Contract is of type structured finance products (SFPs).
     * 
     */
    SFPS,

    /**
     * Contract is of type securitised derivatives.
     * 
     */
    SDRV,

    /**
     * Contract is of type derivative.
     * 
     * 
     */
    DERV,

    /**
     * Contract is of type emission allowances.
     * 
     */
    EMAL,

    /**
     * Contract is of type bonds.
     * 
     * 
     */
    BOND,

    /**
     * Contract is of type exchange traded commodities.
     * 
     */
    ETCS,

    /**
     * Contract is of type exchange traded note.
     * 
     */
    ETNS;

    public String value() {
        return name();
    }

    public static NonEquityInstrumentReportingClassification1Code fromValue(String v) {
        return valueOf(v);
    }

}
