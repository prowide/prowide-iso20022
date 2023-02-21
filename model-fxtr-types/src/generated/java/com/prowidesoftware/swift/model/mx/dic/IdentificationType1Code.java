
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentificationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BASC"/&gt;
 *     &lt;enumeration value="BICO"/&gt;
 *     &lt;enumeration value="CFET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IdentificationType1Code")
@XmlEnum
public enum IdentificationType1Code {


    /**
     * Specified source is bank.
     * 
     */
    BASC,

    /**
     * BIC code defines as a standard format of business identifier code. It is a unique identification code for both financial and non-financial institutions.
     * 
     */
    BICO,

    /**
     * CFETS is an abbreviation of China Foreign Exchange Trade System, which is a sub-institution of the PBC. Its main functions include: providing systems for FX trading, RMB lending, bond trading and exchange rate and interest rate derivatives trading; organizing FX trading, RMB lending, bond trading, and exchange rate and interest rate derivatives trading; providing clearing, information, risk management, and surveillance services on interbank markets; and engaging in other businesses authorized by the PBC.
     * 
     */
    CFET;

    public String value() {
        return name();
    }

    public static IdentificationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
