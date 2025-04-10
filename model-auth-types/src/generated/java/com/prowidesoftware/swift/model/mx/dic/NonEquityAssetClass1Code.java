
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEquityAssetClass1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NonEquityAssetClass1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SDRV"/>
 *     <enumeration value="IRDV"/>
 *     <enumeration value="FEXD"/>
 *     <enumeration value="EQDV"/>
 *     <enumeration value="EADV"/>
 *     <enumeration value="EMAL"/>
 *     <enumeration value="CRDV"/>
 *     <enumeration value="CFDS"/>
 *     <enumeration value="COMD"/>
 *     <enumeration value="C10D"/>
 *     <enumeration value="BOND"/>
 *     <enumeration value="ETCS"/>
 *     <enumeration value="ETNS"/>
 *     <enumeration value="SFPS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NonEquityAssetClass1Code")
@XmlEnum
public enum NonEquityAssetClass1Code {


    /**
     * Securitised derivative.
     * 
     */
    SDRV("SDRV"),

    /**
     * Interest rate derivative.
     * 
     */
    IRDV("IRDV"),

    /**
     * Foreign exchange derivative.
     * 
     */
    FEXD("FEXD"),

    /**
     * Equity derivative.
     * 
     */
    EQDV("EQDV"),

    /**
     * Emission allowance derivative.
     * 
     */
    EADV("EADV"),

    /**
     * Emission allowance.
     * 
     */
    EMAL("EMAL"),

    /**
     * Credit derivative.
     * 
     */
    CRDV("CRDV"),

    /**
     * Contract for difference.
     * 
     */
    CFDS("CFDS"),

    /**
     * Commodity derivative.
     * 
     */
    COMD("COMD"),

    /**
     * C10 derivative.
     * 
     */
    @XmlEnumValue("C10D")
    C_10_D("C10D"),

    /**
     * Bond.
     * 
     */
    BOND("BOND"),

    /**
     * Exchange traded commodities.
     * 
     */
    ETCS("ETCS"),

    /**
     * Exchange traded note.
     * 
     */
    ETNS("ETNS"),

    /**
     * Structured finance product.
     * 
     */
    SFPS("SFPS");
    private final String value;

    NonEquityAssetClass1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonEquityAssetClass1Code fromValue(String v) {
        for (NonEquityAssetClass1Code c: NonEquityAssetClass1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
