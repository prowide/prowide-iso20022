
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEquityInstrumentReportingClassification1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonEquityInstrumentReportingClassification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SFPS"/&gt;
 *     &lt;enumeration value="SDRV"/&gt;
 *     &lt;enumeration value="DERV"/&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="BOND"/&gt;
 *     &lt;enumeration value="ETCS"/&gt;
 *     &lt;enumeration value="ETNS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
