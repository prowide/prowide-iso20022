
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentRemoval1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinancialInstrumentRemoval1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXTN"/&gt;
 *     &lt;enumeration value="REMO"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FinancialInstrumentRemoval1Code")
@XmlEnum
public enum FinancialInstrumentRemoval1Code {


    /**
     * Removal period for the financial instrument from the collateral pool must be extended.
     * 
     */
    EXTN,

    /**
     * Financial instrument must be removed from the collateral pool.
     * 
     */
    REMO,

    /**
     * Financial instrument removal is termintated.
     * 
     */
    TERM;

    public String value() {
        return name();
    }

    public static FinancialInstrumentRemoval1Code fromValue(String v) {
        return valueOf(v);
    }

}
