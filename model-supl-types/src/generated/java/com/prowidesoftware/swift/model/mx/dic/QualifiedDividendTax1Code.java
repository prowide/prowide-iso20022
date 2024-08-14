
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualifiedDividendTax1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="QualifiedDividendTax1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FQUD"/>
 *     <enumeration value="PQUD"/>
 *     <enumeration value="NQUD"/>
 *     <enumeration value="UKWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "QualifiedDividendTax1Code")
@XmlEnum
public enum QualifiedDividendTax1Code {


    /**
     * Dividend income is potentially qualified (for instance common or preferred stock dividends, income distribution by mutual funds).
     * 
     */
    FQUD,

    /**
     * Part of dividend income is potentially qualified (for instance income form a mutual fund which holds both stocks and bonds).
     * 
     */
    PQUD,

    /**
     * Dividend is not qualified (for instance UIT dividends, REIT dividends).
     * 
     */
    NQUD,

    /**
     * Qualified dividend tax status is unknown (for instance if dividend tax status information is unavailable at the time of the dividend update, it will be provided when new information is received).
     * 
     */
    UKWN;

    public String value() {
        return name();
    }

    public static QualifiedDividendTax1Code fromValue(String v) {
        return valueOf(v);
    }

}
