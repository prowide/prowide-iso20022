
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentificationType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CDCO"/&gt;
 *     &lt;enumeration value="CFET"/&gt;
 *     &lt;enumeration value="RICC"/&gt;
 *     &lt;enumeration value="USDE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IdentificationType2Code")
@XmlEnum
public enum IdentificationType2Code {


    /**
     * CDC is an abbreviation of China Central Depository & Clearing Co, Ltd, an entity undertake functions of centralized depository and settlement for inter-bank bond market in China.
     * 
     */
    CDCO,

    /**
     * CFETS is an abbreviation of China Foreign Exchange Trade System, which is a sub-institution of the PBC. Its main functions include: providing systems for FX trading, RMB lending, bond trading and exchange rate and interest rate derivatives trading; organizing FX trading, RMB lending, bond trading, and exchange rate and interest rate derivatives trading; providing clearing, information, risk management, and surveillance services on interbank markets; and engaging in other businesses authorized by the PBC.
     * 
     */
    CFET,

    /**
     * RIC Code is an abbreviation of Reuters Instrument Code. RIC as encoding rule which has been wildly adopted in FX market and defines information including trading category, tenor, trade instrument and so on.
     * 
     */
    RICC,

    /**
     * User defined code.
     * 
     */
    USDE;

    public String value() {
        return name();
    }

    public static IdentificationType2Code fromValue(String v) {
        return valueOf(v);
    }

}
